package online.softwareshinobi.kanbanflow.calendar;

import jakarta.transaction.Transactional;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = {SQLException.class})
public class CalendarService {

    @Autowired
    CalendarRepository calendarRepository;

    private static final Integer SINGLETON_CALENDAR_ID = 1;

    @Transactional
    public Calendar save(Calendar calendar) {

        Optional<Calendar> existingCalendarOpt = calendarRepository.findById(SINGLETON_CALENDAR_ID);

        Calendar calendarToSave;

        if (existingCalendarOpt.isPresent()) {

            // Record exists, update it
            calendarToSave = existingCalendarOpt.get();

            System.out.println("Updating existing calendar with ID: " + SINGLETON_CALENDAR_ID);

        } else {

            // Record does not exist, create a new one
            calendarToSave = new Calendar();

            calendarToSave.setId(SINGLETON_CALENDAR_ID); // Set the predefined singleton ID

            System.out.println("Creating new calendar with ID: " + SINGLETON_CALENDAR_ID);

        }

        calendarToSave.setContent(calendar.getContent());

        return calendarRepository.save(calendarToSave);

    }

    public Calendar fetch() {

        Optional<Calendar> existingCalendarOpt = calendarRepository.findById(SINGLETON_CALENDAR_ID);

        Calendar calendarToSave;

        if (existingCalendarOpt.isPresent()) {

            calendarToSave = existingCalendarOpt.get();

            System.out.println("Updating existing calendar with ID: " + SINGLETON_CALENDAR_ID);

        } else {

            System.out.println("wasn't anything there");

            calendarToSave = new Calendar();

        }

        return calendarToSave;

    }

}

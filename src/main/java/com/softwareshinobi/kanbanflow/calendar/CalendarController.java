package com.softwareshinobi.kanbanflow.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("calendar")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    public CalendarController() {

        System.out.println("## ");
        System.out.println("## init > Calendar API");
        System.out.println("## ");

    }

    @GetMapping("")
    public Calendar getCalendar() {

        System.out.println("yo?");

        return this.calendarService.fetch();

    }

    @PutMapping("")
    public Calendar putCalendar(@RequestBody Calendar calendar) {

        return this.calendarService.save(calendar);

    }

}

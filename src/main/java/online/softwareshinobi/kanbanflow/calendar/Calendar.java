package online.softwareshinobi.kanbanflow.calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "calendar")
public class Calendar {

    private static final Logger log = LoggerFactory.getLogger(Calendar.class);

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //   @NonNull
    @Column(name = "content", columnDefinition = "LONGTEXT")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

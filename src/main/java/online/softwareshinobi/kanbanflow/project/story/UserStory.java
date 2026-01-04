package online.softwareshinobi.kanbanflow.project.story;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import online.softwareshinobi.kanbanflow.project.Project;
import online.softwareshinobi.kanbanflow.project.status.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "story")
public class UserStory {

    private static final Logger log = LoggerFactory.getLogger(UserStory.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    //   @NonNull
    @Column(name = "name")
    private String name;

    @Column(name = "detail", columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "status")
    private Status status;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserStory{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        //    sb.append(", intention=").append(intention);
        sb.append(", project=").append(project);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project getProject() {
        return project;
    }

//    public String getIntention() {
//        return intention;
//    }
//
//    public void setIntention(String intention) {
//        this.intention = intention;
//    }
    public void setProject(Project project) {
        this.project = project;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



}

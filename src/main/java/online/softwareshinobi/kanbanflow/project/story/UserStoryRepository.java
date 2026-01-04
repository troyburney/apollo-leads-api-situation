package online.softwareshinobi.kanbanflow.project.story;

import java.util.List;
import online.softwareshinobi.kanbanflow.project.status.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {

    List<UserStory> findByIdAllIgnoreCase(Long id);

    List<UserStory> findByStatus(Status status);

}

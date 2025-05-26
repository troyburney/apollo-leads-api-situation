package com.softwareshinobi.kanbanflow.task;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

     @Autowired
   Optional<Task> findByIdAllIgnoreCase(Long id);

}

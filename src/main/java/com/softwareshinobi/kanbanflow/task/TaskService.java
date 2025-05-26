package com.softwareshinobi.kanbanflow.task;

import jakarta.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = {SQLException.class})
public class TaskService {

      @Autowired
  TaskRepository toDoRepository;

    @Autowired
    public TaskService(TaskRepository projectRepository) {

        this.toDoRepository = projectRepository;

    }

    public Task save(Task project) {

        return this.toDoRepository.save(project);

    }

    public List<Task> findAll() {

        return this.toDoRepository.findAll();

    }

    public Task findById(Long id) {

        return this.toDoRepository.findById(id).orElse(null);

    }

    public void delete(Long id) {

        this.toDoRepository.deleteById(id);

    }

}

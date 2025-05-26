package com.softwareshinobi.kanbanflow.task;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("todo")
public class TaskController {

    @Autowired
    TaskService toDoService;

    public TaskController() {

        System.out.println("## ");

        System.out.println("## init > To Do APIs");

        System.out.println("## ");

    }

    @GetMapping("")
    public List<Task> findAll() {

        System.out.println("enter > findAllProjects");

        List<Task> projectList = this.toDoService.findAll();

        System.out.println("projectList / ");

        System.out.println(projectList);

        System.out.println("exit < findAllProjects");

        return projectList;

    }

    @PutMapping("")
    Task createProject(@RequestBody Task project) {

        System.out.println("enter > createProject");

        System.out.println("project / " + project);

        return this.toDoService.save(project);

    }

    @GetMapping("{id}")
    Task findById(@PathVariable Long id) {

        return this.toDoService.findById(id);

    }

    @PostMapping("update")
    public Task updateProject(@RequestBody Task project) {

        System.out.println("enter > updateProject");

        System.out.println("project / " + project);

        Task responseProject = this.toDoService.save(project);

        System.out.println("responseProject / " + responseProject);

        System.out.println("exit < updateProject");

        return responseProject;

    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {

        this.toDoService.delete(id);

    }

}

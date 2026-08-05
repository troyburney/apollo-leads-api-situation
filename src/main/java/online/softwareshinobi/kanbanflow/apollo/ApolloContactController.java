package online.softwareshinobi.kanbanflow.apollo;

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
@RequestMapping("/api/leads/apollo")
public class ApolloContactController {

    @Autowired
    ApolloContactService projectService;

    public ApolloContactController() {

        System.out.println("## ");
        System.out.println("## init > Apollo Contact APIs");
        System.out.println("## ");

    }

    @GetMapping("")
    public List<ApolloContact> findAll() {

        System.out.println("enter > findAll");

        List<ApolloContact> projectList = this.projectService.findAll();

        System.out.println("projectList / ");

        System.out.println(projectList);

        System.out.println("exit < findAll");

        return projectList;

    }

    @PutMapping("")
    public ApolloContact createProject(@RequestBody ApolloContact project) {

        System.out.println("enter > createProject");

        System.out.println("project / " + project);

        return this.projectService.save(project);

    }

    @GetMapping("{id}")
    public ApolloContact findById(@PathVariable Long id) {

        return this.projectService.findById(id);

    }

    @PostMapping("update")
    public ApolloContact updateProject(@RequestBody ApolloContact project) {

        System.out.println("enter > updateProject");

        System.out.println("ApolloContact / " + project);

        ApolloContact responseProject = this.projectService.save(project);

        System.out.println("responseProject / " + responseProject);

        System.out.println("exit < updateProject");

        return responseProject;

    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {

        this.projectService.delete(id);

    }

}

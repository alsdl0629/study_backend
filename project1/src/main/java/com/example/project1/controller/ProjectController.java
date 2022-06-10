package com.example.project1.controller;

import com.example.project1.dto.ProjectDto;
import com.example.project1.service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-project")
public class ProjectController {
    private ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping("/project/{product}")
    public ProjectDto getProject(@PathVariable String product){
        return projectService.getProject(product);
    }

    @PostMapping("/project")
    public ProjectDto createProject(@RequestBody ProjectDto projectDto){

        String product = projectDto.getProduct();
        String order = projectDto.getOrder();
        String orderList = projectDto.getOrderList();

        return projectService.saveProject(product, order, orderList);
    }

}

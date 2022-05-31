package com.example.project1.controller;

import com.example.project1.dto.ProjectDto;
import com.example.project1.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-project")
public class ProjectController {
    private final ProjectService projectService;

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

    @DeleteMapping("/project/{product}")
    public ProjectDto deleteProject(@PathVariable String product){return null;}
}

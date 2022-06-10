package com.example.project1.service;

import com.example.project1.dto.ProjectDto;
import com.example.project1.entity.ProjectEntity;
import com.example.project1.handler.ProjectDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProjectService {

    ProjectDataHandler projectDataHandler;

    @Autowired
    public ProductServiceImpl(ProjectDataHandler projectDataHandler) {
        this.projectDataHandler = projectDataHandler;
    }

    @Override
    public ProjectDto saveProject(Long id, String product, String order, String orederList) {
        ProjectEntity projectEntity = projectDataHandler.saveProjectEntity(id, product, order, orederList);

        ProjectDto projectDto = new ProjectDto(
                product.
                projectEntity.getProduct(),
                projectEntity.getOrder(), projectEntity.getOrderList());

        return projectDto;
    }

    @Override
    public ProjectDto getProject(String product) {
        ProjectEntity projectEntity = projectDataHandler.getProjectEntity(product);

        ProjectDto projectDto = new ProjectDto(projectEntity.getProduct(),
                projectEntity.getOrder(), projectEntity.getOrderList());

        return projectDto;
    }
}

package com.example.project1.service;

import com.example.project1.dto.ProjectDto;
import com.example.project1.entity.ProjectEntity;
import com.example.project1.handler.ProjectDataHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProjectService {

    ProjectDataHandler projectDataHandler;

    @Override
    public ProjectDto saveProject(String product, String order, String orederList) {
        ProjectEntity projectEntity = projectDataHandler.saveProjectEntity(product, order, orederList);

        ProjectDto projectDto = new ProjectDto(projectEntity.getProduct(),
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

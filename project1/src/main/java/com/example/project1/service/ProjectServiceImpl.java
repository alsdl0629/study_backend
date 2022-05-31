package com.example.project1.service;

import com.example.project1.dto.ProjectDto;
import com.example.project1.entity.ProjectEntity;
import com.example.project1.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;//의존성 주입 @RequiredArgsConstructor
    @Override
    public ProjectDto saveProject(String product, String order, String orederList) {
        projectDto.toEntity()
        projectRepository.save(projectEntity);
        return productDto;
    }

    @Override
    public ProjectDto getProject(String product) {
        ProjectEntity projectEntity = projectRepository.findById(product)
                .orElseThrow(() -> new IllegalArgumentException("not found"));
        return new ProjectDto(projectEntity.getProduct(), projectEntity.getOrder(), projectEntity.getOrderList());
    }
}

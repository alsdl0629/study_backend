package com.example.project1.dao;

import com.example.project1.entity.ProjectEntity;
import com.example.project1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDaoImpl implements ProjectDao {

    ProjectRepository projectRepository;

    @Autowired
    public ProjectDaoImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectEntity saveProject(ProjectEntity projectEntity) {
        projectRepository.save(projectEntity);
        return projectEntity;
    }

    @Override
    public ProjectEntity getProject(String product){
        ProjectEntity projectEntity = projectRepository.getById(product);
        return projectEntity;
    }
}

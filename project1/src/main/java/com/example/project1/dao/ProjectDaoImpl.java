package com.example.project1.dao;

import com.example.project1.entity.ProjectEntity;
import com.example.project1.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectDaoImpl implements ProjectDao {

    ProjectRepository projectRepository;

    @Override
    public ProjectEntity saveProject(ProjectEntity projectEntity) {
        projectRepository.save(projectEntity);
        return projectEntity;
    }

    @Override
    public ProjectEntity getProject(String product){
        ProjectEntity projectEntity = projectRepository.getReferenceById(product);
        return projectEntity;
    }
}

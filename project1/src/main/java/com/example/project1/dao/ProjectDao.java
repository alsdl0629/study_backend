package com.example.project1.dao;

import com.example.project1.entity.ProjectEntity;

public interface ProjectDao {

    ProjectEntity saveProject(ProjectEntity projectEntity);

    ProjectEntity getProject(String product);
}

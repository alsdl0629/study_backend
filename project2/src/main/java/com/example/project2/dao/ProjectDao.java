package com.example.project2.dao;

import com.example.project2.entity.Project;

public interface ProjectDao {
    Project saveProject(Project projectEntity);

    Project getProject(String product);
}

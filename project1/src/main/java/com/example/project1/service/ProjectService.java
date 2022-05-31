package com.example.project1.service;

import com.example.project1.dto.ProjectDto;

public interface ProjectService {

    ProjectDto saveProject(String product, String order, String orederList);

    ProjectDto getProject(String product);
}

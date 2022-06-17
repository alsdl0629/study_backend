package com.example.project1.handler;

import com.example.project1.entity.ProjectEntity;

public interface ProjectDataHandler {
    public ProjectEntity saveProjectEntity(String product, String order, String orderList);

    public ProjectEntity getProjectEntity(String product);
}

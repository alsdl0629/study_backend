package com.example.project1.handler;


import com.example.project1.dao.ProjectDao;
import com.example.project1.entity.ProjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjectDataHandlerImpl implements ProjectDataHandler{
    ProjectDao projectDao;

    @Override
    public ProjectEntity saveProjectEntity(String product, String order, String orderList) {
        ProjectEntity projectEntity = new ProjectEntity(product, order, orderList);

        return projectDao.saveProject(projectEntity);
    }

    @Override
    public ProjectEntity getProjectEntity(String product) {
        return projectDao.getProject(product);
    }
}

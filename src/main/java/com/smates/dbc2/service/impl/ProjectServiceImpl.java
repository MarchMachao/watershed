package com.smates.dbc2.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.ProjectDao;
import com.smates.dbc2.po.Project;
import com.smates.dbc2.service.ProjectService;
import com.smates.dbc2.vo.ProjectParaVo;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public void addProject(String name, String describe, String watershedId, String baseYear, String goalYear,
			String step) {
		projectDao.addProject(new Project(name, watershedId, new Date(), describe, baseYear, goalYear, step));
	}

	@Override
	public int getProjectSumByName(String name) {
		return projectDao.getProjectSumByName(name);
	}

	@Override
	public List<Project> getProjectByName(String name, int rows, int page) {
		return projectDao.getProjectByName(new ProjectParaVo(name, rows, (page-1)*rows));
	}

	@Override
	public void deleteProjectById(String id) {
		projectDao.deleteProjectById(id);
	}

}

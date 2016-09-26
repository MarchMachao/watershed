package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.Project;

/**
 * 项目管理业务层
 * 
 * @author baijw
 *
 */
public interface ProjectService {

	/**
	 * 新增一个项目
	 * 
	 * @param project
	 *            项目内容
	 */
	public void addProject(String name, String describe, String watershedId, String baseYear, String goalYear,
			String step);
	
	/**
	 * 统计符合条件的项目总数
	 * @param name 项目名称
	 * @return
	 */
	public int getProjectSumByName(String name);
	
	/**
	 * 根据项目名称查找项目
	 * @param name 项目名称
	 * @param rows 每页显示的个数
	 * @param page 当前页数
	 * @return
	 */
	public List<Project> getProjectByName(String name,int rows,int page);
	
	/**
	 * 根据项目id删除一个项目
	 * @param id 项目id
	 */
	public void deleteProjectById(String id);
	
}

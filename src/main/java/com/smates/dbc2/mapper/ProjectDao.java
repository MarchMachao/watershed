package com.smates.dbc2.mapper;

import java.util.List;

import com.smates.dbc2.po.Project;
import com.smates.dbc2.vo.ProjectParaVo;

/**
 * 项目管理DAO
 * @author baijw
 *
 */
public interface ProjectDao {
	
	/**
	 * 新增一个项目
	 * @param project 项目内容
	 */
	public void addProject(Project project);
	
	/**
	 * 统计符合条件的项目总数
	 * @param name 项目名称
	 * @return
	 */
	public int getProjectSumByName(String name);
	
	/**
	 * 根据项目名称查找项目
	 * @param projectParaVo 查询参数,包括,name,rows,page
	 * @return
	 */
	public List<Project> getProjectByName(ProjectParaVo projectParaVo);
	
	/**
	 * 根据删除一个项目
	 * @param id 项目id
	 */
	public void deleteProjectById(String id);
	
}

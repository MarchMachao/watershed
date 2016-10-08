package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.po.Project;
import com.smates.dbc2.service.ProjectService;
import com.smates.dbc2.vo.BaseMsg;
import com.smates.dbc2.vo.DataGrideRow;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="projectlist.do",method=RequestMethod.GET)
	public String projectlist(){
		return "projectlist.ftl";
	}

	/**
	 * 
	 * @param name
	 * @param describe
	 * @param watershedId
	 * @param baseYear
	 * @param goalYear
	 * @param step
	 * @return
	 */
	@RequestMapping(value = "addProject", method = RequestMethod.POST)
	public String addProject(String name, String describe, String watershedId, String baseYear, String goalYear,
			String step) {
		projectService.addProject(name, describe, watershedId, baseYear, goalYear, step);
		return "projectlist.ftl";
	}

	/**
	 * 根据项目名称模糊查找项目信息
	 * @param name 项目名称
	 * @param rows 每页显示的个数
	 * @param page 当前显示的页数
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "getProjectByName", method = RequestMethod.GET)
	public DataGrideRow<Project> getProjectByName(String name, int rows, @RequestParam(defaultValue = "1") int page) {
		return new DataGrideRow<>(projectService.getProjectSumByName(name),
				projectService.getProjectByName(name, rows, page));
	}
	
	/**
	 * 删除一个项目记录 
	 * @param id 项目id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="deleteProjectById",method=RequestMethod.POST)
	public BaseMsg deleteProjectById(String id){
		projectService.deleteProjectById(id);
		return new BaseMsg(true, "删除成功");
	}

}
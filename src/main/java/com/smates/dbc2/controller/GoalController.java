package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.service.GoalService;
import com.smates.dbc2.vo.BaseMsg;
import com.smates.dbc2.vo.Node;

/**
 * 
 * @author baijw
 *
 */
@Controller
public class GoalController {
	
	@Autowired
	private GoalService goalService;
	
	/**
	 * 保存目标体系接口（参数和界面标号对应）
	 * @param goal_1
	 * @param goal_2
	 * @param goal_3
	 * @param index_111
	 * @param index_112
	 * @param index_121
	 * @param index_131
	 * @param index_132
	 * @param index_141
	 * @param index_142
	 * @param index_143
	 * @param index_144
	 * @param index_211
	 * @param index_221
	 * @param index_231
	 * @param index_311
	 * @param index_321
	 * @param index_331
	 * @param index_332
	 * @param index_341
	 * @param index_342
	 * @param index_351
	 * @param index_352
	 * @param index_361
	 * @param index_371
	 * @param index_372
	 * @param index_373
	 * @param index_381
	 * @param index_382
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="addGoal",method=RequestMethod.GET)
	public BaseMsg addGoal(String projectId, String goal_1, String goal_2, String goal_3, String index_111, String index_112, String index_121,
			String index_131, String index_132, String index_141, String index_142, String index_143, String index_144,
			String index_211, String index_221, String index_231, String index_311, String index_321, String index_331,
			String index_332, String index_341, String index_342, String index_351, String index_352, String index_361,
			String index_371, String index_372, String index_373, String index_381, String index_382){
		goalService.deleteGoalById(projectId);
		goalService.addGoal(projectId, goal_1, goal_2, goal_3, index_111, index_112, index_121, index_131, index_132, index_141, index_142, index_143, index_144, index_211, index_221, index_231, index_311, index_321, index_331, index_332, index_341, index_342, index_351, index_352, index_361, index_371, index_372, index_373, index_381, index_382);
		return new BaseMsg(true, "目标体系保存成功");
	}
	
	@ResponseBody
	@RequestMapping(value="getGoalTree.do",method=RequestMethod.GET)
	public Node getGoalTree(String id){
		return goalService.getGoalTreeById(id);
	}
	
	@RequestMapping(value="toStuation.do",method=RequestMethod.GET)
	public String toStuation(String id,ModelMap modelMap){
		modelMap.addAttribute("projectId", id);
		return "stuation.ftl";
	}
	
}

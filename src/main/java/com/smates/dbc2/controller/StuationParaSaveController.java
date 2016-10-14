package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.service.WatershedParaService;
import com.smates.dbc2.vo.BaseMsg;

/**
 * 用于接收情景的参数controller
 * 
 * @author baijw
 *
 */
@Controller
public class StuationParaSaveController {

	@Autowired
	private WatershedParaService watershedParaService;

	/**
	 * 保存气候情景参数
	 * @param projectId 项目编号
	 * @param countryId 县区编号
	 * @param rainInc 降雨增加比例
	 * @param tempInc 温度增加比例
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "saveClimatePara", method = RequestMethod.GET)
	public BaseMsg saveClimatePara(String projectId, String countryId, String rainInc, String tempInc) {
		watershedParaService.addTblClimateScePara(projectId, countryId, rainInc, tempInc);
		return new BaseMsg(true, "气候情景保存成功");
	}

}

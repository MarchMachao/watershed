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
	@RequestMapping(value = "saveClimatePara", method = RequestMethod.POST)
	public BaseMsg saveClimatePara(String projectId, String countryId, String rainInc, String tempInc) {
		watershedParaService.deleteTblclimateSceParaById(projectId,countryId);
		watershedParaService.addTblClimateScePara(projectId, countryId, rainInc, tempInc);
		return new BaseMsg(true, "气候情景保存成功");
	}
	
	/**
	 * 保存产业与城市发展情景阐述
	 * @param projectId
	 * @param countryId
	 * @param nonFarmPercent
	 * @param fldIndOutput
	 * @param fldIndOutputPercent
	 * @param fldAgrOutput
	 * @param fldAgrOutputPercent
	 * @param fldSerOutput
	 * @param fldSerOutputPercent
	 * @param industryProgressRate
	 * @param changeRateOfTourismIndustry
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="saveIndUrbanScePara",method=RequestMethod.POST)
	public BaseMsg saveIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry){
		watershedParaService.deleteTblIndUrbanScePara(projectId, countryId);
		watershedParaService.addTblIndUrbanScePara(projectId, countryId, nonFarmPercent, fldIndOutput, fldIndOutputPercent, fldAgrOutput, fldAgrOutputPercent, fldSerOutput, fldSerOutputPercent, industryProgressRate, changeRateOfTourismIndustry);
		return new BaseMsg(true, "产业与城市发展情景保存成功");
	}

}
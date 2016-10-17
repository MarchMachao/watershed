package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smates.dbc2.po.BaseClass;
import com.smates.dbc2.service.WatershedParaService;
import com.smates.dbc2.vo.BaseMsg;

/**
 * 用于接收情景的参数controller
 * 
 * @author baijw
 *
 */
@Controller
public class StuationParaController {

	@Autowired
	private WatershedParaService watershedParaService;

	/**
	 * 保存气候情景参数
	 * 
	 * @param projectId
	 *            项目编号
	 * @param countryId
	 *            县区编号
	 * @param rainInc
	 *            降雨增加比例
	 * @param tempInc
	 *            温度增加比例
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "saveClimatePara", method = RequestMethod.POST)
	public BaseMsg saveClimatePara(String projectId, String countryId, String rainInc, String tempInc) {
		watershedParaService.deleteTblclimateSceParaById(projectId, countryId);
		watershedParaService.addTblClimateScePara(projectId, countryId, rainInc, tempInc);
		return new BaseMsg(true, "气候情景保存成功");
	}

	/**
	 * 保存产业与城市发展情景阐述
	 * 
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
	@RequestMapping(value = "saveIndUrbanScePara", method = RequestMethod.POST)
	public BaseMsg saveIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry) {
		watershedParaService.deleteTblIndUrbanScePara(projectId, countryId);
		watershedParaService.addTblIndUrbanScePara(projectId, countryId, nonFarmPercent, fldIndOutput,
				fldIndOutputPercent, fldAgrOutput, fldAgrOutputPercent, fldSerOutput, fldSerOutputPercent,
				industryProgressRate, changeRateOfTourismIndustry);
		return new BaseMsg(true, "产业与城市发展情景保存成功");
	}

	/**
	 * 保存土地资源利用情景参数
	 * 
	 * @param projectId
	 * @param countryId
	 * @param fldFarmAreaChgR
	 * @param wheatChgR
	 * @param cornChgR
	 * @param oilPlantsChgR
	 * @param vegetablesChgR
	 * @param orchardChgR
	 * @param cottonChgR
	 * @param wheatArea
	 * @param cornArea
	 * @param oilPlantsArea
	 * @param vegetablesArea
	 * @param orchardArea
	 * @param cottonArea
	 * @param wetlandArea
	 * @param forestArea
	 * @param grassArea
	 * @param waterArea
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "saveTbLanduseScePara", method = RequestMethod.POST)
	public BaseMsg saveTbLanduseScePara(String projectId, String countryId, String fldFarmAreaChgR, String wheatChgR,
			String cornChgR, String oilPlantsChgR, String vegetablesChgR, String orchardChgR, String cottonChgR,
			String wheatArea, String cornArea, String oilPlantsArea, String vegetablesArea, String orchardArea,
			String cottonArea, String wetlandArea, String forestArea, String grassArea, String waterArea) {
		watershedParaService.deleteTbLanduseScePara(projectId, countryId);
		watershedParaService.addTbLanduseScePara(projectId, countryId, fldFarmAreaChgR, wheatChgR, cornChgR,
				oilPlantsChgR, vegetablesChgR, orchardChgR, cottonChgR, wheatArea, cornArea, oilPlantsArea,
				vegetablesArea, orchardArea, cottonArea, wetlandArea, forestArea, grassArea, waterArea);
		return new BaseMsg(true, "土地资源利用情景参数保存成功");
	}

	/**
	 * 保存社会经济发展情景参数
	 * 
	 * @param projectId
	 * @param countryId
	 * @param perCapGDPR
	 * @param fldMainCannelLeng
	 * @param fldMainCanWUE
	 * @param fldBranCannelLeng
	 * @param fldBranCanWUE
	 * @param fldDouLeng
	 * @param fldDouWUE
	 * @param fldNongLeng
	 * @param fldNongWUE
	 * @param fldMaoLeng
	 * @param fldMaoWUE
	 * @param fldSprinkingArea
	 * @param fldDropIrrArea
	 * @param fldIndustryAllowance
	 * @param fldFarmAllowance
	 * @param fldServiceAllowance
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "saveTbSocioEconomyScePara", method = RequestMethod.POST)
	public BaseMsg saveTbSocioEconomyScePara(String projectId, String countryId, String perCapGDPR,
			String fldMainCannelLeng, String fldMainCanWUE, String fldBranCannelLeng, String fldBranCanWUE,
			String fldDouLeng, String fldDouWUE, String fldNongLeng, String fldNongWUE, String fldMaoLeng,
			String fldMaoWUE, String fldSprinkingArea, String fldDropIrrArea, String fldIndustryAllowance,
			String fldFarmAllowance, String fldServiceAllowance) {
		watershedParaService.deleteTbSocioEconomyScePara(projectId, countryId);
		watershedParaService.addTbSocioEconomyScePara(projectId, countryId, perCapGDPR, fldMainCannelLeng,
				fldMainCanWUE, fldBranCannelLeng, fldBranCanWUE, fldDouLeng, fldDouWUE, fldNongLeng, fldNongWUE,
				fldMaoLeng, fldMaoWUE, fldSprinkingArea, fldDropIrrArea, fldIndustryAllowance, fldFarmAllowance,
				fldServiceAllowance);
		return new BaseMsg(true, "社会经济发展情景保存成功");
	}

	/**
	 * 获取情景参数
	 * @param tab tab标签index
	 * @param projectId 
	 * @param countryId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "getSceParaByProjectIdAndCountryId", method = RequestMethod.GET)
	public BaseClass getSceParaByProjectIdAndCountryId(String tab, String projectId, String countryId) {
		switch (tab) {
		case "1"://气候情景参数
			return watershedParaService.getTblClimateSceParaByProjectIdAndCountryId(projectId, countryId);
		case "2"://产业与城市化
			return watershedParaService.getTblIndUrbanSceParaByProjectIdAndCountryId(projectId, countryId);
		case "3"://社会经济
			return watershedParaService.getTbSocioEconomySceParaByProjectIdAndCountryId(projectId, countryId);
		case "4"://土地资源利用
			return watershedParaService.getTbLanduseSceParaByProjectIdAndCountryId(projectId, countryId);
		case "5":
			return null;

		default:
			return null;
		}
	}

}

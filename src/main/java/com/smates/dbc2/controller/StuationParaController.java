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
	public BaseMsg saveClimatePara(String projectId, String countryId, String rainInc, String tempInc, String year) {
		watershedParaService.deleteTblclimateSceParaById(projectId, countryId,year);
		watershedParaService.addTblClimateScePara(projectId, countryId, rainInc, tempInc,year);
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
	public BaseMsg saveTbSocioEconomyScePara(String projectId, String countryId, String perCapGDPR,String perCapGDP,
			String fldMainCannelLeng, String fldMainCanWUE, String fldBranCannelLeng, String fldBranCanWUE,
			String fldDouLeng, String fldDouWUE, String fldNongLeng, String fldNongWUE, String fldMaoLeng,
			String fldMaoWUE, String fldSprinkingArea, String fldDropIrrArea, String fldIndustryAllowance,
			String fldFarmAllowance, String fldServiceAllowance,String year) {
		watershedParaService.deleteTbSocioEconomyScePara(projectId, countryId ,year);
		watershedParaService.addTbSocioEconomyScePara(projectId, countryId, perCapGDPR,perCapGDP, fldMainCannelLeng,
				fldMainCanWUE, fldBranCannelLeng, fldBranCanWUE, fldDouLeng, fldDouWUE, fldNongLeng, fldNongWUE,
				fldMaoLeng, fldMaoWUE, fldSprinkingArea, fldDropIrrArea, fldIndustryAllowance, fldFarmAllowance,
				fldServiceAllowance,year);
		return new BaseMsg(true, "社会经济发展情景保存成功");
	}

	/**
	 * 获取情景参数
	 * 
	 * @param tab
	 *            tab标签index
	 * @param projectId
	 * @param countryId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "getSceParaByProjectIdAndCountryId", method = RequestMethod.GET)
	public BaseClass getSceParaByProjectIdAndCountryId(String tab, String projectId, String countryId,String year) {
		BaseClass baseClass = null;
		switch (tab) {
		case "1":// 气候情景参数
			baseClass = watershedParaService.getTblClimateSceParaByProjectIdAndCountryId(projectId, countryId, year);
			break;
		case "2":// 产业与城市化
			baseClass = watershedParaService.getTblIndUrbanSceParaByProjectIdAndCountryId(projectId, countryId);
			break;
		case "3":// 社会经济
			baseClass = watershedParaService.getTbSocioEconomySceParaByProjectIdAndCountryId(projectId, countryId);
			break;
		case "4":// 土地资源利用
			baseClass = watershedParaService.getTbLanduseSceParaByProjectIdAndCountryId(projectId, countryId);
			break;
		case "5":
			baseClass = null;
			break;
		default:
			baseClass = null;
		}

		if (baseClass == null) {
			baseClass = new BaseClass();
			baseClass.setIsEmpty("1");
		}
		return baseClass;
	}

	/**
	 * 保存水资源管理情景县区用水量参数表
	 * 
	 * @param fldWatershedCode
	 * @param fldProjectCode
	 * @param fldCountyCode
	 * @param fldDate
	 * @param fldSurfaceWater
	 * @param fldGroundWater
	 * @return
	 */

	@ResponseBody
	@RequestMapping(value="saveTbWaterManSceCWPara",method=RequestMethod.POST)
	public BaseMsg saveTbWaterManSceCWPara(String fldWatershedCode, String projectId, String countryId, String fldDate,
			String fldSurfaceWater, String fldGroundWater) {
		watershedParaService.addTbWaterManSceCWPara(fldWatershedCode, projectId, countryId, fldDate,
				Double.parseDouble(fldSurfaceWater), Double.parseDouble(fldGroundWater));
		return new BaseMsg(true, "保存县区用水量成功");
	}
	
	/**
	 * 水资源管理情景流域中下游用水量参数表
	 * 
	 * @param projectId
	 * @param watershedId
	 * @param serfaceWater
	 * @param midstreamPercent
	 * @param downstreamPercent
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "addMidAndDownStreamPercentPara", method = RequestMethod.POST)
	public BaseMsg addMidAndDownStreamPercentPara(String projectId, String watershedId, String serfaceWater,
			String midstreamPercent, String downstreamPercent) {
		watershedParaService.addMidAndDownStreamPercentPara(projectId, watershedId, Double.parseDouble(serfaceWater), Double.parseDouble(midstreamPercent), Double.parseDouble(downstreamPercent));
		return new BaseMsg(true, "保存中下游用水量成功");
	}

	/**
	 * 水资源管理情景县区水权分配参数表
	 * 
	 * @param fldWatershedCode
	 * @param fldProjectCode
	 * @param fldCountyCode
	 * @param fldDate
	 * @param fldWaterRightRatio
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "addtbWaterManSceWRPara", method = RequestMethod.POST)
	public BaseMsg addTbWaterManSceWRPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldDate, String fldWaterRightRatio) {
		watershedParaService.addTbWaterManSceWRPara(fldWatershedCode, fldProjectCode, fldCountyCode, fldDate,
				Double.parseDouble(fldWaterRightRatio));
		return new BaseMsg(true, "保存水权比例成功");
	}
	
	/**
	 * 保存节水情景
	 * 
	 * @param projectId
	 * @param countryId
	 * @param savewater
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="addSaveWater",method=RequestMethod.POST)
	public BaseMsg addSaveWater(String projectId, String countryId, String savewater){
		watershedParaService.addSaveWater(projectId, countryId, Double.parseDouble(savewater));
		return new BaseMsg(true, "保存节水情景成功");
	}

}

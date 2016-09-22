package com.smates.dbc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.smates.dbc2.mapper.WatershedDao;
import com.smates.dbc2.po.Watershed;

@Controller
public class WatershedController {
	
	@Autowired
	private WatershedDao watershedDao;
	
	/**
	 * 添加流域信息
	 * @param name  流域名称
	 * @param describe 流域描述
	 * @param tblClimateScenarioYear  气候情景数据表(年)
	 * @param tblClimateScenarioMonth  气候情景数据表(月)
	 * @param tblIndustyUrbanSce 产业与城市发展数据表
	 * @param tblLandUseSce 土地种类
	 * @param tblCropPattern 种植结构数据表
	 * @param tblSocioEconSce GDP数据
	 * @param tblPrefPolicy 优惠政策表
	 * @param tblHydrEngineering 水利工程数据
	 * @param tblWaterResManSce 水资源面积
	 * @param tblWaterUseCounty 县区三产用水量
	 * @param tblWaterRightCounty 县区水权分配
	 * @param tblMidDownWaterAllo 流域中下游水分配
	 * @param tblWaterAlloCounty 县区用水量
	 * @return
	 */
	@RequestMapping(value="addWatershed",method=RequestMethod.POST)
	public String addWatershed(String name, String describe, MultipartFile tblClimateScenarioYear, MultipartFile tblClimateScenarioMonth, MultipartFile tblIndustyUrbanSce, MultipartFile tblLandUseSce, MultipartFile tblCropPattern, MultipartFile tblSocioEconSce, MultipartFile tblPrefPolicy, MultipartFile tblHydrEngineering, MultipartFile tblWaterResManSce, MultipartFile tblWaterUseCounty, MultipartFile tblWaterRightCounty, MultipartFile tblMidDownWaterAllo, MultipartFile tblWaterAlloCounty){
		watershedDao.addWatershed(new Watershed(name, describe));
		return "";
	}
	
}

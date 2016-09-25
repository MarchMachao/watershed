package com.smates.dbc2.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.smates.dbc2.po.TblClimateScenarioYear;

/**
 * 流域相关controller
 * @author baijw
 *
 */
@Controller
public class WatershedController extends BaseController{
	
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
	 * @throws IOException 
	 */
	@RequestMapping(value="addWatershed",method=RequestMethod.POST)
	public String addWatershed(String id, String name, String describe, MultipartFile tblClimateScenarioYear, MultipartFile tblClimateScenarioMonth, MultipartFile tblIndustyUrbanSce, MultipartFile tblLandUseSce, MultipartFile tblCropPattern, MultipartFile tblSocioEconSce, MultipartFile tblPrefPolicy, MultipartFile tblHydrEngineering, MultipartFile tblWaterResManSce, MultipartFile tblWaterUseCounty, MultipartFile tblWaterRightCounty, MultipartFile tblMidDownWaterAllo, MultipartFile tblWaterAlloCounty) throws IOException{
		//保存流域基本信息(流域名,流域描述)
		watershedService.addWatershedInfo(id, name,describe);
		//解析excel表格并存储
		StoreExcelData(tblClimateScenarioYear, tblClimateScenarioMonth, tblIndustyUrbanSce, tblLandUseSce,
				tblCropPattern);
		return "";
	}

	/**
	 * 根据用户输入的气候情景排放类型返回List<TblClimateScenarioYear>
	 * @param fldCRPType  气候情景排放类型
	 * @return List<TblClimateScenarioYear>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value="geTblClimateScenarioYearsByfldCRPType",method=RequestMethod.GET)
	public List<TblClimateScenarioYear> geTblClimateScenarioYearsByfldCRPType(String fldCRPType){
		return watershedService.getTblClimateScenarioYearsByfldCRPType(fldCRPType);
	}
	
	/**
	 * 
	 * @return
	 */
//	@ResponseBody
//	@RequestMapping()
//	public List<TblIndustyUrbanSce> getTblIndustyUrbanSceBy(){
//		
//	}
	
}

package com.smates.dbc2.service;

import com.smates.dbc2.po.TbLanduseScePara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
import com.smates.dbc2.po.TblClimateScePara;
import com.smates.dbc2.po.TblIndUrbanScePara;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 下午2:19:39
 */
public interface WatershedParaService {
	/**
	 * 添加气候情景参数
	 * 
	 * @param tblClimateScePara
	 */
	public void addTblClimateScePara(String projectId, String countryId, String rainInc, String tempInc, String year,
			String fldCRPType);

	/**
	 * 删除某个项目的气候情景参数
	 * 
	 * @param id
	 */
	public void deleteTblclimateSceParaById(String id, String countryId,String year);
	
	/**
	 * 查找气候情景参数
	 * @param projectId
	 * @param countryId
	 * @return
	 */
	public TblClimateScePara getTblClimateSceParaByProjectIdAndCountryId(String projectId, String countryId,String yeare);

	/**
	 * 添加产业与城市发展情景参数
	 * 
	 * @param tbLanduseScePara
	 */
	public void addTblIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry, String year, 
			String fldFarmPop, String fldNonFarmPop);
	
	/**
	 * 删除产业与城市发展情景参数
	 * 
	 * @param projectId
	 * @param countryId
	 */
	public void deleteTblIndUrbanScePara(String projectId, String countryId, String year);
	
	/**
	 * 查找产业与城市发展情景参数
	 * @param projectId
	 * @param countryId
	 * @return
	 */
	public TblIndUrbanScePara getTblIndUrbanSceParaByProjectIdAndCountryId(String projectId, String countryId,String year);
	
	/**
	 * 添加土地资源利用情景参数
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
	 */
	public void addTbLanduseScePara(String projectId, String countryId,String fldFarmArea, String fldFarmAreaChgR, String wheatChgR,
			String cornChgR, String oilPlantsChgR, String vegetablesChgR, String orchardChgR, String cottonChgR,
			String wheatArea, String cornArea, String oilPlantsArea, String vegetablesArea, String orchardArea,
			String cottonArea, String wetlandArea, String forestArea, String grassArea, String waterArea, String year);
	
	
	/**
	 * 删除土地资源利用情景参数
	 * 
	 * @param projectId
	 * @param countryId
	 */
	public void deleteTbLanduseScePara(String projectId, String countryId, String year);
	
	/**
	 * 查找土地资源利用情景参数
	 * @param projectId
	 * @param countryId
	 * @return
	 */
	public TbLanduseScePara getTbLanduseSceParaByProjectIdAndCountryId(String projectId, String countryId,String year);
	
	/**
	 * 增加社会经济发展情景参数、
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
	 */
	public void addTbSocioEconomyScePara(String projectId, String countryId, String perCapGDPR,String perCapGDP,
			String fldMainCannelLeng, String fldMainCanWUE, String fldBranCannelLeng, String fldBranCanWUE,
			String fldDouLeng, String fldDouWUE, String fldNongLeng, String fldNongWUE, String fldMaoLeng,
			String fldMaoWUE, String fldSprinkingArea, String fldDropIrrArea, String fldIndustryAllowance,
			String fldFarmAllowance, String fldServiceAllowance,String year);

	/**
	 * 删除社会经济发展情景参数
	 * 
	 * @param projectId
	 * @param countryId
	 */
	public void deleteTbSocioEconomyScePara(String projectId, String countryId ,String year);
	
	/**
	 * 查找社会经济发展情景参数
	 * @param projectId
	 * @param countryId
	 * @return
	 */
	public TbSocioEconomyScePara getTbSocioEconomySceParaByProjectIdAndCountryId(String projectId, String countryId,String year);
	
	/**
	 * 添加水资源管理情景县区用水量参数
	 * 
	 * @param tbWaterManSceCWPara
	 */
	public void addTbWaterManSceCWPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldDate, double fldSurfaceWater, double fldGroundWater);
	
	/**
	 * 添加水资源管理情景流域中下游用水量参数
	 * 
	 * @param tbWaterManSceMDPara
	 */
	public void addTbWaterManSceMDPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode, String fldDate,
			double fldWaterUseMid, double fldWaterUseDown);
	
	/**
	 * 添加水资源管理情景县区水权分配参数
	 * 
	 * @param tbWaterManSceTWPara
	 */
	public void addTbWaterManSceWRPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode, String fldDate,
			double fldWaterRightRatio);
	
	/**
	 * 添加水资源管理，中下游水分配
	 */
	public void addMidAndDownStreamPercentPara(String projectId, String watershedId, double serfaceWater,
			double midstreamPercent, double downstreamPercent);
	
	/**
	 * 保存节水技术情景
	 */
	public void addSaveWater(String projectId, String countryId, double savewater);

}

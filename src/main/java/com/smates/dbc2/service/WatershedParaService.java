package com.smates.dbc2.service;

import javax.enterprise.inject.New;

import com.smates.dbc2.po.TbLanduseSceCropPara;
import com.smates.dbc2.po.TbSocioEconomySceHydEngPara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
import com.smates.dbc2.po.TbSocioEconomyScePoyPara;
import com.smates.dbc2.po.TbWaterManSceCWPara;
import com.smates.dbc2.po.TbWaterManSceMDPara;
import com.smates.dbc2.po.TbWaterManScePara;
import com.smates.dbc2.po.TbWaterManSceTWPara;
import com.smates.dbc2.po.TbWaterManSceWRPara;

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
	public void addTblClimateScePara(String projectId, String countryId, String rainInc, String tempInc);

	/**
	 * 删除某个项目的气候情景参数
	 * 
	 * @param id
	 */
	public void deleteTblclimateSceParaById(String id, String countryId);

	/**
	 * 添加产业与城市发展情景参数
	 * 
	 * @param tbLanduseScePara
	 */
	public void addTblIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry);
	
	/**
	 * 删除产业与城市发展情景参数
	 * @param projectId
	 * @param countryId
	 */
	public void deleteTblIndUrbanScePara(String projectId, String countryId);
	
	/**
	 * 添加土地资源利用情景参数
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
	public void addTbLanduseScePara(String projectId, String countryId, String fldFarmAreaChgR, String wheatChgR,
			String cornChgR, String oilPlantsChgR, String vegetablesChgR, String orchardChgR, String cottonChgR,
			String wheatArea, String cornArea, String oilPlantsArea, String vegetablesArea, String orchardArea,
			String cottonArea, String wetlandArea, String forestArea, String grassArea, String waterArea);
	
	
	/**
	 * 删除土地资源利用情景参数
	 * @param projectId
	 * @param countryId
	 */
	public void deleteTbLanduseScePara(String projectId, String countryId);
	
}

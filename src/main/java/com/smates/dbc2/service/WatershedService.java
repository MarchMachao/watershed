package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.TblClimateScenarioMonth;
import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblCropPattern;
import com.smates.dbc2.po.TblHydrEngineering;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.po.TblLandUseSce;
import com.smates.dbc2.po.TblMidDownWaterAllo;
import com.smates.dbc2.po.TblPrefPolicy;
import com.smates.dbc2.po.TblSocioEconSce;
import com.smates.dbc2.po.TblWaterAlloCounty;
import com.smates.dbc2.po.TblWaterResManSce;
import com.smates.dbc2.po.TblWaterRightCounty;
import com.smates.dbc2.po.TblWaterUseCounty;

/**
 * 流域相关业务
 * 
 * @author baijw
 *
 */
public interface WatershedService {

	/**
	 * 添加流域基本信息
	 * 
	 * @param name
	 *            流域名称
	 * @param describe
	 *            流域描述
	 */
	public void addWatershedInfo(String name, String describe);

	/**
	 * 气候情景数据表(年)
	 */
	public void addTblClimateScenarioYear(TblClimateScenarioYear tblClimateScenarioYear);

	/**
	 * 气候情景数据表(月)
	 */
	public void addTblClimateScenarioMonth(TblClimateScenarioMonth tblClimateScenarioMonth);
	
	/**
	 * 添加产业与城市发展情景
	 */
	public void addTblIndustyUrbanSce(TblIndustyUrbanSce tblIndustyUrbanSce);
	
	/**
	 * 添加种植结构数据表
	 */
	public void addTblLandUseSce(TblLandUseSce tblLandUseSce);
	
	/**
	 * 添加种植结构数据
	 * 
	 * @param tblCropPattern
	 */
	public void addtblCropPattern(TblCropPattern tblCropPattern);
	
	/**
	 * 添加GDP发展数据
	 * 
	 * @param tblSocioEconSce
	 */
	public void addtblSocioEconSce(TblSocioEconSce tblSocioEconSce);

	/**
	 * 添加优惠政策
	 * 
	 * @param tblPrefPolicy
	 */
	public void addtblPrefPolicy(TblPrefPolicy tblPrefPolicy);
	
	/**
	 * 添加水利工程数据
	 * 
	 * @param tblHydrEngineering
	 */
	public void addtblHydrEngineering(TblHydrEngineering tblHydrEngineering);

	/**
	 * 添加水资源面积数据
	 * 
	 * @param tblWaterResManSce
	 */
	public void addtblWaterResManSce(TblWaterResManSce tblWaterResManSce);

	/**
	 * 添加县区三产用水量数据
	 * 
	 * @param tblWaterUseCounty
	 */
	public void addtblWaterUseCounty(TblWaterUseCounty tblWaterUseCounty);

	/**
	 * 添加县区水权分配数据
	 * 
	 * @param tblWaterRightCounty
	 */
	public void addtblWaterRightCounty(TblWaterRightCounty tblWaterRightCounty);

	/**
	 * 添加流域中下游分配数据
	 * 
	 * @param tblMidDownWaterAllo
	 */
	public void addtblMidDownWaterAllo(TblMidDownWaterAllo tblMidDownWaterAllo);

	/**
	 * 添加县区用水量数据
	 * 
	 * @param tblWaterAlloCounty
	 */
	public void addtblWaterAlloCounty(TblWaterAlloCounty tblWaterAlloCounty);


	/**
	 * 根据气候情景排放类型查找气候情景数据表
	 * 
	 * @param fldCRPType
	 *            气候情景排放类型
	 * @return 气候情景数据表(年)lsit
	 */
	public List<TblClimateScenarioYear> geTblClimateScenarioYearsByfldCRPType(String fldCRPType);
	

	/**
	 * 根据气候情景排放类型
	 * 
	 * @param fldCRPType
	 *            气候情景排放类型
	 * @return 气候情景数据表(年)lsit
	 */
	public List<TblClimateScenarioYear> getTblClimateScenarioYearsByfldCRPType(String fldCRPType);

	
	

}

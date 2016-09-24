package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.TblClimateScenarioMonth;
import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.po.TblLandUseSce;

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
	 * 根据气候情景排放类型
	 * 
	 * @param fldCRPType
	 *            气候情景排放类型
	 * @return 气候情景数据表(年)lsit
	 */
	public List<TblClimateScenarioYear> getTblClimateScenarioYearsByfldCRPType(String fldCRPType);

	

}

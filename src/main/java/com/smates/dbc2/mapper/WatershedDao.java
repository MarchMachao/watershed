package com.smates.dbc2.mapper;

import java.util.List;

import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.Watershed;

public interface WatershedDao {
	
	/**
	 * 添加流域信息
	 * @param name 流域名称
	 * @param describe 流域描述
	 */
	public void addWatershed(Watershed watershed);
	
	/**
	 * 添加气候情景数据表(年)数据
	 * @param tblClimateScenarioYear
	 */
	public void addTblClimateScenarioYear(TblClimateScenarioYear tblClimateScenarioYear);
	
	/**
	 * 根据气候情景排放类型查找气候情景数据表
	 * @param fldCRPType 气候情景排放类型
	 * @return 气候情景数据表(年)lsit
	 */
	public List<TblClimateScenarioYear> geTblClimateScenarioYearsByfldCRPType(String fldCRPType);
	
}

package com.smates.dbc2.mapper;

import com.smates.dbc2.po.Watershed;

public interface WatershedDao {
	
	/**
	 * 添加流域信息
	 * @param name 流域名称
	 * @param describe 流域描述
	 */
	public void addWatershed(Watershed watershed);
	
}

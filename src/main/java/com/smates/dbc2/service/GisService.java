package com.smates.dbc2.service;

import java.util.List;

import com.smates.dbc2.po.Gisecharts;

public interface GisService {

	/**
	 * 查找所有评价结果信息
	 * 
	 * @return
	 */
	public List<Gisecharts> getAllGisecharts();

	/**
	 * 添加评价结果信息
	 * 
	 * @param Gisecharts
	 */
	public void addGisecharts(String year, String resultOverall, String resultP1, String resultP2, String resultP3);

	/**
	 * 删除评价结果信息
	 * 
	 * @param year
	 */
	public void deleteGisecharts(String year);
	
	/**
	 * 更新Gis左下角指标数据
	 * TODO
	 */
	public void updateGisIndex();
	
	/**
	 * 更新右下角指标
	 */
	public void updateDevelop();
	
	/**
	 * 更新GIS地图上的三个指标柱状图源数据
	 */
	public void updateThreeindex();
}

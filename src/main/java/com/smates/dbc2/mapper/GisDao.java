package com.smates.dbc2.mapper;

import java.util.List;

import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.vo.CountryIdAndFarmAreaVo;

/**
 * gis相关Dao
 * 
 * @author machao
 *
 */
public interface GisDao {
	
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
	public void addGisecharts(Gisecharts gisecharts);

	/**
	 * 删除评价结果信息
	 * 
	 * @param year
	 */
	public void deleteGisecharts(String year);
	
	/**
	 * 更新上游耕地面积
	 */
	public void updateLandUseArea(CountryIdAndFarmAreaVo ountryIdAndFarmAreaVo);
	
	/**
	 * 更新滴灌面积
	 * @param ountryIdAndFarmAreaVo
	 */
	public void updateSprinkArea(CountryIdAndFarmAreaVo ountryIdAndFarmAreaVo);
	
	
}

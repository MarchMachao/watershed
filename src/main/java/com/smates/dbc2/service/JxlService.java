package com.smates.dbc2.service;

import java.io.InputStream;
import java.util.List;

import com.smates.dbc2.po.TblClimateScenarioYear;


public interface JxlService {

	/**
	 * 获取excel的指定位置的内容
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public String getContent(int row, int col, InputStream fis);
	
	/**
	 * 一次得到文件所有内容(气候情景数据表(年))
	 * @param fis 文件输入流
	 * @return
	 */
	public List<TblClimateScenarioYear> getAllContent(InputStream fis);

}

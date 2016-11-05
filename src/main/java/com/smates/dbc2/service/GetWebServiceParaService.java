package com.smates.dbc2.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.smates.dbc2.po.Project;
import com.smates.dbc2.ws.DoubleArray;

/**
 * 获取webService模型需要的参数
 * @author baijw
 *
 */
public interface GetWebServiceParaService {
	
	/**
	 * 获取所有县区代码
	 * @return
	 */
	public List<String> getCountryCodes();
	
	/**
	 * 获取所有县区名称
	 * @return
	 */
	public List<String> getCountryNames();
	
	/**
	 * 查找项目信息
	 * @param projectId
	 * @return
	 */
	public Project getProjectById(String projectId);
	
	/**
	 * 获取降水数据（逐年各县）
	 * @return
	 */
	public List<DoubleArray> getTblClimateScenarioYear() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public List<DoubleArray> getprecR(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取平均温度
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> gettempAvg() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取最高温度
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> gettempMax() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取最低温度
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> gettempMin() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取中下游分水量
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getTblMidDownWaterAllo() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取下游分水量
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getTblDownDownWaterAllo() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取水权分配比例
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getfldWaterRightRatio(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取节水技术提高比例
	 * @param projectId 项目id
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getSaveWater(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取GDP参数
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getGDP() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取人均GDP
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getgdpPer() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
	/**
	 * 获取GDP增长率
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public List<DoubleArray> getGDPInc(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
	
}

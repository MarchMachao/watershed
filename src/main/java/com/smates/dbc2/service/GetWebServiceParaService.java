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
	
}

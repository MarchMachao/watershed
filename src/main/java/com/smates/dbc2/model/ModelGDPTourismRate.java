package com.smates.dbc2.model;

/**
 * @class 
 * @brief 旅游业在GDP中的比例 
 * @author Bob, Ge Yingchun
 * @version 
 * @date 
 * @note
 *  旅游业GDP比例=旅游业产值/GDP
 */
public class ModelGDPTourismRatio {

	public ModelGDPTourismRatio(){
		
	}
	
	/**
	 * 
	 * @param outputTourism	double	旅游业产值
	 * @param gdp	double	GDP
	 * @return rt	double	 旅游业GDP比例
	 * @exception 
     * @note
     *     旅游业GDP比例 = 旅游业产值/GDP
	 */
	public double calc( double outputTourism, double gdp ){

		double rt = 0;
		if(gdp!=0)
			rt = outputTourism/gdp;
		return rt;
	}
	

	/** @brief brief description  */
	public void init(){
	}

}

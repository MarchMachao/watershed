package com.smates.dbc2.model;

/**
 * @class 
 * @brief 计算水生产力 
 * @author Bob, Ge Yingchun
 * @version 
 * @date 
 * @note
 *  WPa = Ya / QTot
 *  其中，Ya为流域总产值，元；QTot为流域总用水量，m3.
 *    Ya=工业产值+农业产值+服务业产值
 *    Qtot=工业需水量+农业需水量+服务业需水量
 * 
 *    表名 tblIndustyUrbanSce :
 *		工业产值	fldIndOutput
 *      农业产值    fldAgrOutput
 *      服务业产值    fldSerOutput

 *    tblWaterUseCounty:
 *    	工业需水量	fldWaterUseAgr
 *		农业需水量	fldWaterUseInd
 *		服务业需水量	fldWaterUseSer
 *
 */
public class ModelWaterProductivity {

	public ModelWaterProductivity(){
		
	}
	
	/**
	 * 
	 * @param fldWatershedCode
	 * @param fldCountyCode
	 * @param fldDate
	 * @return waterProductivity double 
	 * @exception 
	 */
	public double calc(String fldWatershedCode, String fldCountyCode, String fldDate){
		
		
		return 0;
	}
	

	/** @brief brief description  */
	public void init(){
	}

	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 * @exception 
	 */
	public int run(){
		return 0;
	}
}

package com.smates.dbc2.service;

import com.smates.dbc2.po.TbLanduseSceCropPara;
import com.smates.dbc2.po.TbSocioEconomySceHydEngPara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
import com.smates.dbc2.po.TbSocioEconomyScePoyPara;
import com.smates.dbc2.po.TbWaterManSceCWPara;
import com.smates.dbc2.po.TbWaterManSceMDPara;
import com.smates.dbc2.po.TbWaterManScePara;
import com.smates.dbc2.po.TbWaterManSceTWPara;
import com.smates.dbc2.po.TbWaterManSceWRPara;
import com.smates.dbc2.po.TblClimateScePara;
import com.smates.dbc2.po.TblIndUrbanScePara;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 下午2:19:39
 */
public interface WatershedParaService {
	/**
	 * 添加气候情景参数
	 * 
	 * @param tblClimateScePara
	 */
	public void addTblClimateScePara(TblClimateScePara tblClimateScePara);

	/**
	 * 添加土地利用情景参数
	 * 
	 * @param tbLanduseScePara
	 */
	public void addTblIndUrbanScePara(TblIndUrbanScePara tblIndUrbanScePara);

	/**
	 * 添加土地利用情景种植结构参数
	 * 
	 * @param tbLanduseSceCropPara
	 */
	public void addTbLanduseSceCropPara(TbLanduseSceCropPara tbLanduseSceCropPara);

	/**
	 * 添加社会经济发展情景参数
	 * 
	 * @param tbSocioEconomyScePara
	 */
	public void addTbSocioEconomyScePara(TbSocioEconomyScePara tbSocioEconomyScePara);

	/**
	 * 添加社会经济发展情景优惠政策参数
	 * 
	 * @param tbSocioEconomyScePoyPara
	 */
	public void addTbSocioEconomyScePoyPara(TbSocioEconomyScePoyPara tbSocioEconomyScePoyPara);

	/**
	 * 添加社会经济发展情景水利工程参数
	 * 
	 * @param tbSocioEconomySceHydEngPara
	 */
	public void addTbSocioEconomySceHydEngPara(TbSocioEconomySceHydEngPara tbSocioEconomySceHydEngPara);

	/**
	 * 添加水资源管理情景参数
	 * 
	 * @param tbWaterManScePara
	 */
	public void addTbWaterManScePara(TbWaterManScePara tbWaterManScePara);

	/**
	 * 添加水资源管理情景县区三产用水量参数
	 * 
	 * @param tbWaterManSceTWPara
	 */
	public void addTbWaterManSceTWPara(TbWaterManSceTWPara tbWaterManSceTWPara);

	/**
	 * 添加水资源管理情景县区水权分配参数
	 * 
	 * @param tbWaterManSceTWPara
	 */
	public void addTbWaterManSceWRPara(TbWaterManSceWRPara tbWaterManSceWRPara);

	/**
	 * 添加水资源管理情景流域中下游用水量参数
	 * 
	 * @param tbWaterManSceMDPara
	 */
	public void addTbWaterManSceMDPara(TbWaterManSceMDPara tbWaterManSceMDPara);

	/**
	 * 添加水资源管理情景县区用水量参数
	 * 
	 * @param tbWaterManSceCWPara
	 */
	public void addTbWaterManSceCWPara(TbWaterManSceCWPara tbWaterManSceCWPara);
}

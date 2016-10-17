package com.smates.dbc2.mapper;

import com.smates.dbc2.po.TbLanduseSceCropPara;
import com.smates.dbc2.po.TbLanduseScePara;
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
import com.smates.dbc2.vo.ProjectIdAndCountyId;

/**
 * 
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 下午2:00:53
 */
public interface WatershedParaDao {

	/**
	 * 添加气候情景参数
	 * 
	 * @param tblClimateScePara
	 */
	public void addTblClimateScePara(TblClimateScePara tblClimateScePara);
	
	/**
	 * 删除某个项目的气候情景参数
	 * 
	 * @param id
	 */
	public void deleteTblclimateSceParaById(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 查找气候情景参数
	 * @param projectIdAndCountyId
	 * @return
	 */
	public TblClimateScePara getTblClimateSceParaByProjectIdAndCountryId(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 添加产业与城市发展情景参数
	 */
	public void addTblIndUrbanScePara(TblIndUrbanScePara tblIndUrbanScePara);
	
	/**
	 * 删除产业与城市发展情景参数
	 * 
	 * @param projectIdAndCountyId
	 */
	public void deleteTblIndUrbanScePara(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 查找产业与城市发展情景参数
	 * @param projectIdAndCountyId
	 * @return
	 */
	public TblIndUrbanScePara getTblIndUrbanSceParaByProjectIdAndCountryId(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 添加土地资源利用情景参数
	 * 
	 * @param tbLanduseScePara
	 */
	public void addTbLanduseScePara(TbLanduseScePara tbLanduseScePara);
	
	/**
	 * 删除土地资源利用情景参数
	 * 
	 * @param projectIdAndCountyId
	 */
	public void deleteTbLanduseScePara(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 查找土地资源利用情景参数
	 * @param projectIdAndCountyId
	 * @return
	 */
	public TbLanduseScePara getTbLanduseSceParaByProjectIdAndCountryId(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 添加社会经济发展情景参数
	 * 
	 * @param tbSocioEconomyScePara
	 */
	public void addTbSocioEconomyScePara(TbSocioEconomyScePara tbSocioEconomyScePara);
	
	/**
	 * 删除社会经济发展情景参数
	 * 
	 * @param projectIdAndCountyId
	 */
	public void deleteTbSocioEconomyScePara(ProjectIdAndCountyId projectIdAndCountyId);
	
	/**
	 * 查找社会经济发展情景参数
	 * @param projectIdAndCountyId
	 * @return
	 */
	public TbSocioEconomyScePara getTbSocioEconomySceParaByProjectIdAndCountryId(ProjectIdAndCountyId projectIdAndCountyId);

	/**
	 * 添加土地利用情景种植结构参数
	 * 
	 * @param tbLanduseSceCropPara
	 */
	public void addTbLanduseSceCropPara(TbLanduseSceCropPara tbLanduseSceCropPara);


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

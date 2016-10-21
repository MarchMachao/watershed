package com.smates.dbc2.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblCropPattern;
import com.smates.dbc2.po.TblHydrEngineering;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.po.TblLandUseSce;
import com.smates.dbc2.po.TblMidDownWaterAllo;
import com.smates.dbc2.po.TblSocioEconSce;
import com.smates.dbc2.po.Watershed;
import com.smates.dbc2.vo.BaseMsg;
import com.smates.dbc2.vo.DataGrideRow;

/**
 * 流域相关controller
 * 
 * @author baijw and March
 *
 */
@Controller
public class WatershedController extends BaseController{
	
	
	/**
	 * 添加流域信息
	 * 
	 * @param name
	 *            流域名称
	 * @param describe
	 *            流域描述
	 * @param tblClimateScenarioYear
	 *            气候情景数据表(年)
	 * @param tblClimateScenarioMonth
	 *            气候情景数据表(月)
	 * @param tblIndustyUrbanSce
	 *            产业与城市发展数据表
	 * @param tblLandUseSce
	 *            土地种类
	 * @param tblCropPattern
	 *            种植结构数据表
	 * @param tblSocioEconSce
	 *            GDP数据
	 * @param tblPrefPolicy
	 *            优惠政策表
	 * @param tblHydrEngineering
	 *            水利工程数据
	 * @param tblWaterResManSce
	 *            水资源面积
	 * @param tblWaterUseCounty
	 *            县区三产用水量
	 * @param tblWaterRightCounty
	 *            县区水权分配
	 * @param tblMidDownWaterAllo
	 *            流域中下游水分配
	 * @param tblWaterAlloCounty
	 *            县区用水量
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="addWatershed",method=RequestMethod.POST)
	public String addWatershed(String id, String name, String describe, MultipartFile tblClimateScenarioYear, MultipartFile tblClimateScenarioMonth, MultipartFile tblIndustyUrbanSce, MultipartFile tblLandUseSce, MultipartFile tblCropPattern, MultipartFile tblSocioEconSce, MultipartFile tblPrefPolicy, MultipartFile tblHydrEngineering, MultipartFile tblWaterResManSce, MultipartFile tblWaterUseCounty, MultipartFile tblWaterRightCounty, MultipartFile tblMidDownWaterAllo, MultipartFile tblWaterAlloCounty) throws IOException{
		// 保存流域基本信息(流域名,流域描述)
		watershedService.addWatershedInfo(id, name,describe);
		// 解析excel表格并存储
		StoreExcelData(id,tblClimateScenarioYear, tblClimateScenarioMonth, tblIndustyUrbanSce, tblLandUseSce, tblCropPattern, tblSocioEconSce, tblPrefPolicy, tblHydrEngineering, tblWaterResManSce, tblWaterUseCounty, tblWaterRightCounty, tblMidDownWaterAllo, tblWaterAlloCounty);
		return "watershedlist.ftl";
	}
	
	/**
	 * 加载流域信息页面
	 * @return
	 */
	@RequestMapping(value="watershedlist",method=RequestMethod.GET)
	public String watershedlist(){
		return "watershedlist.ftl";
	}
	
	/**
	 * 根据用户输入的流域名称返回查找的结果
	 * @param page 显示的页码
	 * @param name 流域名称
	 * @param rows 每页显示的个数
	 * @return 格式化后的流域信息
	 */
	@ResponseBody
	@RequestMapping(value="getWatershedByName",method=RequestMethod.GET)
	public DataGrideRow<Watershed> getWatershedByName(@RequestParam(defaultValue = "1") int page, String name, int rows){
		return watershedService.getWatershedFormateDataGride(name,page,rows);
	}
	
	/**
	 * 删除一条流域信息
	 * @param id 流域id
	 */
	@ResponseBody
	@RequestMapping(value="deleteWatershed",method=RequestMethod.GET)
	public BaseMsg deleteWatershed(String id){
		watershedService.deleteWatershed(id);
		return new BaseMsg(true, "删除成功");
	}


	/**
	 * 根据用户输入的气候情景排放类型返回List<TblClimateScenarioYear>
	 * 
	 * @param fldCRPType
	 *            气候情景排放类型
	 * @return List<TblClimateScenarioYear>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value="geTblClimateScenarioYearsByfldCRPType",method=RequestMethod.GET)
	public List<TblClimateScenarioYear> geTblClimateScenarioYearsByfldCRPType(String fldCRPType){
		return watershedService.getTblClimateScenarioYearsByfldCRPType(fldCRPType);
	}
	
	/**
	 * 根据县区代码查找产业与城市发展情景 返回List<TblIndustyUrbanSce>
	 * 
	 * @param fldCountyCode
	 *            县区代码
	 * @return List<TblIndustyUrbanSce>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblIndustyUrbanSceByfldCountyCode", method = RequestMethod.GET)
	public List<TblIndustyUrbanSce> getTblIndustyUrbanSceByfldCountyCode(String fldCountyCode) {
		return watershedService.getTblIndustyUrbanSceByfldCountyCode(fldCountyCode);
	}

	/**
	 * 根据县区代码查找GDP发展数据表
	 * 
	 * @param fldCountyCode
	 *            县区代码
	 * @return List<TblSocioEconSce>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblSocioEconSceByfldCountyCode", method = RequestMethod.GET)
	public List<TblSocioEconSce> getTblSocioEconSceByfldCountyCode(String fldCountyCode) {
		return watershedService.getTblSocioEconSceByfldCountyCode(fldCountyCode);
	}

	/**
	 * 根据县区代码查找水利工程数据表
	 * 
	 * @param fldCountyCode
	 *            县区代码
	 * @return List<TblHydrEngineering>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblHydrEngineeringByfldCountyCode", method = RequestMethod.GET)
	public List<TblHydrEngineering> getTblHydrEngineeringByfldCountyCode(String fldCountyCode) {
		return watershedService.getTblHydrEngineeringByfldCountyCode(fldCountyCode);
	}

	/**
	 * 根据县区代码查找土地类型数据表
	 * 
	 * @param fldCountyCode
	 *            县区代码
	 * @return List<TblLandUseSce>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblLandUseSceByfldCountyCode", method = RequestMethod.GET)
	public List<TblLandUseSce> getTblLandUseSceByfldCountyCode(String fldCountyCode) {
		return watershedService.getTblLandUseSceByfldCountyCode(fldCountyCode);
	}

	/**
	 * 根据县区代码查找种植结构数据表
	 * 
	 * @param fldCountyCode
	 *            县区代码
	 * @return List<TblCropPattern>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblCropPatternByfldCountyCode", method = RequestMethod.GET)
	public List<TblCropPattern> getTblCropPatternByfldCountyCode(String fldCountyCode) {
		return watershedService.getTblCropPatternByfldCountyCode(fldCountyCode);
	}

	/**
	 * 查找流域中下游水分配表
	 * 
	 * @param
	 * 
	 * @return List<TblMidDownWaterAllo>的json格式数据
	 */
	@ResponseBody
	@RequestMapping(value = "getTblMidDownWaterAllo", method = RequestMethod.GET)
	public List<TblMidDownWaterAllo> getTblMidDownWaterAllo() {
		return watershedService.getTblMidDownWaterAllo();
	}

}

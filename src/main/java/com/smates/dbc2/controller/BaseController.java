package com.smates.dbc2.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.smates.dbc2.po.TblClimateScenarioMonth;
import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblCropPattern;
import com.smates.dbc2.po.TblHydrEngineering;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.po.TblLandUseSce;
import com.smates.dbc2.po.TblMidDownWaterAllo;
import com.smates.dbc2.po.TblPrefPolicy;
import com.smates.dbc2.po.TblSocioEconSce;
import com.smates.dbc2.po.TblWaterAlloCounty;
import com.smates.dbc2.po.TblWaterResManSce;
import com.smates.dbc2.po.TblWaterRightCounty;
import com.smates.dbc2.po.TblWaterUseCounty;
import com.smates.dbc2.qniu.QniuHelper;
import com.smates.dbc2.service.JxlService;
import com.smates.dbc2.service.MenuService;
import com.smates.dbc2.service.RoleService;
import com.smates.dbc2.service.UserService;
import com.smates.dbc2.service.WatershedService;

public class BaseController {
	
	@Autowired
	public QniuHelper qniuHelper;
	
	@Autowired
	public  UserService userService;
	
	@Autowired
	public MenuService menuService;
	
	@Autowired
	public RoleService roleService;
	
	@Autowired
	public JxlService jxlService;
	
	@Autowired
	public WatershedService watershedService;
	
	public Logger logger = Logger.getLogger(BaseController.class);
	
	public void StoreExcelData(MultipartFile tblClimateScenarioYear, MultipartFile tblClimateScenarioMonth,
			MultipartFile tblIndustyUrbanSce, MultipartFile tblLandUseSce, MultipartFile tblCropPattern)
			throws IOException {
		
		if(tblClimateScenarioMonth != null){
			List<TblClimateScenarioMonth> tblClimateScenarioMonths = jxlService.getAllContenttblClimateScenarioMonth(tblClimateScenarioMonth.getInputStream());
			logger.info(tblClimateScenarioMonths.size()+"month");
			for(int i=0;i<tblClimateScenarioMonths.size();i++){
				watershedService.addTblClimateScenarioMonth(tblClimateScenarioMonths.get(i));
			}
		}
		
		if(tblClimateScenarioYear!=null){
			List<TblClimateScenarioYear> tblClimateScenarioYears = jxlService.getAllContenttblClimateScenarioYear(tblClimateScenarioYear.getInputStream());
			logger.info(tblClimateScenarioYears.size()+"year");
			for(int i=0;i<tblClimateScenarioYears.size();i++){
				watershedService.addTblClimateScenarioYear(tblClimateScenarioYears.get(i));
			}
		}
		
		if(tblIndustyUrbanSce!=null){
			List<TblIndustyUrbanSce> TblIndustyUrbanSces = jxlService.getAllContenttTblIndustyUrbanSces(tblIndustyUrbanSce.getInputStream());
			logger.info(TblIndustyUrbanSces.size()+"产业与城市发展情景");
			for(int i=0;i<TblIndustyUrbanSces.size();i++){
				watershedService.addTblIndustyUrbanSce(TblIndustyUrbanSces.get(i));
			}
		}
		
		if(tblLandUseSce!=null){
			List<TblLandUseSce> TblLandUseSces = jxlService.getAllContentTblLandUseSce(tblLandUseSce.getInputStream());
			logger.info(TblLandUseSces.size()+"土地种类");
			for(int i=0;i<TblLandUseSces.size();i++){
				watershedService.addTblLandUseSce(TblLandUseSces.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblCropPattern> TblCropPatterns = jxlService.getAllContentTblCropPattern(tblCropPattern.getInputStream());
			logger.info(TblCropPatterns.size()+"种植结构");
			for(int i=0;i<TblCropPatterns.size();i++){
				watershedService.addtblCropPattern(TblCropPatterns.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblSocioEconSce> TblSocioEconSces = jxlService.getAllContentTblSocioEconSce(tblCropPattern.getInputStream());
			logger.info(TblSocioEconSces.size()+"GDP数据");
			for(int i=0;i<TblSocioEconSces.size();i++){
				watershedService.addtblSocioEconSce(TblSocioEconSces.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblPrefPolicy> TblPrefPolicys = jxlService.getAllContentTblPrefPolicy(tblCropPattern.getInputStream());
			logger.info(TblPrefPolicys.size()+"优惠政策");
			for(int i=0;i<TblPrefPolicys.size();i++){
				watershedService.addtblPrefPolicy(TblPrefPolicys.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblHydrEngineering> TblHydrEngineerings = jxlService.getAllContentTblHydrEngineering(tblCropPattern.getInputStream());
			logger.info(TblHydrEngineerings.size()+"水利工程");
			for(int i=0;i<TblHydrEngineerings.size();i++){
				watershedService.addtblHydrEngineering(TblHydrEngineerings.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblWaterResManSce> TblWaterResManSces = jxlService.getAllContentTblWaterResManSce(tblCropPattern.getInputStream());
			logger.info(TblWaterResManSces.size()+"水资源面积");
			for(int i=0;i<TblWaterResManSces.size();i++){
				watershedService.addtblWaterResManSce(TblWaterResManSces.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblWaterUseCounty> TblWaterUseCountys = jxlService.getAllContentTblWaterUseCounty(tblCropPattern.getInputStream());
			logger.info(TblWaterUseCountys.size()+"县区三产用水量");
			for(int i=0;i<TblWaterUseCountys.size();i++){
				watershedService.addtblWaterUseCounty(TblWaterUseCountys.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblWaterRightCounty> TblWaterRightCountys = jxlService.getAllContentTblWaterRightCounty(tblCropPattern.getInputStream());
			logger.info(TblWaterRightCountys.size()+"县区水权分配");
			for(int i=0;i<TblWaterRightCountys.size();i++){
				watershedService.addtblWaterRightCounty(TblWaterRightCountys.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblMidDownWaterAllo> TblMidDownWaterAllos = jxlService.getAllContentTblMidDownWaterAllo(tblCropPattern.getInputStream());
			logger.info(TblMidDownWaterAllos.size()+"流域中下游水分配");
			for(int i=0;i<TblMidDownWaterAllos.size();i++){
				watershedService.addtblMidDownWaterAllo(TblMidDownWaterAllos.get(i));
			}
		}
		
		if(tblCropPattern!=null){
			List<TblWaterAlloCounty> TblWaterAlloCountys = jxlService.getAllContentTblWaterAlloCounty(tblCropPattern.getInputStream());
			logger.info(TblWaterAlloCountys.size()+"县区用水量");
			for(int i=0;i<TblWaterAlloCountys.size();i++){
				watershedService.addtblWaterAlloCounty(TblWaterAlloCountys.get(i));
			}
		}
	}
	
}

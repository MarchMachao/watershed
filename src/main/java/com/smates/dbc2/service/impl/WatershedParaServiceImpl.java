package com.smates.dbc2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.WatershedParaDao;
import com.smates.dbc2.po.MidAndDownStreamPercentPara;
import com.smates.dbc2.po.SaveWater;
import com.smates.dbc2.po.TbLanduseScePara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
import com.smates.dbc2.po.TbWaterManSceCWPara;
import com.smates.dbc2.po.TbWaterManSceMDPara;
import com.smates.dbc2.po.TbWaterManSceWRPara;
import com.smates.dbc2.po.TblClimateScePara;
import com.smates.dbc2.po.TblIndUrbanScePara;
import com.smates.dbc2.service.WatershedParaService;
import com.smates.dbc2.vo.ProjectIdAndCountyId;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 下午2:22:29
 */

@Service
public class WatershedParaServiceImpl implements WatershedParaService {
	@Autowired
	private WatershedParaDao watershedParaDao;

	@Override
	public void addTblClimateScePara(String projectId, String countryId, String rainInc, String tempInc, String year) {
		watershedParaDao.addTblClimateScePara(new TblClimateScePara(projectId, countryId, rainInc, tempInc, year));
	}

	@Override
	public void deleteTblclimateSceParaById(String projectId, String countryId,String year) {
		watershedParaDao.deleteTblclimateSceParaById(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public void addTblIndUrbanScePara(String projectId, String countryId, String nonFarmPercent, String fldIndOutput,
			String fldIndOutputPercent, String fldAgrOutput, String fldAgrOutputPercent, String fldSerOutput,
			String fldSerOutputPercent, String industryProgressRate, String changeRateOfTourismIndustry) {
		watershedParaDao.addTblIndUrbanScePara(new TblIndUrbanScePara(projectId, countryId, nonFarmPercent,
				fldIndOutput, fldIndOutputPercent, fldAgrOutput, fldAgrOutputPercent, fldSerOutput, fldSerOutputPercent,
				industryProgressRate, changeRateOfTourismIndustry));
	}

	@Override
	public void deleteTblIndUrbanScePara(String projectId, String countryId) {
		watershedParaDao.deleteTblIndUrbanScePara(new ProjectIdAndCountyId(projectId, countryId,null));
	}

	@Override
	public void addTbLanduseScePara(String projectId, String countryId, String fldFarmAreaChgR, String wheatChgR,
			String cornChgR, String oilPlantsChgR, String vegetablesChgR, String orchardChgR, String cottonChgR,
			String wheatArea, String cornArea, String oilPlantsArea, String vegetablesArea, String orchardArea,
			String cottonArea, String wetlandArea, String forestArea, String grassArea, String waterArea) {
		watershedParaDao.addTbLanduseScePara(new TbLanduseScePara(projectId, countryId, fldFarmAreaChgR, wheatChgR,
				cornChgR, oilPlantsChgR, vegetablesChgR, orchardChgR, cottonChgR, wheatArea, cornArea, oilPlantsArea,
				vegetablesArea, orchardArea, cottonArea, wetlandArea, forestArea, grassArea, waterArea));
	}

	@Override
	public void deleteTbLanduseScePara(String projectId, String countryId) {
		watershedParaDao.deleteTbLanduseScePara(new ProjectIdAndCountyId(projectId, countryId,null));
	}

	@Override
	public void addTbSocioEconomyScePara(String projectId, String countryId, String perCapGDPR,String perCapGDP,
			String fldMainCannelLeng, String fldMainCanWUE, String fldBranCannelLeng, String fldBranCanWUE,
			String fldDouLeng, String fldDouWUE, String fldNongLeng, String fldNongWUE, String fldMaoLeng,
			String fldMaoWUE, String fldSprinkingArea, String fldDropIrrArea, String fldIndustryAllowance,
			String fldFarmAllowance, String fldServiceAllowance,String year) {
		watershedParaDao.addTbSocioEconomyScePara(new TbSocioEconomyScePara(projectId, countryId, perCapGDPR,perCapGDP,
				fldMainCannelLeng, fldMainCanWUE, fldBranCannelLeng, fldBranCanWUE, fldDouLeng, fldDouWUE, fldNongLeng,
				fldNongWUE, fldMaoLeng, fldMaoWUE, fldSprinkingArea, fldDropIrrArea, fldIndustryAllowance,
				fldFarmAllowance, fldServiceAllowance,year));
	}

	@Override
	public void deleteTbSocioEconomyScePara(String projectId, String countryId,String year) {
		watershedParaDao.deleteTbSocioEconomyScePara(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public TblClimateScePara getTblClimateSceParaByProjectIdAndCountryId(String projectId, String countryId,String year) {
		return watershedParaDao
				.getTblClimateSceParaByProjectIdAndCountryId(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public TblIndUrbanScePara getTblIndUrbanSceParaByProjectIdAndCountryId(String projectId, String countryId,String year) {
		return watershedParaDao
				.getTblIndUrbanSceParaByProjectIdAndCountryId(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public TbLanduseScePara getTbLanduseSceParaByProjectIdAndCountryId(String projectId, String countryId,String year) {
		return watershedParaDao
				.getTbLanduseSceParaByProjectIdAndCountryId(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public TbSocioEconomyScePara getTbSocioEconomySceParaByProjectIdAndCountryId(String projectId, String countryId,String year) {
		return watershedParaDao
				.getTbSocioEconomySceParaByProjectIdAndCountryId(new ProjectIdAndCountyId(projectId, countryId,year));
	}

	@Override
	public void addTbWaterManSceCWPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldDate, double fldSurfaceWater, double fldGroundWater) {
		watershedParaDao.addTbWaterManSceCWPara(new TbWaterManSceCWPara(fldWatershedCode, fldProjectCode, fldCountyCode,
				fldDate, fldSurfaceWater, fldGroundWater));
	}

	@Override
	public void addTbWaterManSceMDPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldDate, double fldWaterUseMid, double fldWaterUseDown) {
		watershedParaDao.addTbWaterManSceMDPara(new TbWaterManSceMDPara(fldWatershedCode, fldProjectCode, fldCountyCode,
				fldDate, fldWaterUseMid, fldWaterUseDown));
	}

	@Override
	public void addTbWaterManSceWRPara(String fldWatershedCode, String fldProjectCode, String fldCountyCode,
			String fldDate, double fldWaterRightRatio) {
		watershedParaDao.deleteTbWaterManSceWRPara(new ProjectIdAndCountyId(fldProjectCode, fldCountyCode,null));
		watershedParaDao.addTbWaterManSceWRPara(
				new TbWaterManSceWRPara(fldWatershedCode, fldProjectCode, fldCountyCode, fldDate, fldWaterRightRatio));
	}

	@Override
	public void addMidAndDownStreamPercentPara(String projectId, String watershedId, double serfaceWater,
			double midstreamPercent, double downstreamPercent) {
		watershedParaDao.deleteMidAndDownStreamPercentPara(projectId);
		watershedParaDao.addMidAndDownStreamPercentPara(new MidAndDownStreamPercentPara(projectId, watershedId,
				serfaceWater, midstreamPercent, downstreamPercent));
	}

	@Override
	public void addSaveWater(String projectId, String countryId, double savewater) {
		watershedParaDao.deleteSaveWater(new ProjectIdAndCountyId(projectId, countryId,"2014"));
		watershedParaDao.addSaveWater(new SaveWater(projectId, countryId, savewater,"2014"));
	}

}

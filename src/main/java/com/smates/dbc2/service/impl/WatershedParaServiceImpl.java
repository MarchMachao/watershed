package com.smates.dbc2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.WatershedParaDao;
import com.smates.dbc2.po.TbLanduseScePara;
import com.smates.dbc2.po.TbSocioEconomyScePara;
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
	public void addTblClimateScePara(String projectId, String countryId, String rainInc, String tempInc) {
		watershedParaDao.addTblClimateScePara(new TblClimateScePara(projectId, countryId, rainInc, tempInc));
	}
	
	@Override
	public void deleteTblclimateSceParaById(String projectId,String countryId){
		watershedParaDao.deleteTblclimateSceParaById(new ProjectIdAndCountyId(projectId, countryId));
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
		watershedParaDao.deleteTblIndUrbanScePara(new ProjectIdAndCountyId(projectId, countryId));
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
		watershedParaDao.deleteTbLanduseScePara(new ProjectIdAndCountyId(projectId, countryId));
	}

	@Override
	public void addTbSocioEconomyScePara(String projectId, String countryId, String perCapGDPR,
			String fldMainCannelLeng, String fldMainCanWUE, String fldBranCannelLeng, String fldBranCanWUE,
			String fldDouLeng, String fldDouWUE, String fldNongLeng, String fldNongWUE, String fldMaoLeng,
			String fldMaoWUE, String fldSprinkingArea, String fldDropIrrArea, String fldIndustryAllowance,
			String fldFarmAllowance, String fldServiceAllowance) {
		watershedParaDao.addTbSocioEconomyScePara(new TbSocioEconomyScePara(projectId, countryId, perCapGDPR,
				fldMainCannelLeng, fldMainCanWUE, fldBranCannelLeng, fldBranCanWUE, fldDouLeng, fldDouWUE, fldNongLeng,
				fldNongWUE, fldMaoLeng, fldMaoWUE, fldSprinkingArea, fldDropIrrArea, fldIndustryAllowance,
				fldFarmAllowance, fldServiceAllowance));
	}

	@Override
	public void deleteTbSocioEconomyScePara(String projectId, String countryId) {
		watershedParaDao.deleteTbLanduseScePara(new ProjectIdAndCountyId(projectId, countryId));
	}
	

}

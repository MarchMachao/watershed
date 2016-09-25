package com.smates.dbc2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.WatershedDao;
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
import com.smates.dbc2.po.Watershed;
import com.smates.dbc2.service.WatershedService;

@Service
public class WatershedServiceImpl implements WatershedService {

	@Autowired
	private WatershedDao watershedDao;

	@Override
	public void addTblClimateScenarioYear(TblClimateScenarioYear tblClimateScenarioYear) {
		watershedDao.addTblClimateScenarioYear(tblClimateScenarioYear);
	}

	@Override
	public void addTblClimateScenarioMonth(TblClimateScenarioMonth tblClimateScenarioMonth) {
		watershedDao.addTblClimateScenarioMonth(tblClimateScenarioMonth);
	}

	@Override
	public List<TblClimateScenarioYear> getTblClimateScenarioYearsByfldCRPType(String fldCRPType) {
		return watershedDao.geTblClimateScenarioYearsByfldCRPType(fldCRPType);
	}

	@Override
	public void addTblIndustyUrbanSce(TblIndustyUrbanSce tblIndustyUrbanSce) {
		watershedDao.addTblIndustyUrbanSce(tblIndustyUrbanSce);
	}

	@Override
	public void addTblLandUseSce(TblLandUseSce tblLandUseSce) {
		watershedDao.addtblLandUseSce(tblLandUseSce);
	}

	@Override
	public void addtblCropPattern(TblCropPattern tblCropPattern) {
		watershedDao.addtblCropPattern(tblCropPattern);
	}

	@Override
	public void addtblSocioEconSce(TblSocioEconSce tblSocioEconSce) {
		watershedDao.addtblSocioEconSce(tblSocioEconSce);

	}

	@Override
	public void addtblPrefPolicy(TblPrefPolicy tblPrefPolicy) {
		watershedDao.addtblPrefPolicy(tblPrefPolicy);

	}

	@Override
	public void addtblHydrEngineering(TblHydrEngineering tblHydrEngineering) {
		watershedDao.addtblHydrEngineering(tblHydrEngineering);

	}

	@Override
	public void addtblWaterResManSce(TblWaterResManSce tblWaterResManSce) {
		watershedDao.addtblWaterResManSce(tblWaterResManSce);

	}

	@Override
	public void addtblWaterUseCounty(TblWaterUseCounty tblWaterUseCounty) {
		watershedDao.addtblWaterUseCounty(tblWaterUseCounty);

	}

	@Override
	public void addtblWaterRightCounty(TblWaterRightCounty tblWaterRightCounty) {
		watershedDao.addtblWaterRightCounty(tblWaterRightCounty);

	}

	@Override
	public void addtblMidDownWaterAllo(TblMidDownWaterAllo tblMidDownWaterAllo) {
		watershedDao.addtblMidDownWaterAllo(tblMidDownWaterAllo);

	}

	@Override
	public void addtblWaterAlloCounty(TblWaterAlloCounty tblWaterAlloCounty) {
		watershedDao.addtblWaterAlloCounty(tblWaterAlloCounty);

	}

	@Override
	public List<TblClimateScenarioYear> geTblClimateScenarioYearsByfldCRPType(String fldCRPType) {
		return watershedDao.geTblClimateScenarioYearsByfldCRPType(fldCRPType);
	}

	@Override
	public void addWatershedInfo(String id, String name, String describe) {
		watershedDao.addWatershed(new Watershed(id, name, describe));
	}

}

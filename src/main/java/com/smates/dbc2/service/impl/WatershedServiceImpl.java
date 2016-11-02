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
import com.smates.dbc2.vo.CRPTypeAndCountryId;
import com.smates.dbc2.vo.DataGrideRow;
import com.smates.dbc2.vo.WatershedParaVo;

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
	public List<TblClimateScenarioYear> getTblClimateScenarioYearsByfldCRPType(String fldCRPType,String countryId) {
		return watershedDao.geTblClimateScenarioYearsByfldCRPType(new CRPTypeAndCountryId(fldCRPType, countryId));
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
	public void addWatershedInfo(String id, String name, String describe) {
		watershedDao.addWatershed(new Watershed(id, name, describe));
	}

	@Override
	public List<TblClimateScenarioMonth> getTblClimateScenarioMonthByfldCRPType(String fldCRPType) {
		return watershedDao.getTblClimateScenarioMonthByfldCRPType(fldCRPType);
	}

	@Override
	public List<TblIndustyUrbanSce> getTblIndustyUrbanSceByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblIndustyUrbanSceByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblSocioEconSce> getTblSocioEconSceByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblSocioEconSceByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblPrefPolicy> getTblPrefPolicyByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblPrefPolicyByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblHydrEngineering> getTblHydrEngineeringByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblHydrEngineeringByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblLandUseSce> getTblLandUseSceByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblLandUseSceByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblCropPattern> getTblCropPatternByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblCropPatternByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblWaterResManSce> getTblWaterResManSceByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblWaterResManSceByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblWaterUseCounty> getTblWaterUseCountyByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblWaterUseCountyByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblWaterRightCounty> getTblWaterRightCountyByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblWaterRightCountyByfldCountyCode(fldCountyCode);
	}

	@Override
	public List<TblMidDownWaterAllo> getTblMidDownWaterAllo() {
		return watershedDao.getTblMidDownWaterAllo();
	}

	@Override
	public List<TblWaterAlloCounty> getTblWaterAlloCountyByfldCountyCode(String fldCountyCode) {
		return watershedDao.getTblWaterAlloCountyByfldCountyCode(fldCountyCode);
	}

	@Override
	public DataGrideRow<Watershed> getWatershedFormateDataGride(String name, int page, int rows) {
		List<Watershed> watersheds = watershedDao.getWatershedByName(new WatershedParaVo(name, rows, (page-1)*rows));
		return new DataGrideRow<Watershed>(watershedDao.getWatershedSum(name), watersheds);
	}

	@Override
	public void deleteWatershed(String id) {
		watershedDao.deleteWatershed(id);
	}



}

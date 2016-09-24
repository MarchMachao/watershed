package com.smates.dbc2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.WatershedDao;
import com.smates.dbc2.po.TblClimateScenarioMonth;
import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.po.TblLandUseSce;
import com.smates.dbc2.po.Watershed;
import com.smates.dbc2.service.WatershedService;

@Service
public class WatershedServiceImpl implements WatershedService {

	@Autowired
	private WatershedDao watershedDao;

	@Override
	public void addWatershedInfo(String name, String describe) {
		watershedDao.addWatershed(new Watershed(name, describe));
	}

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

}

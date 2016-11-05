package com.smates.dbc2.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.CountryDao;
import com.smates.dbc2.mapper.ProjectDao;
import com.smates.dbc2.mapper.WatershedDao;
import com.smates.dbc2.mapper.WatershedParaDao;
import com.smates.dbc2.po.Country;
import com.smates.dbc2.po.Project;
import com.smates.dbc2.service.GetWebServiceParaService;
import com.smates.dbc2.ws.DoubleArray;

@Service
public class GetWebServiceParaServiceImpl implements GetWebServiceParaService {

	@Autowired
	private CountryDao countrydao;

	@Autowired
	private ProjectDao projectDao;

	@Autowired
	private WatershedDao watershedDao;

	@Autowired
	private WatershedParaDao watershedParaDao;

	@Override
	public List<String> getCountryCodes() {
		List<String> CountryCodes = new ArrayList<String>();
		List<Country> countries = countrydao.getAllCountry();
		for (int i = 0; i < countries.size(); i++) {
			CountryCodes.add(countries.get(i).getCountryId());
		}
		return CountryCodes;
	}

	@Override
	public List<String> getCountryNames() {
		List<String> CountryNames = new ArrayList<String>();
		List<Country> countries = countrydao.getAllCountry();
		for (int i = 0; i < countries.size(); i++) {
			CountryNames.add(countries.get(i).getCountryName());
		}
		return CountryNames;
	}

	@Override
	public Project getProjectById(String projectId) {
		return projectDao.getProjectById(projectId);
	}

	@Override
	public List<DoubleArray> getTblClimateScenarioYear() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblClimateScenarioYear(),"getFldDate","getFldPrecipitation");
	}

	private List<DoubleArray> ToDoubleArray(List<?> tblClimateScenarioYears, String DateMethod, String dataMethod)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz;
		Method dateMethodName = null;
		Method dataMethodName = null;
		List<DoubleArray> para = new ArrayList<DoubleArray>();
		List<Double> items = new ArrayList<Double>();
		String date = null;
		for (int i = 0; i < tblClimateScenarioYears.size(); i++) {

			clazz = tblClimateScenarioYears.get(i).getClass();
			try {
				dateMethodName = clazz.getDeclaredMethod(DateMethod);
				dataMethodName = clazz.getDeclaredMethod(dataMethod);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}

			if (date == null) {
				date = (String) dateMethodName.invoke(tblClimateScenarioYears.get(i), null);
				// tblClimateScenarioYears.get(i).getFldDate();
			}
			// if(date.equals(tblClimateScenarioYears.get(i).getFldDate())){
			if (date.equals((String) dateMethodName.invoke(tblClimateScenarioYears.get(i), null))) {
//				 items.add(tblClimateScenarioYears.get(i).getFldPrecipitation());
				items.add((double) dataMethodName.invoke(tblClimateScenarioYears.get(i), null));
				
			} else {
				para.add(new DoubleArray(items));
				items = new ArrayList<Double>();
				// date = tblClimateScenarioYears.get(i).getFldDate();
				date = (String) dateMethodName.invoke(tblClimateScenarioYears.get(i), null);
				// items.add(tblClimateScenarioYears.get(i).getFldPrecipitation());
				items.add((double) dataMethodName.invoke(tblClimateScenarioYears.get(i), null));
			}
		}
		para.add(new DoubleArray(items));
		return para;
	}

	@Override
	public List<DoubleArray> getprecR(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTblClimateSceParaByProjectId(projectId),"getFldDate","getFldPrecipitation");
	}

}

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
			}
			if (date.equals((String) dateMethodName.invoke(tblClimateScenarioYears.get(i), null))) {
				try{
					items.add(Double.parseDouble((String)dataMethodName.invoke(tblClimateScenarioYears.get(i), null)));
				}catch (Exception e) {
					items.add((Double)dataMethodName.invoke(tblClimateScenarioYears.get(i), null));
				}
				
				
			} else {
				para.add(new DoubleArray(items));
				items = new ArrayList<Double>();
				date = (String) dateMethodName.invoke(tblClimateScenarioYears.get(i), null);
				try{
					items.add(Double.parseDouble((String)dataMethodName.invoke(tblClimateScenarioYears.get(i), null)));
				}catch (Exception e) {
					items.add((Double)dataMethodName.invoke(tblClimateScenarioYears.get(i), null));
				}
			}
		}
		para.add(new DoubleArray(items));
		return para;
	}

	@Override
	public List<DoubleArray> getprecR(String projectId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTblClimateSceParaByProjectId(projectId),"getYear","getRainInc");
	}

	@Override
	public List<DoubleArray> gettempAvg()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblClimateScenarioYear(),"getFldDate","getFldAvgTemperature");
	}

	@Override
	public List<DoubleArray> gettempMax()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblClimateScenarioYear(),"getFldDate","getFldMaxTemp");
	}

	@Override
	public List<DoubleArray> gettempMin()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblClimateScenarioYear(),"getFldDate","getFldMinTemp");

	}

	@Override
	public List<DoubleArray> getTblMidDownWaterAllo()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblMidDownWaterAllo(),"getFldDate","getFldWaterUseMid");
	}

	@Override
	public List<DoubleArray> getTblDownDownWaterAllo()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblMidDownWaterAllo(),"getFldDate","getFldWaterUseDown");
	}

	@Override
	public List<DoubleArray> getfldWaterRightRatio(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTbWaterManSceWRParaByProjectId(projectId),"getFldDate","getFldWaterRightRatio");
	}

	@Override
	public List<DoubleArray> getSaveWater(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getSaveWaterByProjectId(projectId),"getYear","getSavewater");
	}

	@Override
	public List<DoubleArray> getGDP()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblSocioEconSce(),"getFldDate","getFldGDP");
	}

	@Override
	public List<DoubleArray> getgdpPer()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedDao.getTblSocioEconSce(),"getFldDate","getFldPerCapGDP");
	}

	@Override
	public List<DoubleArray> getGDPInc(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTbSocioEconomyScePara(projectId),"getYear","getPerCapGDP");
	}

	@Override
	public List<DoubleArray> getGDPperInc(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTbSocioEconomyScePara(projectId),"getYear","getPerCapGDPR");
	}

	@Override
	public List<DoubleArray> getchannelMain(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTbSocioEconomyScePara(projectId),"getYear","getFldMainCannelLeng");
	}

	@Override
	public List<DoubleArray> getchannelBran(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return ToDoubleArray(watershedParaDao.getTbSocioEconomyScePara(projectId),"getYear","getFldBranCannelLeng");
	}

	@Override
	public List<DoubleArray> getchannelDou(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DoubleArray> getchannelNong(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DoubleArray> getchannelMao(String projectId)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

}

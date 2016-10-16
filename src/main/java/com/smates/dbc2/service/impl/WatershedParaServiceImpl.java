package com.smates.dbc2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.WatershedParaDao;
import com.smates.dbc2.po.TbLanduseSceCropPara;
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
		watershedParaDao.addTblIndUrbanScePara(new TblIndUrbanScePara(projectId, countryId, nonFarmPercent, fldIndOutput, fldIndOutputPercent, fldAgrOutput, fldAgrOutputPercent, fldSerOutput, fldSerOutputPercent, industryProgressRate, changeRateOfTourismIndustry));
	}

	@Override
	public void deleteTblIndUrbanScePara(String projectId, String countryId) {
		watershedParaDao.deleteTblIndUrbanScePara(new ProjectIdAndCountyId(projectId, countryId));
	}

	

}

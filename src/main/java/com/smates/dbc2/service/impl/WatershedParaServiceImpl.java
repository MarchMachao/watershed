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
	public void addTblIndUrbanScePara(TblIndUrbanScePara tblIndUrbanScePara) {
		watershedParaDao.addTblIndUrbanScePara(tblIndUrbanScePara);

	}

	@Override
	public void addTbLanduseSceCropPara(TbLanduseSceCropPara tbLanduseSceCropPara) {
		watershedParaDao.addTbLanduseSceCropPara(tbLanduseSceCropPara);

	}

	@Override
	public void addTbSocioEconomyScePara(TbSocioEconomyScePara tbSocioEconomyScePara) {
		watershedParaDao.addTbSocioEconomyScePara(tbSocioEconomyScePara);
	}

	@Override
	public void addTbSocioEconomyScePoyPara(TbSocioEconomyScePoyPara tbSocioEconomyScePoyPara) {
		watershedParaDao.addTbSocioEconomyScePoyPara(tbSocioEconomyScePoyPara);
	}

	@Override
	public void addTbSocioEconomySceHydEngPara(TbSocioEconomySceHydEngPara tbSocioEconomySceHydEngPara) {
		watershedParaDao.addTbSocioEconomySceHydEngPara(tbSocioEconomySceHydEngPara);
	}

	@Override
	public void addTbWaterManScePara(TbWaterManScePara tbWaterManScePara) {
		watershedParaDao.addTbWaterManScePara(tbWaterManScePara);
	}

	@Override
	public void addTbWaterManSceTWPara(TbWaterManSceTWPara tbWaterManSceTWPara) {
		watershedParaDao.addTbWaterManSceTWPara(tbWaterManSceTWPara);
	}

	@Override
	public void addTbWaterManSceWRPara(TbWaterManSceWRPara tbWaterManSceWRPara) {
		watershedParaDao.addTbWaterManSceWRPara(tbWaterManSceWRPara);
	}

	@Override
	public void addTbWaterManSceMDPara(TbWaterManSceMDPara tbWaterManSceMDPara) {
		watershedParaDao.addTbWaterManSceMDPara(tbWaterManSceMDPara);
	}

	@Override
	public void addTbWaterManSceCWPara(TbWaterManSceCWPara tbWaterManSceCWPara) {
		watershedParaDao.addTbWaterManSceCWPara(tbWaterManSceCWPara);
	}

}

package com.smates.dbc2.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.consts.Consts;
import com.smates.dbc2.mapper.DevelopIndexDao;
import com.smates.dbc2.mapper.GisDao;
import com.smates.dbc2.mapper.GisIndexDao;
import com.smates.dbc2.po.Developindex;
import com.smates.dbc2.po.GisIndex;
import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.service.GisService;

@Service
public class GisServiceImpl implements GisService {

	@Autowired
	private GisDao gisDao;

	@Autowired
	private GisIndexDao gisIndexDao;

	@Autowired
	private DevelopIndexDao developIndexDao;

	@Override
	public List<Gisecharts> getAllGisecharts() {
		return gisDao.getAllGisecharts();
	}

	@Override
	public void addGisecharts(String year, String resultOverall, String resultP1, String resultP2, String resultP3) {
		gisDao.addGisecharts(new Gisecharts(year, resultOverall, resultP1, resultP2, resultP3));

	}

	@Override
	public void deleteGisecharts(String year) {
		gisDao.deleteGisecharts(year);
	}

	@Override
	public void updateGisIndex() {
		gisIndexDao.deleteAllIndex();
		int oid = 0;
		for (int i = 0; i < Consts.countryNames.length; i++) {
			for (int j = 0; j < Consts.indexs.length; j++) {
				for (int k = 2000; k < 2014; k++) {
					gisIndexDao.InsertIndex(new GisIndex(oid, Consts.countryNames[i], Consts.indexs[j], k,
							(new Random()).nextInt(200)));
					oid++;
				}
			}
		}
	}

	@Override
	public void updateDevelop() {
		developIndexDao.deleteDevelopIndex();
		int oid = 0;
		double[] developindex = Consts.development;
		double random = Math.random();
		for (int i = 0; i < Consts.countryNames.length; i++) {
			for (int k = 2000; k < 2014; k++) {
				random = Math.random();
				developIndexDao.addDevelopIndex(new Developindex(oid, Consts.countryNames[i], developindex[0]*random,
						developindex[1]*random, developindex[2]*random, developindex[3]*random, developindex[4]*random, developindex[5]*random,
						developindex[6]*random, developindex[7]*random, developindex[8]*random, k));
				oid++;
			}
		}
	}

}

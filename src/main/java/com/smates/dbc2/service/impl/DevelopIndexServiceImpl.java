package com.smates.dbc2.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.DevelopIndexDao;
import com.smates.dbc2.po.Developindex;
import com.smates.dbc2.service.DevelopIndexService;

@Service
public class DevelopIndexServiceImpl implements DevelopIndexService{

	@Autowired
	private DevelopIndexDao developIndexDao;
	
	@Override
	public void addDevelopIndex(int oid, String countyname, float aQ, float eQ, float mGWD, float gDP, float iAGDP, float mIA,
			float pop, float dFA, float dLA, int year) {
		developIndexDao.addDevelopIndex(new Developindex(oid, countyname, aQ, eQ, mGWD, gDP, iAGDP, mIA, pop, dFA, dLA, year));
	}

	@Override
	public void updateDevelopIndex() {
		List<Developindex> developindexs= developIndexDao.getAllDevelopIndex();
		developIndexDao.deleteDevelopIndex();
		System.out.println(developindexs.size());
		for(int i=0;i<developindexs.size();i++){
			System.out.println(i);
			developindexs.get(i).setAQ((new Random()).nextInt(300));
			developindexs.get(i).setDFA((new Random()).nextInt(300));
			developindexs.get(i).setDLA((new Random()).nextInt(300));
			developindexs.get(i).setEQ((new Random()).nextInt(300));
			developindexs.get(i).setGDP((new Random()).nextInt(300));
			developindexs.get(i).setIAGDP((new Random()).nextInt(300));
			developindexs.get(i).setMGWD((new Random()).nextInt(300));
			developindexs.get(i).setMIA((new Random()).nextInt(300));
			developindexs.get(i).setPop((new Random()).nextInt(300));
			developIndexDao.addDevelopIndex(developindexs.get(i));
		}
	}

}

package com.smates.dbc2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smates.dbc2.mapper.GisDao;
import com.smates.dbc2.po.Gisecharts;
import com.smates.dbc2.service.GisService;

@Service
public class GisServiceImpl implements GisService {

	@Autowired
	private GisDao gisDao;

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

}

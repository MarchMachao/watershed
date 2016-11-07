package com.smates.dbc2.service.impl;

import org.springframework.stereotype.Service;

import com.smates.dbc2.model.ModelWaterProductivity;
import com.smates.dbc2.service.IndexCalculateService;

/**
 * 指标计算
 * @author baijw
 *
 */
@Service
public class IndexCalculateServiceImpl implements IndexCalculateService{

	@Override
	public double WaterProductivity() {
		ModelWaterProductivity modelWaterProductivity = new ModelWaterProductivity();
		return modelWaterProductivity.calc(outputInd, outputAgr, outputSer, waterUseInd, waterUseAgr, waterUseSer);
	}

	@Override
	public double reduceWaterUseP() {
		return 0;
	}

	@Override
	public double SafeDrinkingWaterRate() {
		return 0;
	}

	@Override
	public double IWRMRate() {
		return 0;
	}

	@Override
	public double TransboundaryAvailability() {
		return 0;
	}

	@Override
	public double OutputWetlandArea() {
		return 0;
	}

	@Override
	public double OutputMinWater() {
		return 0;
	}

	@Override
	public double OutputWaterExtraction() {
		return 0;
	}

	@Override
	public double OutputMidWaterUse() {
		return 0;
	}

	@Override
	public double ForestCoverageRate() {
		return 0;
	}

	@Override
	public double ForestSustainableRate() {
		return 0;
	}

	@Override
	public double MountainGreenCoverageRate() {
		return 0;
	}

	@Override
	public double GDPPerCapita() {
		return 0;
	}

	@Override
	public double GDPPerPersonEmployed() {
		return 0;
	}

	@Override
	public double YouthEmpRate() {
		return 0;
	}

	@Override
	public double YouthUnempRate() {
		return 0;
	}

	@Override
	public double GDPTourismRate() {
		return 0;
	}

	@Override
	public double TourConsRate() {
		return 0;
	}

	@Override
	public double LandPopuRate() {
		return 0;
	}

	@Override
	public double UrbanizationRate() {
		return 0;
	}

	@Override
	public double WaterProductivityAgri() {
		return 0;
	}

	@Override
	public double WaterUseEfficiencyAgri() {
		return 0;
	}

	@Override
	public double AgriOutputPerHectare() {
		return 0;
	}

	@Override
	public double OutputAgriArea() {
		return 0;
	}

	@Override
	public double OutputSocialWelWare() {
		return 0;
	}

}

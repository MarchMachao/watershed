package com.smates.dbc2.po;

import java.util.UUID;

/**
 * @author machao march.machao@gmail.com
 * @version 创建时间：2016年9月29日 上午10:54:43
 */
public class TbLanduseScePara {
	private String id;
	private String fldWatershedCode;
	private String fldProjectCode;
	private String fldCountyCode;
	private String fldDate;
	private double fldFarmArea;
	private double fldFarmAreaChgR;
	private double fldWetlandArea;
	private double fldForestArea;
	private double fldGrassArea;
	private double fldHuYangArea;
	private double fldWaterArea;

	public TbLanduseScePara() {
	}

	public TbLanduseScePara(String fldWatershedCode, String fldProjectCode, String fldCountyCode, String fldDate,
			double fldFarmArea, double fldFarmAreaChgR, double fldWetlandArea, double fldForestArea,
			double fldGrassArea, double fldHuYangArea, double fldWaterArea) {
		this.id = UUID.randomUUID().toString();
		this.fldWatershedCode = fldWatershedCode;
		this.fldProjectCode = fldProjectCode;
		this.fldCountyCode = fldCountyCode;
		this.fldDate = fldDate;
		this.fldFarmArea = fldFarmArea;
		this.fldFarmAreaChgR = fldFarmAreaChgR;
		this.fldWetlandArea = fldWetlandArea;
		this.fldForestArea = fldForestArea;
		this.fldGrassArea = fldGrassArea;
		this.fldHuYangArea = fldHuYangArea;
		this.fldWaterArea = fldWaterArea;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFldWatershedCode() {
		return fldWatershedCode;
	}

	public void setFldWatershedCode(String fldWatershedCode) {
		this.fldWatershedCode = fldWatershedCode;
	}

	public String getFldProjectCode() {
		return fldProjectCode;
	}

	public void setFldProjectCode(String fldProjectCode) {
		this.fldProjectCode = fldProjectCode;
	}

	public String getFldCountyCode() {
		return fldCountyCode;
	}

	public void setFldCountyCode(String fldCountyCode) {
		this.fldCountyCode = fldCountyCode;
	}

	public String getFldDate() {
		return fldDate;
	}

	public void setFldDate(String fldDate) {
		this.fldDate = fldDate;
	}

	public double getFldFarmArea() {
		return fldFarmArea;
	}

	public void setFldFarmArea(double fldFarmArea) {
		this.fldFarmArea = fldFarmArea;
	}

	public double getFldFarmAreaChgR() {
		return fldFarmAreaChgR;
	}

	public void setFldFarmAreaChgR(double fldFarmAreaChgR) {
		this.fldFarmAreaChgR = fldFarmAreaChgR;
	}

	public double getFldWetlandArea() {
		return fldWetlandArea;
	}

	public void setFldWetlandArea(double fldWetlandArea) {
		this.fldWetlandArea = fldWetlandArea;
	}

	public double getFldForestArea() {
		return fldForestArea;
	}

	public void setFldForestArea(double fldForestArea) {
		this.fldForestArea = fldForestArea;
	}

	public double getFldGrassArea() {
		return fldGrassArea;
	}

	public void setFldGrassArea(double fldGrassArea) {
		this.fldGrassArea = fldGrassArea;
	}

	public double getFldHuYangArea() {
		return fldHuYangArea;
	}

	public void setFldHuYangArea(double fldHuYangArea) {
		this.fldHuYangArea = fldHuYangArea;
	}

	public double getFldWaterArea() {
		return fldWaterArea;
	}

	public void setFldWaterArea(double fldWaterArea) {
		this.fldWaterArea = fldWaterArea;
	}

}

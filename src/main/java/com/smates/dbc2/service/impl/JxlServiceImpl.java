package com.smates.dbc2.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smates.dbc2.po.TblClimateScenarioMonth;
import com.smates.dbc2.po.TblClimateScenarioYear;
import com.smates.dbc2.po.TblIndustyUrbanSce;
import com.smates.dbc2.service.JxlService;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@Service
public class JxlServiceImpl implements JxlService {

	@Override
	public String getContent(int row, int col, InputStream fis) {
		jxl.Workbook rwb = null;
		String result = "";
		try {
			rwb = Workbook.getWorkbook(fis);
			Sheet sheet = rwb.getSheet(0);
			Cell[] cells = sheet.getRow(row);
			result = cells[col].getContents();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
			}

			try {
				if (fis != null) {
					rwb.close();
				}
			} catch (Exception e) {
			}
		}
		return result;
	}

	@Override
	public List<TblClimateScenarioYear> getAllContenttblClimateScenarioYear(InputStream fis) {
		jxl.Workbook rwb = null;
		String fldWatershedCode;
		String fldCountyCode;
		String fldCRPType;
		String fldDate;
		double fldPrecipitation;
		double fldAvgTemperature;
		double fldMaxTemp;
		double fldMinTemp;
		List<TblClimateScenarioYear> datas = new ArrayList<TblClimateScenarioYear>();
		try {
			rwb = Workbook.getWorkbook(fis);
			Sheet sheet = rwb.getSheet(0);
			for (int row = 0; row < sheet.getRows(); row++) {
				Cell[] cells = sheet.getRow(row);
				fldWatershedCode = cells[0].getContents();
				fldCountyCode = cells[1].getContents();
				fldCRPType = cells[2].getContents();
				fldDate = cells[3].getContents();
				fldPrecipitation = Double.parseDouble(cells[4].getContents());
				fldAvgTemperature = Double.parseDouble(cells[5].getContents());
				fldMaxTemp = Double.parseDouble(cells[6].getContents());
				fldMinTemp = Double.parseDouble(cells[7].getContents());
				datas.add(new TblClimateScenarioYear(fldWatershedCode, fldCountyCode, fldCRPType, fldDate,
						fldPrecipitation, fldAvgTemperature, fldMaxTemp, fldMinTemp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
			}

			try {
				if (rwb != null) {
					rwb.close();
				}
			} catch (Exception e) {
			}
		}
		return datas;
	}

	@Override
	public List<TblClimateScenarioMonth> getAllContenttblClimateScenarioMonth(InputStream fis) {
		jxl.Workbook rwb = null;
		String fldWatershedCode;
		String fldCountyCode;
		String fldCRPType;
		String fldDate;
		double fldPrecipitation;
		double fldAvgTemperature;
		double fldMaxTemp;
		double fldMinTemp;
		List<TblClimateScenarioMonth> datas = new ArrayList<TblClimateScenarioMonth>();
		try {
			rwb = Workbook.getWorkbook(fis);
			Sheet sheet = rwb.getSheet(0);
			for (int row = 0; row < sheet.getRows(); row++) {
				Cell[] cells = sheet.getRow(row);
				fldWatershedCode = cells[0].getContents();
				fldCountyCode = cells[1].getContents();
				fldCRPType = cells[2].getContents();
				fldDate = cells[3].getContents();
				fldPrecipitation = Double.parseDouble(cells[4].getContents());
				fldAvgTemperature = Double.parseDouble(cells[5].getContents());
				fldMaxTemp = Double.parseDouble(cells[6].getContents());
				fldMinTemp = Double.parseDouble(cells[7].getContents());
				datas.add(new TblClimateScenarioMonth(fldWatershedCode, fldCountyCode, fldCRPType, fldDate,
						fldPrecipitation, fldAvgTemperature, fldMaxTemp, fldMinTemp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
			}

			try {
				if (rwb != null) {
					rwb.close();
				}
			} catch (Exception e) {
			}
		}
		return datas;
	}

	@Override
	public List<TblIndustyUrbanSce> getAllContenttTblIndustyUrbanSces(InputStream fis) {
		jxl.Workbook rwb = null;
		String fldWatershedCode;
		String fldCountyCode;
		String fldDate;
		double fldFarmPop;
		double fldNonFarmPop;
		double fldIndOutput;
		double fldAgrOutput;
		double fldSerOutput;
		double fldTourOutput;
		double fldTechProgRatio;
		List<TblIndustyUrbanSce> datas = new ArrayList<TblIndustyUrbanSce>();
		try {
			rwb = Workbook.getWorkbook(fis);
			Sheet sheet = rwb.getSheet(0);
			for (int row = 0; row < sheet.getRows(); row++) {
				Cell[] cells = sheet.getRow(row);
				fldWatershedCode = cells[0].getContents();
				fldCountyCode = cells[1].getContents();
				fldDate = cells[2].getContents();
				fldFarmPop = Double.parseDouble(cells[3].getContents());
				fldNonFarmPop = Double.parseDouble(cells[4].getContents());
				fldIndOutput = Double.parseDouble(cells[5].getContents());
				fldAgrOutput = Double.parseDouble(cells[6].getContents());
				fldSerOutput = Double.parseDouble(cells[7].getContents());
				fldTourOutput = Double.parseDouble(cells[8].getContents());
				fldTechProgRatio = Double.parseDouble(cells[9].getContents());
				datas.add(new TblIndustyUrbanSce(fldWatershedCode, fldCountyCode, fldDate, fldFarmPop, fldNonFarmPop, fldIndOutput, fldAgrOutput, fldSerOutput, fldTourOutput, fldTechProgRatio));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
			}

			try {
				if (rwb != null) {
					rwb.close();
				}
			} catch (Exception e) {
			}
		}
		return datas;
	}

}

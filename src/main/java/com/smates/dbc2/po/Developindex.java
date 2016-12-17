package com.smates.dbc2.po;

/**
 * 发展指标po
 * 
 * @author baijw
 *
 */
public class Developindex {

	private int oid;
	private String countyname;
	private double AQ;
	private double EQ;
	private double MGWD;
	private double GDP;
	private double IAGDP;
	private double MIA;
	private double Pop;
	private double DFA;
	private double DLA;
	private int year;

	public Developindex() {
		super();
	}

	public Developindex(int oid, String countyname, double aQ, double eQ, double mGWD, double gDP, double iAGDP, double mIA,
			double pop, double dFA, double dLA, int year) {
		super();
		this.oid = oid;
		this.countyname = countyname;
		AQ = aQ;
		EQ = eQ;
		MGWD = mGWD;
		GDP = gDP;
		IAGDP = iAGDP;
		MIA = mIA;
		Pop = pop;
		DFA = dFA;
		DLA = dLA;
		this.year = year;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getCountyname() {
		return countyname;
	}

	public void setCountyname(String countyname) {
		this.countyname = countyname;
	}

	public double getAQ() {
		return AQ;
	}

	public void setAQ(double aQ) {
		AQ = aQ;
	}

	public double getEQ() {
		return EQ;
	}

	public void setEQ(double eQ) {
		EQ = eQ;
	}

	public double getMGWD() {
		return MGWD;
	}

	public void setMGWD(double mGWD) {
		MGWD = mGWD;
	}

	public double getGDP() {
		return GDP;
	}

	public void setGDP(double gDP) {
		GDP = gDP;
	}

	public double getIAGDP() {
		return IAGDP;
	}

	public void setIAGDP(double iAGDP) {
		IAGDP = iAGDP;
	}

	public double getMIA() {
		return MIA;
	}

	public void setMIA(double mIA) {
		MIA = mIA;
	}

	public double getPop() {
		return Pop;
	}

	public void setPop(double pop) {
		Pop = pop;
	}

	public double getDFA() {
		return DFA;
	}

	public void setDFA(double dFA) {
		DFA = dFA;
	}

	public double getDLA() {
		return DLA;
	}

	public void setDLA(double dLA) {
		DLA = dLA;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

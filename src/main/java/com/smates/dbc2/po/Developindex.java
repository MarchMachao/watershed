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
	private float AQ;
	private float EQ;
	private float MGWD;
	private float GDP;
	private float IAGDP;
	private float MIA;
	private float Pop;
	private float DFA;
	private float DLA;
	private int year;

	public Developindex() {
		super();
	}

	public Developindex(int oid, String countyname, float aQ, float eQ, float mGWD, float gDP, float iAGDP, float mIA,
			float pop, float dFA, float dLA, int year) {
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

	public float getAQ() {
		return AQ;
	}

	public void setAQ(float aQ) {
		AQ = aQ;
	}

	public float getEQ() {
		return EQ;
	}

	public void setEQ(float eQ) {
		EQ = eQ;
	}

	public float getMGWD() {
		return MGWD;
	}

	public void setMGWD(float mGWD) {
		MGWD = mGWD;
	}

	public float getGDP() {
		return GDP;
	}

	public void setGDP(float gDP) {
		GDP = gDP;
	}

	public float getIAGDP() {
		return IAGDP;
	}

	public void setIAGDP(float iAGDP) {
		IAGDP = iAGDP;
	}

	public float getMIA() {
		return MIA;
	}

	public void setMIA(float mIA) {
		MIA = mIA;
	}

	public float getPop() {
		return Pop;
	}

	public void setPop(float pop) {
		Pop = pop;
	}

	public float getDFA() {
		return DFA;
	}

	public void setDFA(float dFA) {
		DFA = dFA;
	}

	public float getDLA() {
		return DLA;
	}

	public void setDLA(float dLA) {
		DLA = dLA;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

package com.smates.dbc2.po;

/**
 * 流域
 * @author baijw
 *
 */
public class Watershed {
	
	private String id;
	private String name;
	private String describe;
	
	public Watershed() {
	}

	public Watershed(String id, String name, String describe) {
		this.id = id;
		this.name = name;
		this.describe = describe;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "Watershed [id=" + id + ", name=" + name + ", describe=" + describe + "]";
	}
	
}

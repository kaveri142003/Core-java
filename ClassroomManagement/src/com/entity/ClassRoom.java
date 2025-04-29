package com.entity;

public class ClassRoom {
	
	private int clsId;
	private String clsName;
	private int clsCapacity;
	
	//non-parameterized constructor
	public ClassRoom() {
		super();
	}
	
	//parameterized constructor
	public ClassRoom(int clsId, String clsName, int clsCapacity) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
		this.clsCapacity = clsCapacity;
	}

	//getter setters
	public int getClsId() {
		return clsId;
	}

	public void setClsId(int clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public int getClsCapacity() {
		return clsCapacity;
	}

	public void setClsCapacity(int clsCapacity) {
		this.clsCapacity = clsCapacity;
	}

	
	//toString method
	@Override
	public String toString() {
		return "ClassRoom [clsId=" + clsId + ", clsName=" + clsName + ", clsCapacity=" + clsCapacity + "]";
	}
	
	

}

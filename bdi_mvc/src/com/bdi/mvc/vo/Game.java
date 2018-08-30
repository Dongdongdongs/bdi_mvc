package com.bdi.mvc.vo;

public class Game {
	private int gcNum;
	private String gcName;
	private int gcPrice;
	private String gcVender;
	private int gcOrder;
	private String gcDesc;
	private String gcImg;
	public Game() {}
	@Override
	public String toString() {
		return "Game [gcNum=" + gcNum + ", gcName=" + gcName + ", gcPrice=" + gcPrice + ", gcVender=" + gcVender
				+ ", gcOrder=" + gcOrder + ", gcDesc=" + gcDesc + ", gcImg=" + gcImg + "]";
	}
	public int getGcNum() {
		return gcNum;
	}
	public void setGcNum(int gcNum) {
		this.gcNum = gcNum;
	}
	public String getGcName() {
		return gcName;
	}
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	public int getGcPrice() {
		return gcPrice;
	}
	public void setGcPrice(int gcPrice) {
		this.gcPrice = gcPrice;
	}
	public String getGcVender() {
		return gcVender;
	}
	public void setGcVender(String gcVender) {
		this.gcVender = gcVender;
	}
	public int getGcOrder() {
		return gcOrder;
	}
	public void setGcOrder(int gcOrder) {
		this.gcOrder = gcOrder;
	}
	public String getGcDesc() {
		return gcDesc;
	}
	public void setGcDesc(String gcDesc) {
		this.gcDesc = gcDesc;
	}
	public String getGcImg() {
		return gcImg;
	}
	public void setGcImg(String gcImg) {
		this.gcImg = gcImg;
	}
	public Game(int gcNum, String gcName, int gcPrice, String gcVender, int gcOrder, String gcDesc, String gcImg) {
		super();
		this.gcNum = gcNum;
		this.gcName = gcName;
		this.gcPrice = gcPrice;
		this.gcVender = gcVender;
		this.gcOrder = gcOrder;
		this.gcDesc = gcDesc;
		this.gcImg = gcImg;
	}
}

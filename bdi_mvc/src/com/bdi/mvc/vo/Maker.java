package com.bdi.mvc.vo;

public class Maker {
	private int mnum;
	private String mname;
	private int mprice;
	private int mtotal;
	private int mcnt;
	private String mdesc;
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public int getMtotal() {
		return mtotal;
	}
	public void setMtotal(int mtotal) {
		this.mtotal = mtotal;
	}
	public int getMcnt() {
		return mcnt;
	}
	public void setCnt(int mcnt) {
		this.mcnt = mcnt;
	}
	public String getMdesc() {
		return mdesc;
	}
	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}
	public Maker(int mnum, String mname, int mprice, int mtotal, int mcnt, String mdesc) {
		super();
		this.mnum = mnum;
		this.mname = mname;
		this.mprice = mprice;
		this.mtotal = mtotal;
		this.mcnt = mcnt;
		this.mdesc = mdesc;
	}
	@Override
	public String toString() {
		return "Maker [mnum=" + mnum + ", mname=" + mname + ", mprice=" + mprice + ", mtotal=" + mtotal + ", mcnt=" + mcnt
				+ ", mdesc=" + mdesc + "]";
	}
	
}

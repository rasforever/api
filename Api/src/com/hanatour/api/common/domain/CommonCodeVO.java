package com.hanatour.api.common.domain;

public class CommonCodeVO {
	private String c_cd;
	private String c_cd_nm;
	private String cd1;
	private String cd_nm1;
	
	public CommonCodeVO() {}

	public CommonCodeVO(String c_cd, String c_cd_nm, String cd1, String cd_nm1) {
		super();
		this.c_cd = c_cd;
		this.c_cd_nm = c_cd_nm;
		this.cd1 = cd1;
		this.cd_nm1 = cd_nm1;
	}

	public String getC_cd() {
		return c_cd;
	}

	public void setC_cd(String c_cd) {
		this.c_cd = c_cd;
	}

	public String getC_cd_nm() {
		return c_cd_nm;
	}

	public void setC_cd_nm(String c_cd_nm) {
		this.c_cd_nm = c_cd_nm;
	}

	public String getCd1() {
		return cd1;
	}

	public void setCd1(String cd1) {
		this.cd1 = cd1;
	}

	public String getCd_nm1() {
		return cd_nm1;
	}

	public void setCd_nm1(String cd_nm1) {
		this.cd_nm1 = cd_nm1;
	}

	@Override
	public String toString() {
		return "CommonCodeVO [c_cd=" + c_cd + ", c_cd_nm=" + c_cd_nm + ", cd1=" + cd1 + ", cd_nm1=" + cd_nm1 + "]";
	}
	
	
	
}

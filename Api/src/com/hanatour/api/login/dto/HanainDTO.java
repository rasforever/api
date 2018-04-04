package com.hanatour.api.login.dto;

import java.io.Serializable;

public class HanainDTO implements Serializable{
	
	private String emp_id;
	private String emp_pw;
	private String emp_nm;
	private String admin_ck;
	private String admin_auk;
	private boolean useCookie;
	
	public HanainDTO() {}

	public HanainDTO(String emp_id, String emp_pw, String emp_nm, String admin_ck, String admin_auk,
			boolean useCookie) {
		super();
		this.emp_id = emp_id;
		this.emp_pw = emp_pw;
		this.emp_nm = emp_nm;
		this.admin_ck = admin_ck;
		this.admin_auk = admin_auk;
		this.useCookie = useCookie;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_pw() {
		return emp_pw;
	}

	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}

	public String getEmp_nm() {
		return emp_nm;
	}

	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}

	public String getAdmin_ck() {
		return admin_ck;
	}

	public void setAdmin_ck(String admin_ck) {
		this.admin_ck = admin_ck;
	}

	public String getAdmin_auk() {
		return admin_auk;
	}

	public void setAdmin_auk(String admin_auk) {
		this.admin_auk = admin_auk;
	}

	public boolean isUseCookie() {
		return useCookie;
	}

	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}

	@Override
	public String toString() {
		return "HanainDTO [emp_id=" + emp_id + ", emp_pw=" + emp_pw + ", emp_nm=" + emp_nm + ", admin_ck=" + admin_ck
				+ ", admin_auk=" + admin_auk + ", useCookie=" + useCookie + "]";
	}
	
	
	

}

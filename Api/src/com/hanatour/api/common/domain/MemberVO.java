package com.hanatour.api.common.domain;

import java.util.Date;

public class MemberVO {
	
	private String emp_id;
	private String emp_pw;
	private String emp_nm;
	private String emp_rank;
	private String admin_aut;
	private Date last_con_date;
	
	public MemberVO() {}

	public MemberVO(String emp_id, String emp_pw, String emp_nm, String emp_rank, String admin_aut,
			Date last_con_date) {
		super();
		this.emp_id = emp_id;
		this.emp_pw = emp_pw;
		this.emp_nm = emp_nm;
		this.emp_rank = emp_rank;
		this.admin_aut = admin_aut;
		this.last_con_date = last_con_date;
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

	public String getEmp_rank() {
		return emp_rank;
	}

	public void setEmp_rank(String emp_rank) {
		this.emp_rank = emp_rank;
	}

	public String getAdmin_aut() {
		return admin_aut;
	}

	public void setAdmin_aut(String admin_aut) {
		this.admin_aut = admin_aut;
	}

	public Date getLast_con_date() {
		return last_con_date;
	}

	public void setLast_con_date(Date last_con_date) {
		this.last_con_date = last_con_date;
	}

	@Override
	public String toString() {
		return "MemberVO [emp_id=" + emp_id + ", emp_pw=" + emp_pw + ", emp_nm=" + emp_nm + ", emp_rank=" + emp_rank
				+ ", admin_aut=" + admin_aut + ", last_con_date=" + last_con_date + "]";
	}
	
	
}

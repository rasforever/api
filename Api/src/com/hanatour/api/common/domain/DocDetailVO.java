package com.hanatour.api.common.domain;

public class DocDetailVO {
	
	private String doc_no;
	private String doc_r_cd;
	private String doc_par_no;
	private String doc_d_name;
	private int doc_d_seq;
	private int doc_dept;
	private String doc_d_hrank;
	private String doc_d_essck;
	private int doc_d_maxl;
	private String doc_d_content;
	private String doc_d_note;
	private String doc_ver;
	private String doc_d_wrt;
	private String doc_d_wrt_date;
	private String doc_d_request;
	private String doc_d_response;
	
	public DocDetailVO() {}

	public DocDetailVO(String doc_no, String doc_r_cd, String doc_par_no, String doc_d_name, int doc_d_seq,
			int doc_dept, String doc_d_hrank, String doc_d_essck, int doc_d_maxl, String doc_d_content,
			String doc_d_note, String doc_ver, String doc_d_wrt, String doc_d_wrt_date, String doc_d_request,
			String doc_d_response) {
		super();
		this.doc_no = doc_no;
		this.doc_r_cd = doc_r_cd;
		this.doc_par_no = doc_par_no;
		this.doc_d_name = doc_d_name;
		this.doc_d_seq = doc_d_seq;
		this.doc_dept = doc_dept;
		this.doc_d_hrank = doc_d_hrank;
		this.doc_d_essck = doc_d_essck;
		this.doc_d_maxl = doc_d_maxl;
		this.doc_d_content = doc_d_content;
		this.doc_d_note = doc_d_note;
		this.doc_ver = doc_ver;
		this.doc_d_wrt = doc_d_wrt;
		this.doc_d_wrt_date = doc_d_wrt_date;
		this.doc_d_request = doc_d_request;
		this.doc_d_response = doc_d_response;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getDoc_r_cd() {
		return doc_r_cd;
	}

	public void setDoc_r_cd(String doc_r_cd) {
		this.doc_r_cd = doc_r_cd;
	}

	public String getDoc_par_no() {
		return doc_par_no;
	}

	public void setDoc_par_no(String doc_par_no) {
		this.doc_par_no = doc_par_no;
	}

	public String getDoc_d_name() {
		return doc_d_name;
	}

	public void setDoc_d_name(String doc_d_name) {
		this.doc_d_name = doc_d_name;
	}

	public int getDoc_d_seq() {
		return doc_d_seq;
	}

	public void setDoc_d_seq(int doc_d_seq) {
		this.doc_d_seq = doc_d_seq;
	}

	public int getDoc_dept() {
		return doc_dept;
	}

	public void setDoc_dept(int doc_dept) {
		this.doc_dept = doc_dept;
	}

	public String getDoc_d_hrank() {
		return doc_d_hrank;
	}

	public void setDoc_d_hrank(String doc_d_hrank) {
		this.doc_d_hrank = doc_d_hrank;
	}

	public String getDoc_d_essck() {
		return doc_d_essck;
	}

	public void setDoc_d_essck(String doc_d_essck) {
		this.doc_d_essck = doc_d_essck;
	}

	public int getDoc_d_maxl() {
		return doc_d_maxl;
	}

	public void setDoc_d_maxl(int doc_d_maxl) {
		this.doc_d_maxl = doc_d_maxl;
	}

	public String getDoc_d_content() {
		return doc_d_content;
	}

	public void setDoc_d_content(String doc_d_content) {
		this.doc_d_content = doc_d_content;
	}

	public String getDoc_d_note() {
		return doc_d_note;
	}

	public void setDoc_d_note(String doc_d_note) {
		this.doc_d_note = doc_d_note;
	}

	public String getDoc_ver() {
		return doc_ver;
	}

	public void setDoc_ver(String doc_ver) {
		this.doc_ver = doc_ver;
	}

	public String getDoc_d_wrt() {
		return doc_d_wrt;
	}

	public void setDoc_d_wrt(String doc_d_wrt) {
		this.doc_d_wrt = doc_d_wrt;
	}

	public String getDoc_d_wrt_date() {
		return doc_d_wrt_date;
	}

	public void setDoc_d_wrt_date(String doc_d_wrt_date) {
		this.doc_d_wrt_date = doc_d_wrt_date;
	}

	public String getDoc_d_request() {
		return doc_d_request;
	}

	public void setDoc_d_request(String doc_d_request) {
		this.doc_d_request = doc_d_request;
	}

	public String getDoc_d_response() {
		return doc_d_response;
	}

	public void setDoc_d_response(String doc_d_response) {
		this.doc_d_response = doc_d_response;
	}

	@Override
	public String toString() {
		return "DocDetailVO [doc_no=" + doc_no + ", doc_r_cd=" + doc_r_cd + ", doc_par_no=" + doc_par_no
				+ ", doc_d_name=" + doc_d_name + ", doc_d_seq=" + doc_d_seq + ", doc_dept=" + doc_dept
				+ ", doc_d_hrank=" + doc_d_hrank + ", doc_d_essck=" + doc_d_essck + ", doc_d_maxl=" + doc_d_maxl
				+ ", doc_d_content=" + doc_d_content + ", doc_d_note=" + doc_d_note + ", doc_ver=" + doc_ver
				+ ", doc_d_wrt=" + doc_d_wrt + ", doc_d_wrt_date=" + doc_d_wrt_date + ", doc_d_request=" + doc_d_request
				+ ", doc_d_response=" + doc_d_response + "]";
	}
	
	

}

package com.hanatour.api.user.domain;

public class DocumentVO {
	
	private String doc_no;
	private String doc_title;
	private int doc_rank_cd;
	private String doc_ver;
	private String doc_func_id;
	private int doc_num;
	private String doc_class_cd;
	private String doc_class_nm;
	private String doc_event_cd;
	private String doc_event_nm;
	private String doc_wrt;
	private String doc_wrt_nm;
	private String doc_wrt_date;
	private String doc_description;
	private String doc_content;
	private String doc_request;
	private String doc_response;
	
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
	private String doc_d_ver;
	private String doc_d_wrt;
	private String doc_d_wrt_date;
	
	public DocumentVO() {}

	public DocumentVO(String doc_no, String doc_title, int doc_rank_cd, String doc_ver, String doc_func_id, int doc_num,
			String doc_class_cd, String doc_class_nm, String doc_event_cd, String doc_event_nm, String doc_wrt,
			String doc_wrt_nm, String doc_wrt_date, String doc_description, String doc_content, String doc_request,
			String doc_response, String doc_r_cd, String doc_par_no, String doc_d_name, int doc_d_seq, int doc_dept,
			String doc_d_hrank, String doc_d_essck, int doc_d_maxl, String doc_d_content, String doc_d_note,
			String doc_d_ver, String doc_d_wrt, String doc_d_wrt_date) {
		super();
		this.doc_no = doc_no;
		this.doc_title = doc_title;
		this.doc_rank_cd = doc_rank_cd;
		this.doc_ver = doc_ver;
		this.doc_func_id = doc_func_id;
		this.doc_num = doc_num;
		this.doc_class_cd = doc_class_cd;
		this.doc_class_nm = doc_class_nm;
		this.doc_event_cd = doc_event_cd;
		this.doc_event_nm = doc_event_nm;
		this.doc_wrt = doc_wrt;
		this.doc_wrt_nm = doc_wrt_nm;
		this.doc_wrt_date = doc_wrt_date;
		this.doc_description = doc_description;
		this.doc_content = doc_content;
		this.doc_request = doc_request;
		this.doc_response = doc_response;
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
		this.doc_d_ver = doc_d_ver;
		this.doc_d_wrt = doc_d_wrt;
		this.doc_d_wrt_date = doc_d_wrt_date;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public int getDoc_rank_cd() {
		return doc_rank_cd;
	}

	public void setDoc_rank_cd(int doc_rank_cd) {
		this.doc_rank_cd = doc_rank_cd;
	}

	public String getDoc_ver() {
		return doc_ver;
	}

	public void setDoc_ver(String doc_ver) {
		this.doc_ver = doc_ver;
	}

	public String getDoc_func_id() {
		return doc_func_id;
	}

	public void setDoc_func_id(String doc_func_id) {
		this.doc_func_id = doc_func_id;
	}

	public int getDoc_num() {
		return doc_num;
	}

	public void setDoc_num(int doc_num) {
		this.doc_num = doc_num;
	}

	public String getDoc_class_cd() {
		return doc_class_cd;
	}

	public void setDoc_class_cd(String doc_class_cd) {
		this.doc_class_cd = doc_class_cd;
	}

	public String getDoc_class_nm() {
		return doc_class_nm;
	}

	public void setDoc_class_nm(String doc_class_nm) {
		this.doc_class_nm = doc_class_nm;
	}

	public String getDoc_event_cd() {
		return doc_event_cd;
	}

	public void setDoc_event_cd(String doc_event_cd) {
		this.doc_event_cd = doc_event_cd;
	}

	public String getDoc_event_nm() {
		return doc_event_nm;
	}

	public void setDoc_event_nm(String doc_event_nm) {
		this.doc_event_nm = doc_event_nm;
	}

	public String getDoc_wrt() {
		return doc_wrt;
	}

	public void setDoc_wrt(String doc_wrt) {
		this.doc_wrt = doc_wrt;
	}

	public String getDoc_wrt_nm() {
		return doc_wrt_nm;
	}

	public void setDoc_wrt_nm(String doc_wrt_nm) {
		this.doc_wrt_nm = doc_wrt_nm;
	}

	public String getDoc_wrt_date() {
		return doc_wrt_date;
	}

	public void setDoc_wrt_date(String doc_wrt_date) {
		this.doc_wrt_date = doc_wrt_date;
	}

	public String getDoc_description() {
		return doc_description;
	}

	public void setDoc_description(String doc_description) {
		this.doc_description = doc_description;
	}

	public String getDoc_content() {
		return doc_content;
	}

	public void setDoc_content(String doc_content) {
		this.doc_content = doc_content;
	}

	public String getDoc_request() {
		return doc_request;
	}

	public void setDoc_request(String doc_request) {
		this.doc_request = doc_request;
	}

	public String getDoc_response() {
		return doc_response;
	}

	public void setDoc_response(String doc_response) {
		this.doc_response = doc_response;
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

	public String getDoc_d_ver() {
		return doc_d_ver;
	}

	public void setDoc_d_ver(String doc_d_ver) {
		this.doc_d_ver = doc_d_ver;
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

	@Override
	public String toString() {
		return "DocumentVO [doc_no=" + doc_no + ", doc_title=" + doc_title + ", doc_rank_cd=" + doc_rank_cd
				+ ", doc_ver=" + doc_ver + ", doc_func_id=" + doc_func_id + ", doc_num=" + doc_num + ", doc_class_cd="
				+ doc_class_cd + ", doc_class_nm=" + doc_class_nm + ", doc_event_cd=" + doc_event_cd + ", doc_event_nm="
				+ doc_event_nm + ", doc_wrt=" + doc_wrt + ", doc_wrt_nm=" + doc_wrt_nm + ", doc_wrt_date="
				+ doc_wrt_date + ", doc_description=" + doc_description + ", doc_content=" + doc_content
				+ ", doc_request=" + doc_request + ", doc_response=" + doc_response + ", doc_r_cd=" + doc_r_cd
				+ ", doc_par_no=" + doc_par_no + ", doc_d_name=" + doc_d_name + ", doc_d_seq=" + doc_d_seq
				+ ", doc_dept=" + doc_dept + ", doc_d_hrank=" + doc_d_hrank + ", doc_d_essck=" + doc_d_essck
				+ ", doc_d_maxl=" + doc_d_maxl + ", doc_d_content=" + doc_d_content + ", doc_d_note=" + doc_d_note
				+ ", doc_d_ver=" + doc_d_ver + ", doc_d_wrt=" + doc_d_wrt + ", doc_d_wrt_date=" + doc_d_wrt_date + "]";
	}
	
	

}

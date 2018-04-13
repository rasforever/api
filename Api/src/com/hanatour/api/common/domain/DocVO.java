package com.hanatour.api.common.domain;

public class DocVO {

		private String doc_no;
		private String doc_title;
		private String doc_rank_cd;
		private int doc_ver;
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
		
		public DocVO() {}

		public DocVO(String doc_no, String doc_title, String doc_rank_cd, int doc_ver, String doc_func_id, int doc_num,
				String doc_class_cd, String doc_class_nm, String doc_event_cd, String doc_event_nm, String doc_wrt,
				String doc_wrt_nm, String doc_wrt_date, String doc_description, String doc_content, String doc_request,
				String doc_response) {
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

		public String getDoc_rank_cd() {
			return doc_rank_cd;
		}

		public void setDoc_rank_cd(String doc_rank_cd) {
			this.doc_rank_cd = doc_rank_cd;
		}

		public int getDoc_ver() {
			return doc_ver;
		}

		public void setDoc_ver(int doc_ver) {
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

		@Override
		public String toString() {
			return "DocVO [doc_no=" + doc_no + ", doc_title=" + doc_title + ", doc_rank_cd=" + doc_rank_cd
					+ ", doc_ver=" + doc_ver + ", doc_func_id=" + doc_func_id + ", doc_num=" + doc_num
					+ ", doc_class_cd=" + doc_class_cd + ", doc_class_nm=" + doc_class_nm + ", doc_event_cd="
					+ doc_event_cd + ", doc_event_nm=" + doc_event_nm + ", doc_wrt=" + doc_wrt + ", doc_wrt_nm="
					+ doc_wrt_nm + ", doc_wrt_date=" + doc_wrt_date + ", doc_description=" + doc_description
					+ ", doc_content=" + doc_content + ", doc_request=" + doc_request + ", doc_response=" + doc_response
					+ "]";
		}
		
		
		
}

package com.hanatour.api.admin.service;

import java.util.List;
import java.util.Map;

import com.hanatour.api.common.domain.CommonCodeVO;
import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.common.domain.MemberVO;

public interface AdminService {
	
	//신규or 변경 문서 리스트 20개 보여주기
	public List<DocVO> Ndoc_list() throws Exception;
	//사원리시트
	public List<MemberVO> emp_list() throws Exception;
	//문서리스트
	public List<DocVO> doc_list() throws Exception;
	//공통코드리스트
	public List<CommonCodeVO> code_list(String c_cd) throws Exception;
	//사원정보 수정
	public void emp_modify(List<Map<String, Object>> vo) throws Exception;
	//사원정보 삭제
	public void emp_remove(List<MemberVO> vo) throws Exception;
	//문서정보 삭제
	public void doc_modify(List<DocVO> vo) throws Exception;
	//코드 sel
	public List<CommonCodeVO> code_sellist() throws Exception;
	//코드정보 수정
	public void code_modify(List<CommonCodeVO> vo) throws Exception;
	//코드정보 삭제
	public void code_remove(List<CommonCodeVO> vo) throws Exception;

}

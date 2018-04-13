package com.hanatour.api.admin.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanatour.api.admin.persistence.AdminDAO;
import com.hanatour.api.common.domain.CommonCodeVO;
import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.common.domain.MemberVO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject
	private AdminDAO dao;
	
	@Override
	public List<DocVO> Ndoc_list() throws Exception {
		return dao.Ndoc_list();
	}

	@Override
	public List<MemberVO> emp_list() throws Exception {
		return dao.emp_list();
	}

	@Override
	public List<DocVO> doc_list() throws Exception {
		return dao.doc_list();
	}

	
	@Override
	public List<CommonCodeVO> code_list(String c_cd) throws Exception {
		return dao.code_list(c_cd);
	}
	
	@Transactional
	@Override
	public void emp_modify(List<Map<String, Object>> vo) throws Exception {
		
		for(Map<String,Object> dm : vo){
			MemberVO memberVO = new MemberVO();
			memberVO.setEmp_id((String)dm.get("emp_id"));
			memberVO.setEmp_pw((String)dm.get("emp_pw"));
			memberVO.setEmp_rank((String)dm.get("emp_rank"));
			memberVO.setAdmin_aut((String)dm.get("emp_admin_aut"));
			dao.emp_modify(memberVO);
		}

	}

	@Transactional
	@Override
	public void emp_remove(List<Map<String, Object>> vo) throws Exception {
		for(Map<String,Object> dm : vo){
			MemberVO memberVO = new MemberVO();
			memberVO.setEmp_id((String)dm.get("emp_id"));
			memberVO.setEmp_pw((String)dm.get("emp_pw"));
			memberVO.setEmp_rank((String)dm.get("emp_rank"));
			memberVO.setAdmin_aut((String)dm.get("emp_admin_aut"));
			dao.emp_remove(memberVO);
		}
	}

	@Transactional
	@Override
	public void doc_modify(List<Map<String, Object>> vo) throws Exception {
		for(Map<String,Object> dm : vo){
			DocVO docSubVO = new DocVO();
			docSubVO.setDoc_no((String)dm.get("doc_no"));
			docSubVO.setDoc_rank_cd((String)dm.get("doc_rank_cd"));
			dao.doc_modify(docSubVO);
		}
	}

	@Override
	public List<CommonCodeVO> code_sellist() throws Exception {
		return 	dao.code_sellist();
	}
	
	@Transactional
	@Override
	public void code_modify(List<Map<String, Object>> vo) throws Exception {
		for(Map<String,Object> dm : vo){
			CommonCodeVO codeVO = new CommonCodeVO();
			codeVO.setC_cd((String)dm.get("doc_no"));
			codeVO.setCd1((String)dm.get("doc_rank_cd"));
			codeVO.setCd_nm1((String)dm.get("doc_rank_cd"));
			if(dao.code_check(codeVO) == 0){
				dao.code_save(codeVO);
			} else{
				dao.code_modify(codeVO);
			}
		}
	}

	@Override
	public void code_remove(List<Map<String, Object>> vo) throws Exception {
		for(Map<String,Object> dm : vo){
			CommonCodeVO codeVO = new CommonCodeVO();
			codeVO.setC_cd((String)dm.get("doc_no"));
			codeVO.setCd1((String)dm.get("doc_rank_cd"));
			codeVO.setCd_nm1((String)dm.get("doc_rank_cd"));
			dao.code_remove(codeVO);
		}
	}

}

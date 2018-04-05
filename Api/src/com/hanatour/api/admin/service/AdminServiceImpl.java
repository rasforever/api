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

	@Override
	public void emp_remove(List<MemberVO> vo) throws Exception {
		dao.emp_remove(vo);
	}

	@Override
	public void doc_modify(List<DocVO> vo) throws Exception {
		dao.doc_modify(vo);
	}

	@Override
	public List<CommonCodeVO> code_sellist() throws Exception {
		return 	dao.code_sellist();
	}

	@Override
	public void code_modify(List<CommonCodeVO> vo) throws Exception {
		dao.code_modify(vo);
	}

	@Override
	public void code_remove(List<CommonCodeVO> vo) throws Exception {
		dao.code_remove(vo);
	}

}

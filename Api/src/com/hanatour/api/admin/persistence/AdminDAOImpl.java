package com.hanatour.api.admin.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hanatour.api.common.domain.CommonCodeVO;
import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.common.domain.MemberVO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.hanatour.api.mapper.AdminMapper";
	
	
	@Override
	public List<DocVO> Ndoc_list() throws Exception {
		return null;
	}

	@Override
	public List<MemberVO> emp_list() throws Exception {
		return session.selectList(namespace + ".emp_list");
	}

	@Override
	public List<DocVO> doc_list() throws Exception {
		return null;
	}

	@Override
	public List<CommonCodeVO> code_list(String c_cd) throws Exception {
		return session.selectList(namespace + ".codelist", c_cd);
				
	}

	@Override
	public void emp_modify(List<MemberVO> vo) throws Exception {

	}

	@Override
	public void emp_remove(List<MemberVO> vo) throws Exception {

	}

	@Override
	public void doc_modify(List<DocVO> vo) throws Exception {

	}

	@Override
	public List<CommonCodeVO> code_sellist() throws Exception {
		return session.selectList(namespace + ".code_sellist");
	}

	@Override
	public void code_modify(List<CommonCodeVO> vo) throws Exception {

	}

	@Override
	public void code_remove(List<CommonCodeVO> vo) throws Exception {

	}

}

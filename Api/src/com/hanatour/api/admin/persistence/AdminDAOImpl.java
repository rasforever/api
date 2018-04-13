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
	public void emp_modify(MemberVO vo) throws Exception {
		session.update(namespace+ ".emp_update", vo);
	}

	@Override
	public void emp_remove(MemberVO vo) throws Exception {
		session.delete(namespace+ ".emp_delete", vo);
	}

	@Override
	public void doc_modify(DocVO vo) throws Exception {
		session.update(namespace+ ".doc_update", vo);
	}
	
	@Override
	public Integer code_check(CommonCodeVO vo) throws Exception {
		return session.selectOne(namespace + ".code_check", vo);
	}

	@Override
	public List<CommonCodeVO> code_sellist() throws Exception {
		return session.selectList(namespace + ".code_sellist");
	}
	
	@Override
	public void code_save(CommonCodeVO vo) throws Exception {
		session.insert(namespace+ ".code_update", vo);

	}
	
	@Override
	public void code_modify(CommonCodeVO vo) throws Exception {
		session.update(namespace+ ".code_update", vo);
	}

	@Override
	public void code_remove(CommonCodeVO vo) throws Exception {
		session.delete(namespace+ ".code_delete", vo);
	}

}

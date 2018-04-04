package com.hanatour.api.login.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hanatour.api.common.domain.MemberVO;
import com.hanatour.api.login.dto.HanainDTO;

import antlr.NameSpace;

@Repository
public class LoginDAOImpl implements LoginDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.hanatour.api.mapper.LoginMapper";

	@Override
	public MemberVO login(HanainDTO dto) throws Exception {
		return session.selectOne(namespace + ".log", dto);
	}

	@Override
	public String id_ck(String emp_id) throws Exception {
		return session.selectOne(namespace + ".id_ck", emp_id);
	}

	@Override
	public String pw_ck(MemberVO vo) throws Exception {
		return session.selectOne(namespace + ".pw_ck", vo);
	}

	@Override
	public void join(MemberVO vo) throws Exception {
		session.insert(namespace + ".join", vo);
		
	}

	@Override
	public void pwchg(MemberVO vo) throws Exception {
		session.update(namespace + ".pwchg", vo);
		
	}

}

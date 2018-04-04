package com.hanatour.api.user.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.user.domain.DocumentVO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.hanatour.api.mapper.UserMapper";

	@Override
	public List<DocVO> user_doclist(int rank) throws Exception {
		return null;
	}

	@Override
	public List<DocumentVO> view_doc_d() throws Exception {
		return session.selectList(namespace + ".view_doc");
	}

}

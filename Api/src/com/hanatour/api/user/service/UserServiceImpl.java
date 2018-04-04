package com.hanatour.api.user.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.user.domain.DocumentVO;
import com.hanatour.api.user.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	private UserDAO dao;

	@Override
	public List<DocVO> user_doclist(int rank) throws Exception {
		return dao.user_doclist(rank);
	}

	@Override
	public List<DocumentVO> view_doc_d() throws Exception {
		return dao.view_doc_d();
	}

}

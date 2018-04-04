package com.hanatour.api.user.service;

import java.util.List;

import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.user.domain.DocumentVO;

public interface UserService {
	
	public List<DocVO> user_doclist(int rank) throws Exception;
	public List<DocumentVO> view_doc_d() throws Exception;

}

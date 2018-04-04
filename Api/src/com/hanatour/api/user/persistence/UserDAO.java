package com.hanatour.api.user.persistence;

import java.util.List;

import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.user.domain.DocumentVO;

public interface UserDAO {
	
	public List<DocVO> user_doclist(int rank) throws Exception;
	public List<DocumentVO> view_doc_d() throws Exception;

}

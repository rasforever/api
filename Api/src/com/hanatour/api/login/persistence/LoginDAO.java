package com.hanatour.api.login.persistence;

import com.hanatour.api.common.domain.MemberVO;
import com.hanatour.api.login.dto.HanainDTO;

public interface LoginDAO {

	public MemberVO login(HanainDTO dto) throws Exception;
	
	public String id_ck(String emp_id) throws Exception;
	
	public String pw_ck(MemberVO vo) throws Exception;
	
	public void join(MemberVO vo) throws Exception;

	public void pwchg(MemberVO vo) throws Exception;
	
}

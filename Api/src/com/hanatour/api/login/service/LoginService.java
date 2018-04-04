package com.hanatour.api.login.service;

import com.hanatour.api.common.domain.MemberVO;
import com.hanatour.api.login.dto.HanainDTO;

public interface LoginService {
	
	public MemberVO loginCheck(HanainDTO dto) throws Exception;
	public String join(MemberVO vo) throws Exception;
	public String pw_chg(MemberVO vo, String chg_pw) throws Exception;

}

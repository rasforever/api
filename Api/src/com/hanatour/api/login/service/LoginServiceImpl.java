package com.hanatour.api.login.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanatour.api.common.domain.MemberVO;
import com.hanatour.api.login.dto.HanainDTO;
import com.hanatour.api.login.persistence.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Inject
	private LoginDAO dao;
	
	@Override
	public MemberVO loginCheck(HanainDTO dto) throws Exception {		
		return dao.login(dto);
	}
	
	@Transactional
	@Override
	public String join(MemberVO vo) throws Exception {
		if(dao.id_ck(vo.getEmp_id()) == null){
			dao.join(vo);
			return "Y";
		} else{
			return "N";	
		}
	}
	
	@Transactional
	@Override
	public String pw_chg(MemberVO vo, String chg_pw) throws Exception {
		if(dao.id_ck(vo.getEmp_id()) != null){
			
			if(dao.pw_ck(vo) == null){
				//비번틀림
				return "PW_N";
			} else{
				vo.setEmp_pw(chg_pw);
				dao.pwchg(vo);
				return "Y";
			}
		} else{
			//아이디틀림
			return "ID_N";
		}
	}

}

package com.hanatour.api.login.controller;


import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanatour.api.common.domain.MemberVO;
import com.hanatour.api.login.dto.HanainDTO;
import com.hanatour.api.login.interceptor.LoginInterceptor;
import com.hanatour.api.login.service.LoginService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Inject
	private LoginService service;
	
	@RequestMapping(value = { "", "/logout" }, method = RequestMethod.GET) // ���߸���
	public String loginpage(@ModelAttribute("dto") HanainDTO dto, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false);
		System.out.println("loginpage");
		if (session != null) { // 
			session.invalidate();
		}

		return "/login/loginForm";
	}
	
	@RequestMapping(value="/login_ck", method = RequestMethod.POST)
	public void login_check(HanainDTO dto, HttpSession session, Model model) throws Exception{
		
		MemberVO vo = service.loginCheck(dto);
		model.addAttribute("memberVO", vo);
		model.addAttribute("admin_ck", dto.getAdmin_ck());
		
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public void join_pageGET() throws Exception{}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public void join_pagePOST(@ModelAttribute("vo") MemberVO vo, HttpServletRequest request, HttpServletResponse response)throws Exception{
		String join_ck = service.join(vo);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(join_ck.equals("Y")){
			out.println("alert('가입되엇습니다. 로그인해주세요.');");
			out.println("location.href=window.close();");			
		}else{
			out.println("alert('이미 가입된 아이디입니다.');");
			out.println("location.href='/login/join';");			
		}
		out.println("</script>");
		out.close();
	}
	
	@RequestMapping(value="/pwchg", method = RequestMethod.GET)
	public void pwchange_pageGET() throws Exception{}
	
	@RequestMapping(value="/pwchg", method = RequestMethod.POST)
	public void pwchange_pagePOST(@RequestParam("emp_id") String emp_id, @RequestParam("emp_pw") String emp_pw,
			@RequestParam("emp_pw_ch1") String emp_pw_ch1, @RequestParam("emp_pw_ch2") String emp_pw_ch2, 
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		
		if(emp_pw_ch1.equals(emp_pw_ch2)){
			MemberVO vo = new MemberVO();
			vo.setEmp_id(emp_id);
			vo.setEmp_pw(emp_pw);
			if(service.pw_chg(vo, emp_pw_ch1).equals("ID_N")){
				out.println("alert('ID가 없습니다. 확인해주세요.');");
				out.println("location.href='/login/pwchg';");			
			} else if(service.pw_chg(vo, emp_pw_ch1).equals("PW_N")){
				out.println("alert('현재패스워드가 틀렸습니다. 확인해주세요.');");
				out.println("location.href='/login/pwchg';");						
			} else{
				out.println("alert('변경되었습니다.');");
				out.println("location.href=window.close();");						
			}	
		}else{
			out.println("alert('변경할 패스워드와 다시 입력한 패스워드가 다릅니다.');");
			out.println("location.href='/login/pwchg';");			
		}
		out.println("</script>");
		out.close();
	}
	

}

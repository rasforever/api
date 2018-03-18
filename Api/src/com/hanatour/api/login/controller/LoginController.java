package com.hanatour.api.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hanatour.api.login.dto.LoginDTO;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value = { "", "/logout" }, method = RequestMethod.GET) // 다중매핑
	public String loginpage(@ModelAttribute("dto") LoginDTO dto, HttpServletRequest request) throws Exception {
		System.out.println("loginpage");
		/*HttpSession session = request.getSession(false);
		if (session != null) { // logout시 세션 삭제

			session.invalidate();

		}*/

		return "/login/loginForm";
	}

}

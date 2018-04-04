package com.hanatour.api.common.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value={"/", ""}, method = RequestMethod.GET)
	public String main(Locale locale, HttpSession session, Model model){
		
		String admin_aut = (String)session.getAttribute("admin_aut");
		System.out.println(admin_aut);
		
		if(admin_aut.equals("Y")){
			return "redirect:/admin";
		} else{
			return "redirect:/user";
		}
		
	}


}

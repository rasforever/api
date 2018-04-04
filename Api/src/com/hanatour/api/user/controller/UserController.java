package com.hanatour.api.user.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hanatour.api.user.domain.DocumentVO;
import com.hanatour.api.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Inject
	private UserService service;
	
	@RequestMapping(value={"","/main"}, method = RequestMethod.GET)
	public void userMainGET(@ModelAttribute("docVO") DocumentVO docVO, Locale locale, HttpSession session, Model model) throws Exception{
		model.addAttribute("docVO", service.view_doc_d());
	}
	
	@RequestMapping(value="/insert" , method = RequestMethod.GET)
	public String userInsertGET(HttpSession session, Model model) throws Exception{
		return "/user/insert";
	}
	@RequestMapping(value="/insert" , method = RequestMethod.POST)
	public void userInsertPOST() throws Exception{
		
	}
	
	@RequestMapping(value="/modify" , method = RequestMethod.GET)
	public String userModifyGET() throws Exception{
		return "";
	}
	@RequestMapping(value="/modify" , method = RequestMethod.POST)
	public void userModifyPOST() throws Exception{
		
	}
	
	@RequestMapping(value="/remove" , method = RequestMethod.GET)
	public String userRemoveGET() throws Exception{
		return "";
	}
	@RequestMapping(value="/remove" , method = RequestMethod.POST)
	public void userRemovePOST() throws Exception{
		
	}
	
	@RequestMapping(value="/search" , method = RequestMethod.GET)
	public String userSearchGET() throws Exception{
		return "";
	}
	

}

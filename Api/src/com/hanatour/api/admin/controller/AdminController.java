package com.hanatour.api.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.eclipse.core.internal.jobs.ObjectMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanatour.api.admin.service.AdminService;
import com.hanatour.api.common.domain.CommonCodeVO;
import com.hanatour.api.common.domain.DocVO;
import com.hanatour.api.common.domain.MemberVO;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Inject
	AdminService service;
	
	//관리자 Main
	@RequestMapping(value = {"", "/main"}, method = RequestMethod.GET)
	public String nlist(Locale locale, HttpSession session, Model model)throws Exception{
		String name = (String) session.getAttribute("emp_nm");
		
		model.addAttribute("nlist", service.Ndoc_list());
		model.addAttribute("emp_nm", name);
		System.out.println("너의 이름은? " + name);
		
		return "/admin/main";
	}
	
	//사원관리페이지
	@RequestMapping(value = "/emp")
	public void emplist(HttpSession session, Model model)throws Exception{
		model.addAttribute("emp_list", service.Ndoc_list());
		model.addAttribute("code_list", service.code_list("005"));
	}
	
	//사원수정
	@RequestMapping(value = "/emp_modify", method = RequestMethod.POST)
	@ResponseBody
	public void emp_modifyPOST(@RequestBody List<Map<String, MemberVO>> vo, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = new HashMap<>();
		
		ObjectMapper mapper = new ObjectMapper();
	}
	
	//사원삭제
	@RequestMapping(value="emp_remove", method= RequestMethod.POST)
	public String emp_removePOST(List<MemberVO> vo, RedirectAttributes rttr) throws Exception{
		
		service.emp_remove(vo);
		return "redirect:/admin/main";
	}
	
	//문서관리페이지
	@RequestMapping(value = "/doc")
	public void doclist(HttpSession session, Model model) throws Exception{
		model.addAttribute("doclist", service.doc_list());
	}
	
	//문서수정
	@RequestMapping(value="/doc_modify", method= RequestMethod.POST)
	public String doc_modifyPOST(List<DocVO> vo, RedirectAttributes rttr) throws Exception{
		
		service.doc_modify(vo);
		return "redirect:/admin/doc";
	}
	
	//코드관리페이지
	@RequestMapping(value="/code", method = RequestMethod.GET)
	public void codelist(@ModelAttribute("vo") CommonCodeVO vo, HttpSession session, Model model) throws Exception{
		
		if(vo.getC_cd() == null){
			vo.setC_cd("000");
		}
		
		model.addAttribute("code_sellist", service.code_sellist());
		model.addAttribute("code_list", service.code_list(vo.getC_cd()));
	}
	
	//코드변경
	@RequestMapping(value = "/code_moidfy", method = RequestMethod.POST)
	public String code_modifyPOST(List<CommonCodeVO> vo, RedirectAttributes rttr) throws Exception{
	
		service.code_modify(vo);
		return "redirect:/admin/code";
	}
	
	//코드삭제
	@RequestMapping(value = "/code_remove", method = RequestMethod.POST)
	public String code_removePOST(List<CommonCodeVO>vo, RedirectAttributes rttr) throws Exception{
		service.code_remove(vo);
		return "redirect:/admin/code";
	}
	

}

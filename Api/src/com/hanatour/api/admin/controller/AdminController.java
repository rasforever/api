package com.hanatour.api.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanatour.api.admin.service.AdminService;
import com.hanatour.api.common.domain.CommonCodeVO;

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
	public Map<String, Object> emp_modifyPOST(@RequestBody Map<String, Object> pMap, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = pMap;
		Map<String, Object> returntMap = new HashMap<>();
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,Object>> memberListVO = mapper.readValue(resultMap.get("memberVO").toString(), new TypeReference<List<Map<String, Object>>>(){});
			service.emp_modify(memberListVO);
			returntMap.put("result", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			returntMap.put("result", false);
		}
		return returntMap;
	}
	
	//사원삭제
	@RequestMapping(value="emp_remove", method= RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> emp_removePOST(@RequestBody Map<String, Object> pMap, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = pMap;
		Map<String, Object> returntMap = new HashMap<>();
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,Object>> memberListVO = mapper.readValue(resultMap.get("memberVO").toString(), new TypeReference<List<Map<String, Object>>>(){});
			service.emp_remove(memberListVO);
			returntMap.put("result", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			returntMap.put("result", false);
		}
		return returntMap;
	}
	
	//문서관리페이지
	@RequestMapping(value = "/doc")
	public void doclist(HttpSession session, Model model) throws Exception{
		model.addAttribute("doclist", service.doc_list());
		model.addAttribute("code_list", service.code_list("003"));
	}
	
	//문서수정
	@RequestMapping(value="/doc_modify", method= RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> doc_modifyPOST(@RequestBody Map<String, Object> pMap, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = pMap;
		Map<String, Object> returntMap = new HashMap<>();
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,Object>> DocListVO = mapper.readValue(resultMap.get("docVO").toString(), new TypeReference<List<Map<String, Object>>>(){});
			service.doc_modify(DocListVO);
			returntMap.put("result", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			returntMap.put("result", false);
		}
		return returntMap;
	}

	
	//코드관리페이지
	@RequestMapping(value="/code", method = RequestMethod.GET)
	public void codelist(@ModelAttribute("vo") CommonCodeVO vo, HttpSession session, Model model) throws Exception{
		
		if(vo.getC_cd() == null){
			vo.setC_cd("000");
		}
		
		model.addAttribute("code_sellist", service.code_sellist());
		model.addAttribute("code_list", service.code_list(vo.getC_cd()));
		
		model.addAttribute("C_Code", vo.getC_cd());
		
	}
	
	//코드변경
	@RequestMapping(value = "/code_moidfy", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> code_modifyPOST(@RequestBody Map<String, Object> pMap, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = pMap;
		Map<String, Object> returntMap = new HashMap<>();
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,Object>> CodeListVO = mapper.readValue(resultMap.get("commonCodeVO").toString(), new TypeReference<List<Map<String, Object>>>(){});
			service.code_modify(CodeListVO);
			returntMap.put("result", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			returntMap.put("result", false);
		}
		return returntMap;
	}
	
	//코드삭제
	@RequestMapping(value = "/code_remove", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> code_removePOST(@RequestBody Map<String, Object> pMap, HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = pMap;
		Map<String, Object> returntMap = new HashMap<>();
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,Object>> CodeListVO = mapper.readValue(resultMap.get("commonCodeVO").toString(), new TypeReference<List<Map<String, Object>>>(){});
			service.code_remove(CodeListVO);
			returntMap.put("result", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			returntMap.put("result", false);
		}
		return returntMap;
	}
	

}

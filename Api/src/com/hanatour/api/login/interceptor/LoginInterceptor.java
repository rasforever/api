package com.hanatour.api.login.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hanatour.api.common.domain.MemberVO;


public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	private static final String LOGIN = "login";
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		System.out.println("login prehandler");
		if (session.getAttribute(LOGIN) != null) {
			logger.info("clear login data before");
			session.removeAttribute(LOGIN);
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception { 
		HttpSession session = request.getSession();
		
		
		ModelMap modelmap = modelAndView.getModelMap();
		
		MemberVO memberVO = (MemberVO) modelmap.get("memberVO");
		String admin_ck =(String) modelmap.get("empnm");
		
		if(memberVO !=null){	
			session.setAttribute(LOGIN, memberVO); // 로그인 정보 저장
			session.setAttribute("emp_id", memberVO.getEmp_id());
			session.setAttribute("emp_nm", memberVO.getEmp_nm());
			session.setAttribute("emp_rank", memberVO.getEmp_rank());
			session.setAttribute("admin_aut", memberVO.getAdmin_aut()); 
			
			String admin_aut = memberVO.getAdmin_aut();
			Object dest = session.getAttribute("dest");
			
			//관리자 체크여부
			if(admin_ck.equals("Y")){
				
				//관리자 체크시
				if(admin_aut.equals("Y")){
					response.sendRedirect(dest !=null ? (String)dest:"/admin/main");
				} else{
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('당신은 관리자가 아닙니다.');");
					out.println("location.href='/login';");
					out.println("</script>");
					out.close();
					
				} 
			} else{
				response.sendRedirect(dest !=null ? (String)dest:"/user/main");
			}
		} else{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('아아디/비밀번호가 틀립니다.');");
			out.println("location.href='/login';");
			out.println("</script>");
			out.close();
		}


	}

}

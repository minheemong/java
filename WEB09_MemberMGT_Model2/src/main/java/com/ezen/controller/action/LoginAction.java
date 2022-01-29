package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달받은 로그인 정보로 유효 로그인 동작에 관한 검증
		// 서블릿 마다 request.setCharacterEncoding("UTF-8"); 안써도 됨
		String userid = request.getParameter("userid");	
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(userid);	
		
		String url = "member/loginForm.jsp";
		if(mdto==null) {
			request.setAttribute("message", "아이디가 없습니다");
		}else if(mdto.getPwd()==null) {
			request.setAttribute("message", "회원정보 오류입니다");
		}else if(mdto.getPwd().equals(pwd)){
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto);
			url = "member.do?command=main";
		}else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("message", "비밀번호를 확인하세요");
		}else {
			request.setAttribute("message", "알 수 없는 오류입니다");
		}
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}

}

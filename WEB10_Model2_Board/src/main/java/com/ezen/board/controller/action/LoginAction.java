package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.MemberDao;
import com.ezen.board.dto.MemberDto;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String url = "member/loginForm.jsp";
		MemberDao  mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(userid);
		
		if( mdto == null ) {
			request.setAttribute("message", "존재하지 않는 아이디입니다");
		} else if( !mdto.getPwd().equals(pwd) ) {
			request.setAttribute("message", "비밀번호를 확인하세요");
		} else if( mdto.getPwd().equals(pwd) ) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto);
			url = "board.do?command=boardlist";
		} else {
			request.setAttribute("message", "DB 또는 시스템 오류");
		}
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}

}

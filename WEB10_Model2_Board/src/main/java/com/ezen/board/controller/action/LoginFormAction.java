package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "member/loginForm.jsp";
		
		HttpSession session = request.getSession(); // 페이지의 세션 추출
		if (session.getAttribute("loginUser") != null) 
			url = "board.do?command=boardlist";
			
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);	

	}

}

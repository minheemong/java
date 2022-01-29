package com.ezenac.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindIdPwdAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/findIdPw.jsp";
		//RequestDispatcher dp = request.getRequestDispatcher(url);
		//dp.forward(request, response);
		request.getRequestDispatcher(url).forward(request, response);
	}

}

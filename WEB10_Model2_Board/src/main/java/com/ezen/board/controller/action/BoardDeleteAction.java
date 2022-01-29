package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;

public class BoardDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt( request.getParameter("num") );
		
		BoardDao bdao = BoardDao.getInstance();
		bdao.deleteBoard( num );
		
		RequestDispatcher dp = request.getRequestDispatcher("board.do?command=boardlist");
		dp.forward(request, response);

	}

}

package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;

public class BoardUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt( request.getParameter("num") );

		BoardDao bdao = BoardDao.getInstance();
		BoardDto bdto = bdao.getBoard(num);
		
		// 수정폼으로 저장 & 포워딩합니다
		request.setAttribute("board", bdto);
		RequestDispatcher dispatcher = request.getRequestDispatcher("board/boardUpdate.jsp");
		dispatcher.forward(request, response);
	}

}

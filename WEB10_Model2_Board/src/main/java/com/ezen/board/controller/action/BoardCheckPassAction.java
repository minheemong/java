package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt( request.getParameter("num") );
		String pass = request.getParameter("pass");
		
		// 전달된 게시물번호로 게시물을 조회하고 린턴받습니다
		BoardDao bdao = BoardDao.getInstance();
		BoardDto bdto = bdao.getBoard(num);
		
		String url = null;
		// 전달받은 비번과  조 회한 게시물의 비번을 비교합니다
		if( bdto.getPass().equals(pass) ) {
			// 비번이 같으면  checkSuccess.jsp 로 이동
			url = "board/checkSuccess.jsp";
		}else {
			// 비번이 틀리면 다시 boardCheckPass.jsp 로 이동
			url = "board/boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}

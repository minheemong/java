package com.ezen.board.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.ezen.board.dto.ReplyDto;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//게시물 번호를 이용하여 해당게시글의 조회수를 +1 합니다
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDao bdao = BoardDao.getInstance();
		bdao.updateReadCount(num);
		
		// 게시물 번호를 이용하여 게시물 하나를 조회하고 리턴받습니다
		BoardDto bdto = bdao.getBoard(num);
		// 해당 게시물의 댓글을 게시물 번호로 조회하여 리스트로 리턴받습니다
		ArrayList<ReplyDto> list = bdao.selectReply(num);
		
		// 리턴받은 게시글을 request에 저장하고 boardView.jsp로 포워딩합니다.
		request.setAttribute("board", bdto);
		request.setAttribute("replyList", list);
		
		RequestDispatcher dp = request.getRequestDispatcher("board/boardView.jsp");
		dp.forward(request, response);
	}

}

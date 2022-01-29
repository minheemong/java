package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.board.dao.BoardDao;

public class DeleteReplyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		String boardnum = request.getParameter("boardnum");
		
		// 해당 댓글 삭제 후
		BoardDao bdao = BoardDao.getInstance();
		bdao.deleteReply(num);
		
		//전달받은 게시물 번호로 돌아갑니다
		response.sendRedirect(
				"board.do?command=boardviewwithoutcount&num="+boardnum);
		//new BoardViewWithoutCountAction().execute(request, response);
	}

}

package com.ezen.board.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dao.MemberDao;
import com.ezen.board.dto.BoardDto;
import com.ezen.board.dto.MemberDto;

public class EditAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDto mdto = new MemberDto();
		mdto.setAdmin(Integer.parseInt(request.getParameter("admin")));
		mdto.setUserid(request.getParameter("userid"));
		mdto.setEmail(request.getParameter("email"));
		mdto.setName(request.getParameter("name"));
		mdto.setPhone(request.getParameter("phone"));
		mdto.setPwd(request.getParameter("pwd"));
		
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.editMember(mdto);
		HttpSession session = request.getSession();
		
		//BoardDao bdao = BoardDao.getInstance();
		//ArrayList<BoardDto> list = bdao.selectBoard();
		//request.setAttribute("boardList", list);
		
		//RequestDispatcher dp = request.getRequestDispatcher("main.jsp");
		RequestDispatcher dp = request.getRequestDispatcher("board.do?command=boardlist");
		dp.forward(request, response);

	}

}

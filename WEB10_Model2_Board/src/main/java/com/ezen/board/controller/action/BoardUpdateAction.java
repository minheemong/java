package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		ServletContext context = session.getServletContext();
		String path = context.getRealPath("upload");
		
		MultipartRequest multi = new MultipartRequest(
				request,path,20*1024*1024,"UTF-8", new DefaultFileRenamePolicy()
				);
		
		BoardDto bdto = new BoardDto();
		
		int num = Integer.parseInt(multi.getParameter("num"));
		bdto.setUserid( multi.getParameter("userid"));
		bdto.setPass( multi.getParameter("pass"));
		bdto.setEmail( multi.getParameter("email"));
		bdto.setTitle( multi.getParameter("title"));
		bdto.setContent( multi.getParameter("content"));
		bdto.setNum(num);
		
		String filename = multi.getFilesystemName("imgfilename");
		if(filename==null) filename=multi.getParameter("oldfilename");
		bdto.setImgfilename(filename);

		BoardDao bdao = BoardDao.getInstance();
		bdao.updateBoard(bdto);
		
		RequestDispatcher dp = request.getRequestDispatcher(
				"board.do?command=boardviewwithoutcount&num=" + num);
		dp.forward(request, response);
	}

}

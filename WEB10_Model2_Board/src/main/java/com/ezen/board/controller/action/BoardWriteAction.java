package com.ezen.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달된 내용을 BoardDto에 담아서 BoardDao의 insertBoard메서드로
		// 전달해서 레코드를 추가합니다.
		request.setCharacterEncoding("UTF-8");
		BoardDto bdto = new BoardDto();
		
		HttpSession session = request.getSession();
		ServletContext context = session.getServletContext();
		String path = context.getRealPath("upload");
		
		MultipartRequest multi = new MultipartRequest(
				request,path,20*1024*1024,"UTF-8", new DefaultFileRenamePolicy()
				);
		bdto.setUserid(multi.getParameter("userid"));
		bdto.setEmail(multi.getParameter("email"));
		bdto.setTitle(multi.getParameter("title"));
		bdto.setContent(multi.getParameter("content"));
		bdto.setPass(multi.getParameter("pass"));
		bdto.setImgfilename(multi.getFilesystemName("imgfilename"));
		
		BoardDao bdao = BoardDao.getInstance();
		bdao.insertBoard(bdto);
		// 최종 board.do?command=boardlist로 이동합니다
		response.sendRedirect("board.do?command=boardlist");
	}

}

package com.ezen.board.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.board.dao.BoardDao;
import com.ezen.board.dto.BoardDto;
import com.ezen.board.util.Paging;

public class BoardListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 현재 보려고 하는 페이지가 담길 변수를 만듭니다. 최초값 1
		int page = 1;
		
		// 전달된 파라미터 page  값이 비어있지 않다면, 전달된 값으로   page  값을 업데이트
		HttpSession session = request.getSession();
		if( request.getParameter("page")!=null  ) { // 파라미터가 있으면 파라미터값으로 페이지 설정
			page = Integer.parseInt( request.getParameter("page") );
			session.setAttribute("page",page);
		} else if(session.getAttribute("page")!=null) { // 파라미터 없고 세션값 있으면 그 값으로 페이지 설정
			page = (int) session.getAttribute("page");
		} else { // 파라미터와 세션 모두 페이지 값이 없으면 1페이지로
			page=1;
			session.removeAttribute("page");
		}
		
		
		Paging paging = new Paging();  // 페이징 객체 생성
		// page 변수의 값을 paging 객체의 멤버변수 page 에 set합니다
		paging.setPage(page);
		
		BoardDao bdao = BoardDao.getInstance();
		int count = bdao.getAllCount();
		
		paging.setTotalCount(count);
		
		ArrayList<BoardDto> list = bdao.selectBoard( paging );
		
		request.setAttribute("boardList", list);
		
		request.setAttribute("paging", paging);
		
		RequestDispatcher dp = request.getRequestDispatcher("main.jsp");
		dp.forward(request, response);
	}

}

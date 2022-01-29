package com.ezenac.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.dao.QnaDao;
import com.ezenac.dto.MemberVO;
import com.ezenac.dto.QnaVO;

public class QnaListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "qna/qnaList.jsp";
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		if(mvo==null) {
			url = "shop.do?command=loginFrom";
		}else {
			QnaDao qdao = QnaDao.getInstance();
			ArrayList<QnaVO> list = qdao.listQna(mvo.getId()); // 로그인유저가 작성한 게시물 조회
			request.setAttribute("qnaList", list);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}

package com.ezenac.controller.admin.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.controller.action.Action;
import com.ezenac.dao.AdminDao;
import com.ezenac.dto.AdminVO;
import com.ezenac.dto.QnaVO;

public class AdminQnaRepsaveAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "shop.do?command=adminQnaDetail";
		
		HttpSession session = request.getSession();
		AdminVO id = (AdminVO)session.getAttribute("loginAdmin");
		
		if(id==null) {
			url = "shop.do?command=admin";
		}else {
			AdminDao adao = AdminDao.getInstance();
			QnaVO qvo = new QnaVO();
			qvo.setQseq(Integer.parseInt(request.getParameter("qseq")));
			qvo.setReply(request.getParameter("reply"));
			// 답글저장 및 답글상태 변경('1' -> '2')
			adao.updateQna(qvo);
			// 원래 보던 Qna 페이지로 이동
			url = url + "&qseq=" + request.getParameter("qseq");
		}response.sendRedirect(url);
	}

}

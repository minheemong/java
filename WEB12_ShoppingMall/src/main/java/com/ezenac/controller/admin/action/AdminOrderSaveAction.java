package com.ezenac.controller.admin.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.controller.action.Action;
import com.ezenac.dao.AdminDao;
import com.ezenac.dto.AdminVO;
import com.ezenac.dto.OrderVO;

public class AdminOrderSaveAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "shop.do?command=adminOrderList";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		if(avo == null) {
			url = "shop.do?command=admin";
		}else {
			// 전달된 주문상세번호들의 주문을 미처리 -> 처리로 변경해주세요
			AdminDao adao = AdminDao.getInstance();
			String[] resultArr = request.getParameterValues("result");
			for(String odseq : resultArr) adao.resultChange(odseq);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}

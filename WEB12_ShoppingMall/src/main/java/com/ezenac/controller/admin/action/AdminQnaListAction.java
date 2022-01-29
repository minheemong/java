package com.ezenac.controller.admin.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.controller.action.Action;
import com.ezenac.dao.AdminDao;
import com.ezenac.dto.AdminVO;
import com.ezenac.dto.QnaVO;
import com.ezenac.util.Paging;

public class AdminQnaListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/qna/qnaList.jsp";
		
		HttpSession session = request.getSession();
		AdminVO id = (AdminVO)session.getAttribute("loginAdmin");
		
		int page = 1;
		
		if(id==null) {
			url = "shop.do?command=admin";
		}else {
			// 검색을 위한 준비
			 String key = "";
			 if(request.getParameter("key")!=null) {
				 key = request.getParameter("key");
				 session.setAttribute("key", key);
			 } else if(session.getAttribute("key")!=null) {
					key = (String)session.getAttribute("key");
			}else {
					session.removeAttribute("key");
					key="";
			}
			// 현재 표시할 페이지에 대한 준비
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
				session.setAttribute("page", page);
			}else if(session.getAttribute("page")!=null) {
				page = (int)session.getAttribute("page");
			}else {
				page = 1;
				session.removeAttribute("page");
			}
			Paging paging =new Paging();
			paging.setPage(page);
			
			AdminDao adao = AdminDao.getInstance();
			
			int count = adao.getAllCount(key);
			paging.setTotalCount(count);
			
			ArrayList<QnaVO> qnaList = adao.listQna(paging, key);
			request.setAttribute("qnaList", qnaList);
			request.setAttribute("paging", paging);
			request.setAttribute("key", key);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}

package com.ezenac.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezenac.dao.ProductDao;
import com.ezenac.dto.ProductVO;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDao pdao = ProductDao.getInstance();
		
		ArrayList<ProductVO> newlist = pdao.getNewList();
		ArrayList<ProductVO> bestlist = pdao.getBestList();
		
		request.setAttribute("newProductList", newlist);
		request.setAttribute("bestProductList", bestlist);
		RequestDispatcher dp = request.getRequestDispatcher("index.jsp");
		dp.forward(request, response);
	}

}

package com.ezenac.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezenac.dao.ProductDao;
import com.ezenac.dto.ProductVO;

public class CategoryAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달받은 kind 값으로 상품을 검색하고 list를 리턴 받아서 저장하고, productKind.jsp로 이동
		String kind = request.getParameter("kind"); // 파라미터 전달
		ProductDao pdao = ProductDao.getInstance();
		ArrayList<ProductVO> list = pdao.listKindProduct(kind);  // 상품 조회 및 리턴
		request.setAttribute("productKindList",list); // 저장
		request.getRequestDispatcher("product/productKind.jsp").forward(request, response);
	}

}

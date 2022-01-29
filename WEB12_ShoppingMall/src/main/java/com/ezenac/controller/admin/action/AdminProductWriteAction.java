package com.ezenac.controller.admin.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.controller.action.Action;
import com.ezenac.dao.AdminDao;
import com.ezenac.dto.AdminVO;
import com.ezenac.dto.ProductVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AdminProductWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "shop.do?command=adminProductList";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO) session.getAttribute("loginAdmin");
		if(avo == null) {
			url = "shop.do?command=admin";
		}else {
			// 현재 프로젝트의 세션을 통해 적용할 저장경로 얻음
			ServletContext context = session.getServletContext();
			String uploadFilePath = context.getRealPath("product_images");
	
			// MultipartRequest 객체 생성 - 파일 업로드
			MultipartRequest multi = new MultipartRequest(
					request, uploadFilePath, 5*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
			
			// 나머지 파라미터들을 dto에 저장
			ProductVO pvo = new ProductVO();
			pvo.setKind(multi.getParameter("kind"));
			pvo.setName(multi.getParameter("name"));
			pvo.setPrice(Integer.parseInt(multi.getParameter("price")));
			pvo.setPrice2(Integer.parseInt(multi.getParameter("price2")));
			pvo.setPrice3(Integer.parseInt(multi.getParameter("price3")));
			pvo.setContent(multi.getParameter("content"));
			pvo.setImage(multi.getFilesystemName("image"));
			
			AdminDao adao = AdminDao.getInstance();
			adao.insertProduct(pvo);
			}
		response.sendRedirect(url);
	}

}

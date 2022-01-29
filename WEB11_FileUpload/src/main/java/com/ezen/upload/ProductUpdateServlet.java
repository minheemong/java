package com.ezen.upload;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDao;
import com.ezen.dto.ProductVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class ProductUpdateServlet
 */
@WebServlet("/update.do")
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		
		ProductDao pdao = ProductDao.getInstance();
		ProductVO pvo = pdao.getProduct(code);
		
		request.setAttribute("product",pvo);
		
		RequestDispatcher rd = request.getRequestDispatcher("product/productUpdate.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("fileUpload");
		String code= null;
		try {
			MultipartRequest multi = new MultipartRequest(
					request,path,20*1024*1024,"UTF-8", new DefaultFileRenamePolicy()
					);
			code = multi.getParameter("code");
			String name = multi.getParameter("name");
			int price = Integer.parseInt(multi.getParameter("price"));
			String description = multi.getParameter("description");
			String pictureUrl = multi.getFilesystemName("pictureurl");
			// 수정하고자 하는 이미지 이름이 널값이라면, 기존 이미지 이름이 현재 수정대상의 이미지이름으로 세트됩니다.
			if(pictureUrl==null) pictureUrl = multi.getParameter("oldPicture");
			
			ProductVO pvo = new ProductVO();
			pvo.setCode(Integer.parseInt(code));
			pvo.setName(name);
			pvo.setPrice(price);
			pvo.setDescription(description);
			pvo.setPictureurl(pictureUrl);
			ProductDao pdao = ProductDao.getInstance();
			pdao.updateProduct(pvo);
		}catch(Exception e) {
			System.out.println("파일업로드 실패 : " + e);
		}
		RequestDispatcher rd =request.getRequestDispatcher("view.do?code="+code);
		rd.forward(request, response);
	}

}

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
 * Servlet implementation class ProductWriteServlet
 */
@WebServlet("/productwrite.do")
public class ProductWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dp = request.getRequestDispatcher("product/productWrite.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("fileUpload");
		
		ProductVO pvo = new ProductVO();
	
		try {
			MultipartRequest multi = new MultipartRequest(
				request,path,20*1024*1024,"UTF-8",new DefaultFileRenamePolicy()
			);
			pvo.setName(multi.getParameter("name"));
			pvo.setPrice(Integer.parseInt(multi.getParameter("price")));
			pvo.setDescription(multi.getParameter("description"));
			pvo.setPictureurl(multi.getFilesystemName("pictureurl"));
		} catch(Exception e) {
			System.out.print("파일업로드 실패 : " + e);
		}
		ProductDao pdao = ProductDao.getInstance();
		pdao.insertProduct(pvo);
		// 목록으로 되돌아 갑니다
		response.sendRedirect("productlist.do");
	}

}

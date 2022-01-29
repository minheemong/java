package com.ezen.uservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Join_Servlet2
 */
@WebServlet("/Join_Servlet2")
public class Join_Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Join_Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		String item[] = request.getParameterValues("item"); 
		String job = request.getParameter("job");
		String [] interest = request.getParameterValues("interest");
		
		request.setAttribute("id", id);
		request.setAttribute("pwd",pwd);
		if(gender.equals("1")) request.setAttribute("gender","남성");
		if(Integer.parseInt(gender)==2) request.setAttribute("gender", "여성");
		
		if(chk_mail.equals("1")) request.setAttribute("chk_mail", "수신");
		else request.setAttribute("chk_mail","거부");
		
		request.setAttribute("content",content);
		
		// item 처리
		String [] sItem = new String[item.length];
		for(int i=0;i<item.length;i++) {
			switch(item[i]) {
			case "1" : sItem[i] = "신발"; break;
			case "2" : sItem[i] = "가방"; break;
			case "3" : sItem[i] = "벨트"; break;
			case "4" : sItem[i] = "모자"; break;
			case "5" : sItem[i] = "시계"; break;
			case "6" : sItem[i] = "쥬얼리"; break;
			}
		}
		request.setAttribute("items", sItem);
		
		request.setAttribute("job", job);
		
		request.setAttribute("interests",interest); // 전달된 값이 이미 변환된 텍스트이기 때문에 바로 저장
		
		RequestDispatcher dp = request.getRequestDispatcher("02/1112_JSP_Servlet_Ex0202.jsp");
		dp.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

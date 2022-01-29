package com.ezen.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String url = "member/loginForm.jsp";
			
		HttpSession session =request.getSession();
		if( session.getAttribute("loginUser")==null) 
				url = "member/loginForm.jsp";
		
		String userid = request.getParameter("userid");
		MemberDao mdao = MemberDao.getInstance();
		
		MemberDto mdto = mdao.getMember(userid);
		
		request.setAttribute("updateMember", mdto); 
		
		RequestDispatcher dp = request.getRequestDispatcher("member/updateForm.jsp");
		dp.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		MemberDto mdto = new MemberDto();
		mdto.setName(request.getParameter("name"));
		mdto.setUserid( request.getParameter("userid") );
		mdto.setPwd( request.getParameter("pwd") );
		mdto.setEmail( request.getParameter("email") );
		mdto.setPhone( request.getParameter("phone") );
		mdto.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.updateMember(mdto);
		
		if(result==1) {// 업데이트가 성공되었다면
			request.setAttribute("message","회원정보를 수정하였습니다");
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto); // 세션 로그인 정보 교체
		}else { 
			request.setAttribute("message","회원정보를 수정 오류. 관리자에게 문의하세요");
		}
		RequestDispatcher dp = request.getRequestDispatcher("main.do");
		dp.forward(request,response);
	}

}

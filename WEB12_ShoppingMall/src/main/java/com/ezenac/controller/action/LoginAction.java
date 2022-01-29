package com.ezenac.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.dao.MemberDao;
import com.ezenac.dto.MemberVO;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "member/login.jsp";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDao mdao = MemberDao.getInstance();
		MemberVO mvo = mdao.getMember(id);
		
		if(mvo.getId()==null) {
			request.setAttribute("message", "아이디가 없습니다");
		}else if(mvo.getPwd()==null){
			request.setAttribute("message", "회원정보 오류입니다. 관리자에게 문의하세요");
		}else if(!mvo.getPwd().equals(pwd)){
			request.setAttribute("message", "비밀번호가 틀립니다");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mvo);
			url="shop.do?command=index";
		}
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
	}

}

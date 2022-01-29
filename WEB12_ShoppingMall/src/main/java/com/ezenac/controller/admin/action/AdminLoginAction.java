package com.ezenac.controller.admin.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezenac.controller.action.Action;
import com.ezenac.dao.AdminDao;
import com.ezenac.dto.AdminVO;

public class AdminLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String workId = request.getParameter("workId");
		String workPwd = request.getParameter("workPwd");

		String url = "shop.do?command=admin";
		String msg = "";  // 로그인 결과를 저장했다가 request를 통해 전송될 변수
		
		// AdminDao 생성 후 인스턴스를 얻습니다
		AdminDao adao = AdminDao.getInstance();
		// AdminDao 안의 workerCheck 메서드 생성후 호출합니다
		AdminVO avo = adao.workerCheck(workId);
		
		if(avo == null) msg = "없는 아이디입니다";
		else if(avo.getPwd()==null) msg = "DB오류. 관리자에게 문의하세요";
		else if(!avo.getPwd().equals(workPwd)) msg = "암호가 다릅니다";
		else {
			HttpSession session = request.getSession();
			session.setAttribute("loginAdmin", avo);
			url = "shop.do?command=adminProductList";
			//url = "admin/main.jsp"
		}
		request.getRequestDispatcher(url).forward(request, response);

	}

}

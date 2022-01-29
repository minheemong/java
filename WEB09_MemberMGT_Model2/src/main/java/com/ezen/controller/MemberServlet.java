package com.ezen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.controller.action.Action;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 전달된 파라미터 command 값을 추출합니다.
		String command = request.getParameter("command");
		System.out.println(command);
		// command에 전달된 값에 따라 어떤 작업을 하지 결정되어 실행됩니다.
		
		/* 액션팩토리클래스로
		 * if(command.equals("loginForm")) ac = new LoginFormAction(); else
		 * if(command.equals("login")) ac = new LoginAction(); else
		 * if(command.equals("joinForm")) ac = new joinFormAction(); else
		 * if(command.equals("join")) ac = new joinAction();
		 */
		
		// 각 command 별 실행할 작업들은 해당 실행코드가 들어있는 클래스에 있습니다.
		// 클래스 내부중에서도 execute 메서드 안에 있습니다
		// Model2 방식은 각 기능별로 클래스가 제작되어 실행되기를 기다리고, command
		// 값에 따라 선택되어 실행되는 형식입니다.
		ActionFactory af = ActionFactory.getInstance();
		Action ac = af.getAction(command);
		
		// 실제 new 인스턴스의 생성과 execute()의 실행은 각 클래스들이 상속받은
		// 부모 인터페이스(Action)의 레퍼런스 변수에 저장하고,
		// 레퍼런스 변수명.execute로 실행합니다
		
		// 각 클래스에 있는 execute 메서드는 Action 인터페이스에 존재하는 추상메서드입니다.
		// 각 클래스가 Action 인터페이스를 상속(implement)하여, execute 메서드가
		// 오버라이딩되면 Action 인터페이스의 레퍼런스 변수로
		// 자식 클래스의 execute 메서드를 호출하여 사용합니다.
		
		// 1. Action ac = null;
		// 2. if(command.equals("loginForm")) ac = new LoginFormAction();
		// 3. elseif(command.equals("joinForm")) ac = new JoinFormAction();
		if(ac!=null) ac.execute(request, response); // 덕분에 로그인액션에서 파라미터값 전달 가능함
		else System.out.println("command를 확인하세요.");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

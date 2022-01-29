<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

// 원하는 아이디와 비번이 전달되어 왔는지 확인후 맞으면  073_loginOk.jsp 로 이동합니다
// jsp 문법으로 페이지 이동은 response.sendRedirect();
if( id.equals("hong") && pwd.equals("1234") )
	response.sendRedirect("073_loginOk.jsp?name=" + URLEncoder.encode("홍길동", "UTF-8") );
else
	response.sendRedirect("071_loginForm.jsp");

// jsp 파일에서 로그인 절차를 진행하면 안좋은점 #1
// 한글 전달값에 대한 인토딩이 UTF-8 이 아니어서 할글이 깨집니다
// 별도의 URLEncoding 객체를 사용해야 합니다
%>
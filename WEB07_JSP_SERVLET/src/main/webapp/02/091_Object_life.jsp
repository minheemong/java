<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>091_Object_life.jsp</title>
</head>
<body>
<%
pageContext.setAttribute("name","pageman"); //pageContext : 현재페이지까지
request.setAttribute("name","request man"); // request : 다음페이지까지
session.setAttribute("name","session man"); // session : 브라우저가 닫힐 때까지
application.setAttribute("name","application man");
// application : 서버가 꺼지거나 리스타트될 때까지
System.out.println("firstPage.jsp : ");
System.out.println("First의 pageContext객체 : " + pageContext.getAttribute("name"));
System.out.println("First의 request객체 : " + request.getAttribute("name"));
System.out.println("First의 session객체 : " + session.getAttribute("name"));
System.out.println("First의 application객체 : " + application.getAttribute("name"));

RequestDispatcher dispatcher = request.getRequestDispatcher("092_ObjectLife.jsp");
dispatcher.forward(request,response);
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>093_ObjectLife.jsp</title>
</head>
<body>
<!-- 각 개체의 수명
pageContext : 현재페이지까지
request : 다음페이지까지 - forward에 의해 연장될 수 있다
session : 브라우저가 닫힐때까지
application : 서버가 꺼지거나 리셋될때까지 -->
third의 pageContext속성 : <%= pageContext.getAttribute("name") %> <br>
third의 request속성 : <%= request.getAttribute("name") %> <br>
third의 session속성 : <%= session.getAttribute("name") %> <br>
third의 application속성 : <%= application.getAttribute("name") %> <br>
</body>
</html>
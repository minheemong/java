<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>092_ObjectLife.jsp</title>
</head>
<body>
second의 pageContext속성 : <%= pageContext.getAttribute("name") %> <br>
second의 request속성 : <%= request.getAttribute("name") %> <br>
second의 session속성 : <%= session.getAttribute("name") %> <br>
second의 application속성 : <%= application.getAttribute("name") %> <br>
<a href="093_ObjectLife.jsp">또 다른 페이지</a>
</body>
</html>
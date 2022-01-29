<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_Scope.jsp</title>
</head>
<body>
<%
request.setAttribute("name", "request man");   //2
session.setAttribute("name", "session man");   //3
application.setAttribute("name", "application man");   //4
pageContext.setAttribute("name", "page man");   //1
%>
<!-- 각 객체의 저장된 Attribute의 이름이 중복되면, 우선순위를 부여해서 pageContext 에 저장된  Attribute가
적용되어 출력됩나다. 만약 pageContext가 없다면 request에 저장된 동일한 이름의 Attribute가 출력되고 
request가 없다면 session 에... session에 저정된 같은 이름의 Attribute가 없다면  
application 에 있는 Attribute 가 출력됩니다. -->
name : ${name} <hr>
page 속성 : ${pageScope.name} <br>
request 속성 : ${requestScope.name} <br>
session 속성 : ${sessionScope.name} <br>
application 속성 : ${applicationScope.name} <br>
</body>
</html>
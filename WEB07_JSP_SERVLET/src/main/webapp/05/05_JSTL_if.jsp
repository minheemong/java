<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_JSTL_if.jsp</title>
</head>
<body>

<!--  c:if    test  조건절에 참이면  /c:if 까지의 내용을 웹페이지에 적용또는 표시하고
아니면 표시-적용 없이 지나갑니다.   test  안의 조건식은  EL 문법을 이용합니다 -->

<c:if test="${param.color == 1}">
	<span style="color: red;font-size:180%; font-weight:bold;">빨강</span>
</c:if>
<c:if test="${param.color == 2}">
	<span style="color: green;font-size:180%; font-weight:bold;">초록</span>
</c:if>
<c:if test="${param.color == 3}">
	<span style="color: blue;font-size:180%; font-weight:bold;">파랑</span>
</c:if>

</body>
</html>
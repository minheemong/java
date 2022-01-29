<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>16_ForEach_ETC.jsp</title>
</head>
<body>
<!-- 반복 실행문의 또다른 사용 예 -->
<h3>반복 실행문의 또다른 사용 예</h3>

<c:forEach var="cnt" begin="1" end="10" varStatus="status">
		${cnt} <c:if test="${not status.last }">, </c:if>
</c:forEach>
<br><br>
<hr>
<table border="1" style="width: 50%; text-align: center;" align="left">
	<tr><th>index</th><th>count</th><th>cnt</th></tr>
	<c:forEach var="cnt" begin="7" end="10" varStatus="status">
		<tr><td>${status.index}</td><td>${status.count}</td><td>${cnt}</td></tr>
	</c:forEach>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_ForEach.jsp</title>
</head>
<body>
<%
		String [] movieList = { "타이타닉", "시네마 천국", "혹성 탈출", "킹콩" };
		request.setAttribute("movieList", movieList);
		// Attribute 는 해쉬맵 형식의 리스트이므로 키값만 존재하면 어떤 자료들도 보관할 수 있습니다
		// ArrayList 등도 위의 배열과 같이 손쉽게 보관하거나 전달할수 있습니다.
%>

<!-- 배열의 내용을  JSP 로 적용하여 꺼내 출력한다면 -->
<%
String [] mlist = (String [])request.getAttribute("movieList");
for( String s : mlist)
	out.print(s + "<br>");
%>
<br>
<br>
<!-- EL과  JSTL 문법을 쓰면 아래와 같이 형변환 이나 메서드 사용없이 손쉽게 사용이 가능합니다 -->
<c:forEach var="movie" items="${movieList}">
		${movie}<br>
</c:forEach>
</body>
</html>






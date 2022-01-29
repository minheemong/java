<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/shopping.css" rel="stylesheet">
<script src="member/member.js"></script>
</head>
<body>
<div id="wrap" style="margin:20px 0">
<h1>ID 중복확인</h1>
	<form method="post" name="idCheckFrm" action="shop.do">
		<input type="hidden" name="command" value="idCheckForm">
		User ID<input type="text" name="id" value="${id}">
		<input type="submit" value="검색" class="submit"><br>
		
		<div style="margin-top:20px">
			<c:if test="${result==1}">
				<script type="text/javascript">opener.document.joinForm.id.value="";</script>
				${id}는 이미 사용중인 아이디입니다.
			</c:if>
			<c:if test="${result==-1}">
				${id}는 사용가능한 아이디입니다.
				<input type="button" value="사용" class="cancel" onclick="idok('${id}');">
			</c:if>
	</form>
</div>
</body>
</html>
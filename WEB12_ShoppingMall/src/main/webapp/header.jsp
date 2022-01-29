<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/shopping.css" rel="stylesheet">
<script src="member/member.js"></script>
<script src="mypage/mypage.js"></script>
</head>
<body>
<div id="wrap">
<header><!-- 로고, 주메뉴, 카테고리 메뉴 등이 표시되는 영역 -->
	
	<div id="logo"><!-- 메인로고 시작 -->
		<a href="shop.do?command=index">
			<img src="images/logo.png" width="180" height="100"/>
		</a>
	</div><!-- 메인로고 끝 -->
	<nav id="top_menu"><!-- 상단 메뉴 시작 : 로그인 CART MyPage 등 -->
		<ul>
			<c:choose>
				<c:when test="${empty loginUser}">
					<li><a href="shop.do?command=loginForm">LOGIN</a></li>
					<li><a href="shop.do?command=contract">JOIN</a></li>
				</c:when>
				<c:otherwise>
					<li>${loginUser.name}(${loginUser.id})</li>
					<li><a href="shop.do?command=mEditForm&id=${loginUser.id}">정보수정</a></li>
					<li><a href="shop.do?command=logout">LogOut</a></li>
				</c:otherwise>
			</c:choose>
			<li><a href="shop.do?command=cartList">CART</a></li>
			<li><a href="shop.do?command=myPage">MY PAGE</a></li>
			<li><a href="shop.do?command=qnaList">Q&amp;A (1:1)</a></li>
		</ul>
	</nav><!-- 상단메뉴 끝 -->
	<nav id="category_menu"><!-- 카테고리 메뉴 시작 Heels Boots Sandals 등 -->
		<ul>
			<li><a href="shop.do?command=category&kind=1">Heels</a></li>
			<li><a href="shop.do?command=category&kind=2">Boots</a></li>
			<li><a href="shop.do?command=category&kind=3">Sandals</a></li>
			<li><a href="shop.do?command=category&kind=4">Sneakers</a></li>
			<li><a href="shop.do?command=category&kind=5">Sleeper</a></li>
			<li><a href="shop.do?command=category&kind=6">On sale</a></li>
		</ul>
	</nav>
</header>




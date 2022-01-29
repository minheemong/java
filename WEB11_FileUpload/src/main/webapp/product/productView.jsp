<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productView.jsp</title>
<link rel="stylesheet" type="text/css" href="css/product.css">
</head>
<body>
<div id="wrap" align="center">
<h1>상품상세 - 관리자  페이지</h1>
<table>
	<tr><!-- 1열에는 이미지 --><td width="220">
		<c:choose><c:when test="${empty product.pictureurl}">
			<img src="fileUpload/noname.jpg"></c:when>
			<c:otherwise><img src="fileUpload/${product.pictureurl}">
			</c:otherwise></c:choose>
	</td>
	<td><!-- 2열에는 상품 상세가 표시되는 또 하나의 테이블을 위치시킵니다. -->
		<table>
			<tr><th width="80">상 품 명</th><td>${product.name}</td></tr>
			<tr><th>가 격</th><td>${product.price}원</td></tr>
			<tr><th>설 명</th><td><div style="height:220px; width:100%">
				<pre>${product.description}</pre></div></td></tr>
		</table>
	</td></tr>
</table><br>
<input type="button" value="목록" onclick="location.href='productlist.do'">
</div>
</body>
</html>
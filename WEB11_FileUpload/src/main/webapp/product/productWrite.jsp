<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productWrite.jsp</title>
<link rel="stylesheet" type="text/css" href="css/product.css">
</head>
<body>
<div id="wrap" align="center">
<h1>상품 등록 - 관리자 페이지</h1>
<form method="post" enctype="multipart/form-data" action="productwrite.do">
<table>
	<tr><th>상 품 명</th><td><input type="text" name="name" size="80"></td></tr>
	<tr><th>가 격</th><td><input type="text" name="price"></td></tr>
	<tr><th>사 진</th><td><input type="file" name="pictureurl"><br></td></tr>
	<tr><th>설 명</th><td><textarea cols="80" rows="10"
		name="description"></textarea></td></tr>
</table><br>
<input type="submit" value="등록"><input type="reset" value="다시작성">
<input type="button" value="목록" onclick="location.href='productlist.do'">
</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@charset "UTF-8";


.box{ position:relative; width:500px; height:50px; margin:0 auto; text-align:center; line-height:50px;
 font-weight:bold; }

.label{position:relative; width:248px; height:48px; float:left; background:yellowgreen; 
font-size:110%; text-align:center; line-height:50px; border:1px solid yellowgreen;}

.item{position:relative; width:248px; height:48px; float:left; border:1px solid yellowgreen; 
font-size:110%; text-align:left; line-height:50px; text-align:center;}

#loginid{ width:200px; height:20px; border:0px; font-size:110%;}
#loginpwd{ width:200px; height:20px; border:0px; font-size:110%;}



#wrap { width: 971px; margin: 0 auto;}
h1 {	color: green;}
table {	width: 100%;	border-collapse: collapse;	font-size: 12px; line-height: 24px; }
table td,th {border: #d3d3d3 solid 1px;padding: 5px;}
th {	background: yellowgreen; }
a { text-decoration: none;	 color: black; }
a:HOVER {	text-decoration: underline;  color: green; }

</style>
</head>
<body>
<div id="wrap" align="center">
	<h1>게시글 리스트</h1>
	
	<table>
		<tr><td colspan="5" style="border:white;">
			<div style="float:left;">홍길동(hong)님 로그인
		</div></td></tr> 
		<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회</th></tr>
		<c:forEach var="board" items="${boardList}">
			<tr   align="center">
				<td>${board.num}</td>
				<td   align="left" >${board.title}</td>
				<td>${board.name}</td>
				<td><fmt:formatDate value="${board.writedate}" /></td>
				<td>${board.readcount}</td>
			</tr>
		</c:forEach>
	</table>
	<br /><br />
	<div id="paging" align="center" style="font-size:110%; font-weight:bold;">
		<!-- 링크 경로의 기본텍스트를 변수에 저장 -->
		<c:url var="action" value="board.do?command=main" />
		<c:if test="${paging.prev}">
			<a href="${action}&page=${paging.beginPage-1}">◀</a>&nbsp;
		</c:if>
		
		<c:forEach begin="${paging.beginPage}" end="${paging.endPage}" var="index">
			<c:choose>
				<c:when test="${paging.page==index}">
					<span style="color:red">${index}&nbsp;</span>
				</c:when>
				<c:otherwise>
					<a href="${action}&page=${index}">${index}</a>&nbsp;
				</c:otherwise>
			</c:choose>
		</c:forEach>
		
		<c:if test="${paging.next}">
			<a href="${action}&page=${paging.endPage+1}">▶</a>&nbsp;
		</c:if>
</div>
</body>
</html>







<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ezen.dto.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>081_useBeanActiongTag.jsp</title>
</head>
<body>
<%
MemberBean member1 = new MemberBean();
com.ezen.dto.MemberBean member2 = new com.ezen.dto.MemberBean();
%>
<!-- 액션 태그를 이용한 객체 생성-->
<jsp:useBean id="member" class="com.ezen.dto.MemberBean"/>
* 자바 빈 객체의 저장된 정보 출력하기<br>
이름: <%=member.getName() %><br>
아이디 : <%=member.getUserid() %><br><br>
* 정보 변경한 후 변경된 정보 출력하기<br>
<%
member.setName("홍길동");
member.setUserid("HongGilDong");
%>
이름 : <%=member.getName() %><br>
아이디 : <%=member.getUserid() %>
<Br><Br>

*액션태그로 정보 변경한 후 변경된 정보 출력하기<br>
<jsp:setProperty name="member" property="name" value="홍길서"/>
<jsp:setProperty name="member" property="userid" value="HongGilSEo"/>
이름 : <jsp:getProperty name="member" property="name"/><br>
아이디 : <jsp:getProperty name="member" property="userid"/>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("loginUser")==null){
	response.sendRedirect("071_LoginForm.jsp");
}else{
%>
		아이디 : <%=session.getAttribute("loginUser") %><br>
		성명 : 홍길동
		주소:
		전화번호 :
		<input type="button" value="정보수정"/>
<%
}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSP는 JAVA에서 사용하던 거의 모든 문법이 똑같이 사용됩니다 -->
<%
	int sum = 0;
	for(int i=1; i<=100 ; i++){
		sum+=i;
	}
%><h1><%=sum %></h1>

<% 
	sum=0;
	for(int i=1; i<=100 ; i++){
		sum+=i;
%>
<h2><%=sum %></h2>
<%
	}
%>
<!-- JSP 명령 사이에 HTML같은 요소가 끼어들어야 한다면 JSP 영역을 끝내고 해당내용을
		기술한 후 다시 JSP영역을 시작시킵니다 -->
</body>
</html>
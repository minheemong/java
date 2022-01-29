<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_Declare.jsp</title>
<%-- jsp 는 실행영역과 선언부영역으로 구분 됩니다.  보통 실행영역은 body 안에서 <% %>로
표시된 곳에 기술되지만, 선언부는 head 부분에서 <%!  %> 로 표시된곳에 기술됩니다 --%>
<%!  // 선언부의 시작 : 선언부 영역은 변수 , 메서드등이 정의됩니다
	// 변수의 선언
	String str = "안녕하세요!!";
	int a = 5, b = -5;
	
	// 메서드의 정의
	public int abs( int n ) {
		if (n < 0) 	n = -n;  // n = -1 * n
		return n;
	}  //jsp 의 메서드는 static 으로 선언하지 않아도 사용이 가능합니다.
%>
</head>
<body>
<%  // jsp 실행부의 시작
int c=10;
c++;
a++;
out.print(str + "<br>");
out.print(a + "의 절대값 : " + abs(a) + "<br>");
out.print(c + "의 절대값 : " + abs(c) + "<br>");
%>
<br><br>
<%=str%><br>
<%=a%>의 절대값 :	<%=abs(a)%><br>
<%=c%>의 절대값 :	<%=abs(c)%><br>
</body>
</html>
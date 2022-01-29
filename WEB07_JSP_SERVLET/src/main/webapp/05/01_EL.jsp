<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_EL.jsp  JSTL</title>
</head>
<body>
<!--표현 언어(EL, Expression Language : JSP 의 전달값이나 변수값 등 자료를 출력할때 의 번거로움을
간단히 해결하기 위해 만들어진 출력 문법,   jsp의 문법을 html5 에서 좀더 구분하기 쉽고, 
오류를 줄여서 운용하기 위해 개발된 언어.  주로 pageContext, request, session, application 에 전달되는
Attribute 의 값을  getter 를 이용하지 않고 출력할때 많이 사용합니다 -->

JSP 문법 사용 1 : <%="Hello"%><br>
JSP 문법 사용 2 : <% out.println("Hello"); %><br>
EL 문법 사용 : ${"Hello"}<br>

<br><br>
정수형 : ${10} <br>
실수형 : ${5.6} <br>
문자열형: ${"홍길동"} <br>
논리형: ${true} <br>
null : ${null} <br>

<br><br>

<!-- 산술 연산 -->
10과 2의 합 : ${ 10 + 2 }<br>
<!-- \${ 10 - 2 } 는 모양 그데로 출력, ${ 10 - 2 }는 계산된 결과 출력 -->
\${ 10 - 2 } : ${ 10 - 2 }<br>
\${ 10 * 2 } = ${ 10 * 2 }<br>
\${ 10 / 2 } = ${ 10 / 2 }<br>
\${ 10 % 3 } = ${ 10 % 3 }<br>
\${ 10 mod 3 } = ${ 10 mod 3 }<br>

<br><br>
<!-- 관계연산(비교연산) -->
\${ 10 == 2 } = ${ 10 == 2 }<br>
\${ 10 eq 2 } = ${ 10 eq 2 }<br>
\${ 10 < 2 } = ${ 10 < 2 }<br>
\${ 10 lt 2 } = ${ 10 lt 2 }<br>
\${ 5 >= 4 } = ${ 5 >= 4 }<br>
\${ empty("") } = ${ empty("") }<br>
<br><br>

<!-- 서로 다른 자료형간의 연산 -->
\${ "2" + 5 } = ${ "2" + 5 }<br>
\${ "2" * 5 } = ${ "2" * 5 }<br>
\${ null + 1 } = ${ null + 1 }<br>  
<br><br>


<!-- 문자열 연결(이어붙이기) 에러 -->
 <%--  
\${ "이젠 " + "아이티 아카데미" } = ${ "이젠 " + "아이티 아카데미" }<br>
\${ "일" + 5 } = ${ "일" + 5 }<br>   --%>


<%-- 문자열 연결(EL 3.0 추가) --%>
 \${ "문자" += "열 " += "연결" } = ${ "문자" += "열 " += "연결" }<br>
<br><br>



<!--  서버 객체의 내용을  getAttribute  메서드 없이 사용 -->
<%
request.setAttribute("name", "홍길동");
pageContext.setAttribute("name", "홍길서");
session.setAttribute("name", "홍길남");
application.setAttribute("name", "홍길북");
%>

JSP 문법 :  <%= request.getAttribute("name") %><br>
EL  문법 : ${name} <br>
EL  문법 : ${requestScope.name} <br>

</body>
</html>

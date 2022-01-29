<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>101_Forward_UseServlet.jsp</title>
</head>
<body>
<form method="post" action="../Forward_useServlet">
	<label for="userid">아이디 : </label>
	<input type="text" name="id" id="userid"><br>
	<label for="userpwd"> 암 &nbsp; 호 : </label>
	<input type="password" name="pwd" id="userpwd"><br>
	<input type="submit" value="로그인">
</form>
<!-- 서블릿을 사용한다는 의미는 앞선 예제(081~083, 071~073)의
XXX_do.jsp 파일의 역할을 서버 내부에 감춰 공개되지 않을 웹클래스에 일임하는 것과 같습니다 -->

<!-- 프로그래밍 명령등의 로직과 알고리즘이 공개되는 것이 부담스럽거나, 자료이동을 감추고 싶다면
위와 같은 서블릿에 그 동작을 일임하듯 이름불러 사용합니다 
Forward_useSurvlet: 서블릿의 이름-->

<!-- 사용할 서블릿의 위치는 파일들이 저장되는 최상단 위치이기 때문에 현재 페이지에서의 상대 위치는
(../)로 연결하여 지정합니다 -->


</body>
</html>
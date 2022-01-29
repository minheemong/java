<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>09_JSTL_Import.jsp</title>
</head>
<body>
<h1>JSTL import</h1>
<!-- jsp 의 include  와 같은 역할을 하는 명령 : 다른 점은  include  된 내용을 변수에 저장하여 사용할수 있다는것이 다릅니다 -->
<c:import url="http://localhost:8090/WEB07_JSP_SERVLET/05/02_Scope.jsp" var="data1"></c:import>
${data1}
<hr>

<c:url value="../images/Koala.jpg" var="data2"></c:url>
<h3>${data2}</h3>
<img src="${data2}" width='150' height='150' >

</body>
</html>
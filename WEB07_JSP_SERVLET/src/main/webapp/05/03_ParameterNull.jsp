<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_ParameterNull.jsp</title>
</head>
<body>

자바 코드 : <%=request.getParameter("id") %> <br>
EL 식 : ${param.id}
<br><br>


자바 코드 
<br>
<%-- <%=request.getParameter("id").equals("hong")%> --%>
equals() 사용 결과 : error - equals 메서드는 "null 값"으로 비교할때 오류를 발생시킴
<br><br>
에러를 방지하기 위해 '==' 연산자를 사용 : request.getParameter("id")=="hong" =>
<%=request.getParameter("id") == "hong" %>
<br><br>


<hr>
EL 식 
'==' 연산자 사용 결과 : \${param.id=="hong"} -> ${param.id=="hong"}
<br><br><br>


equals() 를 사용할때의 null 값 비교 오류해결 방법:
<pre>  
<!-- <pre> 태그 : 입력 한 그데로를 화면에 보여주라는 태그 : 주로 코딩 내역을 화면에 표시할때 사용
주로 코딩내용을 웹페이지에 표시할 때 사용합니다-->

if( request.getParameter("id") != null ){
	if( request.getParameter("id").equals("hong") ){ 	}
}else{
	out.print("id가 없습니다");
}
</pre>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idcheck.jsp</title>
<script type="text/javascript">
	function idok(userid){
		opener.frm.userid.value = userid;
		opener.frm.reid.value = userid;

		self.close();
	}
</script>
</head>
<body>
<body>
<form action="member.do" name="frm">
<input type="hidden" name="command" value="idcheck">
	아이디 : <input type="text" name="userid" value="${userid}">
	<input type="submit" value="중복체크">
</form><br><br><br>

<c:if test="${result==1}">
		${userid}는 이미 사용중인 아이디입니다.
		<script type="text/javascript">
			opener.document.frm.userid.value=""; 
		</script>
</c:if>
<c:if test="${result==-1}">
		${userid}는 사용가능한 아이디입니다.
		<input type="button" value="사용" onClick="idok('${userid}')">
</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm.jsp</title>
<script type="text/javascript">
	function loginCheck(){
		if( document.frm.userid.value==""){
			alert("아이디를 입력하세요");
			document.frm.userid.focus();
			return false;
		}
		if( document.frm.pwd.value==""){
			alert("비밀번호를 입력하세요");
			document.frm.pwd.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<form action="login.do" method="post" name="frm"> <!-- 포워딩된 페이지에서 가기 때문에 ..//안붙임 -->
<table>
	<tr><td>아이디</td><td><input type="text" name="userid"></td></tr>
	<tr><td> 암 호 </td><td><input type="password" name="pwd"></td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="로그인" onClick="return loginCheck()">
		<input type="reset" value="취소">
		<input type="button" value="회원가입" onClick="location.href='join.do'"></td></tr>
		<!--  loginCheck() 함수가 리턴해주는 true/false에 따라 form이 action에 설정된 페이지로 
		이동할지 멈출지가 결정됩니다. false가 리턴되면 action으로 이동이 멈춤
		true가 리턴되면 이동은 계속 진행 -->
		<tr><td colspan="2">${message}</td></tr>
</table>
</form>
</body>
</html>
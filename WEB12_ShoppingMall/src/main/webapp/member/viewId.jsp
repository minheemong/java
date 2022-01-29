<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{background:#FDE8FF;}
</style>
<script type="text/javascript">
function move_login(){
	opener.location.href='shop.do?command=loginForm';
	self.close();
}
</script>
</head>
<body>
<center><h2>Id 찾기</h2></center>
<table align="center" bgcolor="black" cellspacing="1" width="400">
	<tr align="center" bgcolor="#FDE8FF">
		<td width="430"><h3>성명 : ${member.name}</h3></td>
	</tr>
	<tr align="center" bgcolor="#FDE8FF">
		<td width="430"><h3>전화번호 : ${member.phone}</h3></td>
	</tr>
	<tr align="center" bgcolor="#FDE8FF">
		<td width="430"><h3>조회한 회원의 아이디는 ${member.id}입니다</h3>
		<input type="button" value="로그인 창으로" onclick="move_login();">
		<input type="button" value="비밀번호 찾기"
		onClick="location.href='shop.do?command=findPwForm&id=${member.id}'"></td>
	</tr>
</table>
</form>
</body>
</html>
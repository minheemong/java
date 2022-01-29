<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm.jsp</title>
<script type="text/javascript">
	function idCheck(){
		if(document.frm.userid.value.length==0){
			alert("아이디를 입력해주세요");
			document.frm.userid.focus();
			return;
		}
		var inputid = document.frm.userid.value;
		var opt = "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=200";
		window.open("idcheck.do?userid=" + inputid, "idcheck", opt);
		// 팝업창 오픈 메뉴의 idcheck.do는 서블릿이며, 서블릿에서 아이디 중복체크 작업을 한 후, 결과를 싣고 포워딩되는
		// 페이지에 팝업창을 표시할 예정입니다
		// 서블릿 호출 시 파라미터를 위와 같이 호출되는 주소에 ?와 함께 전달 할 수 있습니다.
				
		// 두번째 인수 : 팝업창의 타이틀(이름)
		// 세번째 인수 : 팝업창의 크기 위치 등 옵션
	}
	
	function joinCheck(){
		if(document.frm.name.value.length==0){
			alert("이름은 필수입력사항입니다");
			document.frm.name.focus();
			return false;
		}if(document.frm.userid.value.length==0){
			alert("아이디는 필수입력사항입니다");
			document.frm.userid.focus();
			return false;
		}if(document.frm.userid.value!=document.frm.reid.value){
			alert("아이디 중복체크를 하지 않으셨습니다");
			document.frm.userid.focus();
			return false;
		}if(document.frm.pwd.value.length==0){
			alert("비밀번호는 필수입력사항입니다");
			document.frm.pwd.focus();
			return false;
		}if(document.frm.pwd.value!=document.frm.pwd_check.value){
			alert("비밀번호확인이 일치하지 않습니다");
			document.frm.pwd_check.focus();
			return false;
		}
	}
</script>
</head>
<body>
<h2>회원가입</h2>
'*' 표시 항목은 필수 입력 항목입니다
<form action="join.do" method="post" name=frm>
	<table>
		<tr><td>이름</td><td><input type="text" name="name" size="20">&nbsp;*</td></tr>
		<tr><td>아이디</td>
			<td><input type="text" name="userid" size="20">&nbsp;*
				<input type="button" value="중복 체크" onClick="idCheck();"/>
				<input type="hidden" name="reid" value=""></td></tr>
		<tr><td>비밀번호</td><td><input type="password" name="pwd" size="20">&nbsp;*</td></tr>
		<tr><td>비밀번호 확인</td><td><input type="password" name="pwd_check" size="20">&nbsp;*
			</td></tr>
		<tr><td>이메일<input type="text" name="email" size="20"></td></tr>
		<tr><td>전화번호<input type="text" name="phone" size="20"></td></tr>
		<tr><td>등급<input type="radio" name="admin" value="0" checked="checked">
			일반회원&nbsp;<input type="radio" name="admin" value="1">관리자</td></tr>
		<tr><td colspan="2" align="center">
			<input type="submit" value="회원가입" onClick="return joinCheck()"/>
			<input type="reset" value="취소">
		</td></tr>
	</table>
</form>
</body>
</html>
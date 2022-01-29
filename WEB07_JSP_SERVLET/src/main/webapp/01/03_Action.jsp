<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 하나의 작업단위(회원가입, 로그인, 게시물 등록 등)를 구성하기 위해 사용되는 입력란, 
선택란들은 작업단위별로 아래와 같이 form 태그안에 넣어서 사용합니다. -->
<form name="reg_frm" action="03_Action_to.jsp" method="post">
<!-- name : 스크립트에서 다른것들과 구분하여 명명하기 위한 이름으로 사용
action : 입력란 선택란에 입력하고 선택한 내용이 전달될 대상 파일
method : 전달 방식을 의미하며, get 은 일반전송방식, post 는 비공개 전달 방식 사용 -->
	<label for="name"> 이름 </label><span style="color:red;">*</span> 
	<input type="text" id="name" name="name" value=""> <br>
	<label for="id"> 아이디  </label><span style="color:red;">*</span>
	<input type="text" id="id" name="id" value=""><br>
	<label for="pwd"> 비밀번호 </label><span style="color:red;">*</span> 
	<input type="password" id="pwd" name="pwd" value=""><br>
	<label for="pwd_re"> 비밀번호 확인  </label><span style="color:red;"> * </span>
	<input type="password" id="pwd_re" name="pwd_re" value=""><br>
	<input type="submit" value="회원가입">
</form>


<a href="03_Action_to.jsp?useritem=superCar">유저아이템만 보내기</a>


</body>
</html>
function loginCheck(){
	if(document.loginFrm.id.value==""){
		alert("아이디를 입력하세요");
		document.loginFrm.id.focus();
		return false;
	}
	if(document.loginFrm.pwd.value==""){
		alert("비밀번호를 입력하세요");
		document.loginFrm.pws.focus();
		return false;
	}return true;
}

function go_next(){
	// 자바스크립트에서 jsp 페이지 내의 radio 버튼을 바라볼 때, 같은 name의 radio가 여러개라면
	// name 값에 의한 배열로 인식되어 사용합니다
	// 동의함 버튼 : okon[0], 동의안함 버튼 : okon[1]
	if(document.contractFrm.okon[1].checked==true){
		alert("약관에 동의하셔야 회원가입이 가능합니다.");	
	}else{
		// 스크립트 명령으로 폼의 액션 설정하고 submit 실행
		document.contractFrm.action="shop.do?command=joinForm";
		document.contractFrm.submit();
	}
}

function idcheck(){
	if(document.joinForm.id.value==""){
		alert("아이디를 입력하세요");
		document.joinForm.id.focus();
		return;
	}
	var url = "shop.do?command=idCheckForm&id="+document.joinForm.id.value;
	var opt = "toolbar=no, menubar=no, resizable=no, width=500, height=250";
	window.open(url,"IdCheck",opt)
}

function idok(userid){
	opener.joinForm.id.value=userid;
	opener.joinForm.reid.value=userid;
	self.close();
}

function post_zip(){
	var url = "shop.do?command=findZipNum";
	var opt ="toolbar=no, menubar=no, scrollbars=no, resizable=no, width=500";
	opt = opt + "height=300, top=300, left=300";
	window.open(url,"우편번호 찾기",opt);
}

function go_save(){
	if(document.joinForm.id.value==""){
		alert("아이디를 입력해주세요");
		document.joinForm.id.focus();
	}
	if(document.joinForm.reid.value!=document.joinForm.id.value){
		alert("아이디 중복확인을 하지 않았습니다");
		document.joinForm.id.focus();
	}
	if(document.joinForm.pwd.value==""){
		alert("비밀번호를 입력해주세요");
		document.joinForm.pwd.focus();
	}
	if(document.joinForm.pwd.value!=document.joinForm.pwdCheck.value){
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다");
		document.joinForm.pwd.focus();
	}
	if(document.joinForm.name.value==""){
		alert("이름을 입력해주세요");
		document.joinForm.name.focus();
	}
	if(document.joinForm.email.value==""){
		alert("이메일을 입력해주세요");
		document.joinForm.email.focus();
	} else{
		document.joinForm.action = "shop.do";
		document.joinForm.submit();
	}
}

function go_update(){
	if(document.joinForm.pwd.value==""){
		alert("비밀번호를 입력해주세요");
		document.joinForm.pwd.focus();
	}
	if(document.joinForm.pwd.value!=document.joinForm.pwdCheck.value){
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다");
		document.joinForm.pwd.focus();
	}
	if(document.joinForm.name.value==""){
		alert("이름을 입력해주세요");
		document.joinForm.name.focus();
	}
	if(document.joinForm.email.value==""){
		alert("이메일을 입력해주세요");
		document.joinForm.email.focus();
	} else{
		document.joinForm.action = "shop.do";
		document.joinForm.submit();
	}
}

function find_id(){
	var url = "shop.do?command=findIdPwd";
	var opt = "toolbar=no, menubar=no, scrollbars=no, resizable=no, width=700";
	opt = opt + "height=500, top=300, left=300";
	window.open(url,"Find Id/Pw",opt);
}
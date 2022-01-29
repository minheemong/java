<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_img.html" %>
<%@ include file="sub_menu.jsp" %>
<article>
<h2>1:1 고객 게시판</h2>
<h3> 고객님의 질문에 대해서 운영자가 1:1 답변을 드립니다.</h3>
<form name="formm" method="post" action="shop.do">
	<input type="hidden" name="command" value="qnaWrite">
	<fieldset>
		<legend>Board Info</legend>
		<label>Title</label><input type="text" name="subject" size="60">
		<label>Content</label><textarea rows="8" cols="65" name="content"></textarea>
	</fieldset>
	<div class="clear"></div>
	<div id="buttons" style="float:right">
		<input type="submit" value="글쓰기" class="submit">
		<input type="reset" value="취소" class="cancel">
		<input type="button" value="쇼핑 계속하기" class="submit"
			onclick="location.href='shop.do?command=index'">
	</div>
</form>
</article>
<!-- 1. QnaWriteFormAction을 제작하여, qnaWrite.jsp로 포워딩합니다
2. 게시글을 쓰고 글쓰기 버튼을 클릭하면 QnaWriteAction으로 이동하여
화면에 사용자가 쓴 내용을 레코드 추가하빈다. - 별도 QnaDao 내부 메서드 제작
3. 게시글 등록을 마치고 qnaList.jsp로 이동합니다. -->
<%@ include file="../footer.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_Calendar.jsp</title>
<style type="text/css">
	td{font-weight:bold;}
	tr>td:first-child{color:red;}
	tr>td:last-child{color:blue;}
</style>
</head>
<body>
<%
Calendar sDay = Calendar.getInstance();
Calendar eDay = Calendar.getInstance();

int sYear = sDay.get(Calendar.YEAR);   // 오늘날짜의 연도
int sMonth = sDay.get(Calendar.MONTH);  // 오늘 날짜의 월

// 현재 날짜에 해당하는 월의 1일로 sDay 를 설정합니다.
sDay.set( sYear, sMonth, 1);  // 20201-10-01
// eDay 는 현재 날짜의 다음달 1일로 세팅후   1일을 빼서 이번달 마지막날로 세팅
eDay.set(sYear, sMonth+1 , 1); // 다음달 1일
eDay.add( Calendar.DATE, -1);  // 이번달 말일

//출력하려는 월의 1일자가 무슨 요일인지 정수값으로 계산    1:일요일, 2:월요일...
int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
int i, k, cnt=0;  //i는 반복실행에 사용,   k는 날짜 출력에 사용, cnt는 줄바꿈에 사용
%>
<h1><%=sYear %>년 <%=sMonth+1 %>월</h1>
<table width="560" align="left" cellspacing="1" bgcolor="black">
	<tr bgcolor="white" height="50">
		<td align="center" width="80">일</td>
		<td align="center" width="80">월</td>
		<td align="center" width="80">화</td>
		<td align="center" width="80">수</td>
		<td align="center" width="80">목</td>
		<td align="center" width="80">금</td>
		<td align="center" width="80">토</td>
	</tr>
	<!-- 첫줄에 나올 날짜들   1일자 요일 전까지 공백, 1, 2, 3.... -->
	<tr bgcolor="white" height="50">
			<% for(i=1; i<START_WEEK; i++){ %>
						<td>&nbsp;</td><!-- 첫칸부터 시작날짜의 요일 바로 전열까지 빈칸 표시 -->
			<%} %>
			<% for(i=1; i<=8-START_WEEK; i++){ %>
					<td align="right"><%=i%>&nbsp;</td>   <!-- 1일자부터 토요일까지 날짜 표시 -->
			<%} %>
	</tr>
	<tr  bgcolor="white" height="60">
			<%for(k=i; k<=eDay.get(Calendar.DATE); k++) {%>
					<td align="right"><%=k%>&nbsp;</td> <!-- 날짜출력 -->
					<!-- 일요일부터 날짜가 출력되고 있기때문에 1부터 시작한  cnt 변수로 카운트해서 줄바꿈을 실행합니다 -->
					<%cnt++;
						  if(cnt%7 == 0){ %>
								</tr><tr  bgcolor="white" height="60"> <!-- tr 태그 끝내고 다시 시작 = 줄바꿈 -->
					<%}%>
			<%}%>
			<%for(i=1; i<= 7 - (cnt%7); i++){%>
					<td>&nbsp;</td>
			<%}%>
	</tr>
</table>


</body>
</html>






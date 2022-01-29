<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>112_JSPServlet_Ex02.jsp</title>
</head>
<body>
<%=request.getAttribute("name") %>님 안녕하세요.<br>
성별 : 
<%if(request.getParameter("gender").equals("1")){out.print("남자");}else{out.print("여자");}%>
<br>
수신여부 : 
<%if(request.getParameter("chk_mail").equals("0")){out.print("거부");}else{out.print("수신");}%>
<br>
가입인사 : <%=request.getParameter("content")%><br>
구입항목 :<%String items[] = request.getParameterValues("item");%>
<%if(items==null) out.print("없음"); 
else{
	for(String it : items){%>
		<%switch(it){
		case "1" : out.print("신발"); break;
		case "2" : out.print("가방"); break;
		case "3" : out.print("벨트"); break;
		case "4" : out.print("모자"); break;
		case "5" : out.print("시계"); break;
		case "6" : out.print("쥬얼리"); break;
		}
		
		%>&nbsp;<%}
}%>
<br>
직업 : <%=request.getParameter("job") %><br>
관심분야 : <% String interests[] = request.getParameterValues("interest"); %>
<%if(interests==null) out.print("없음");
else{
	for(String in:interests){%><%=in%>&nbsp;<%}
}
%>
</body>
</html>
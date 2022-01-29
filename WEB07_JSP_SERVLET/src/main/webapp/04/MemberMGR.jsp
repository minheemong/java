<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.DriverManager"%>
    <%@page import="java.sql.ResultSet"%>
    <%@page import="java.sql.PreparedStatement"%>
    <%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberMGR.jsp</title>
<%!
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pass = "tiger";
			
	String sql = "select*from mem";
%>
</head>
<body>
<table width="800" border="1">
	<tr><th>이름</th><th>아이디</th><th>암호</th><th>전화번호</th><th>삭제</th></tr>
	<% 
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pass);
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				out.println("<tr align='center'>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td><a href='editMemberForm.jsp?userid="+ rs.getString("id") + "'>" 
					+ rs.getString("id") + "</a></td>");
				out.println("<td>" + rs.getString("pwd") + "</td>");
				out.println("<td>" + rs.getString("phone") + "</td>");
				out.println("<td><a href='deleteMember.jsp?userid="
				+rs.getString("id")+"'>" + "삭제" + "</a></td>");
				out.println("</tr>");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(rs!=null) rs.close();
			if(con!=null) con.close();
			if(pstmt!=null) pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	%>
	
</table> 
<a href="addMemberFrom.jsp">멤버 추가</a>
</body>
</html>
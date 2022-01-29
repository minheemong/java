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
<title>editMemberForm.jsp</title>
<%!
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "select*from mem where id=?";
%>
</head>
<body>
<%
String id = request.getParameter("userid");
String name=null, phone=null;

try{
	Class.forName(driver);
	con = DriverManager.getConnection(url,"scott","tiger");
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1,id);
	rs = pstmt.executeQuery();
	if(rs.next()){
		name=rs.getString("name");
		phone=rs.getString("phone");
	}
}catch( Exception e){
	e.printStackTrace();
}finally{
	try{
		if(con!=null) con.close();
		if(pstmt!=null) pstmt.close();
	}catch(Exception e){ e.printStackTrace();
	}
}
%>
<h2>회원정보 수정 폼</h2>
<form method="get" action="editMember_do.jsp">
	<table>
		<tr><td>이름</td><td><input type="text" name="name" value="<%=name%>"></td></tr>
		<tr><td>아이디</td><td><input type="text" name="userid" value="<%=id%>"></td></tr>
		<tr><td>비밀번호</td><td><input type="text" name="pwd" value=""></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="phone" size="20" value="<%=phone%>"></td></tr>
		<tr><td><input type="submit" value="정보수정"></td>
			<td><input type="reset" value="취소"></td></tr>
	</table>

</form>
</body>
</html>
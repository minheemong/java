<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


<%
	Connection con = null;
	PreparedStatement pstmt = null;
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pass = "tiger";
			
	String sql = "delete from mem where id=?";

	String id = request.getParameter("userid");
	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url,uid,pass);
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1,id);
		pstmt.executeUpdate();
	}catch( Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(con!=null) con.close();
			if(pstmt!=null) pstmt.close();
		}catch(Exception e){ e.printStackTrace();
		}
	}
	response.sendRedirect("MemberMGR.jsp");
%>
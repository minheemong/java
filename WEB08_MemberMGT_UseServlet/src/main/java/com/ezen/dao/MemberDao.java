package com.ezen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ezen.dto.MemberDto;

public class MemberDao {
	// 싱글턴 설정
	private MemberDao() {}
	private static MemberDao ist = new MemberDao();
	public static MemberDao getInstance() {return ist;}

	// 연결객체 준비
	Connection con = null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";

	// 연결, 차단 함수 생성
	
	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (ClassNotFoundException e) {  	e.printStackTrace();
		} catch (SQLException e) {	e.printStackTrace();	}
		return con;
	}
	public void close() {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {	e.printStackTrace();	}
	}
	public MemberDto getMember(String id) {
		MemberDto mdto = null;
		
		con = getConnection();
		String sql = "select*from member where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mdto = new MemberDto();
				mdto.setName(rs.getString("name"));
				mdto.setUserid(rs.getString("userid"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setEmail(rs.getString("email"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setAdmin(rs.getInt("admin"));
			}
		} catch (SQLException e) {e.printStackTrace();
		}
		close();
		return mdto;
	}
	public int confirmID(String userid) {
		int result = 0;
		con = getConnection();
		String sql = "select*from member where userid=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs = pstmt.executeQuery(); 
			
			if(rs.next()) result =1; // 사용중
			else result =-1; // 사용가능
		} catch (SQLException e) {e.printStackTrace();
		}
		close();
		return result;
	}
	public int insertMember(MemberDto mdto) {
		int result = 0;
		con = getConnection();
		String sql = "insert into member values(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getUserid());
			pstmt.setString(3, mdto.getPwd());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getPhone());
			pstmt.setInt(6, mdto.getAdmin());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} close();
		return result;
	}
	public ArrayList<MemberDto> selectMember() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		con = getConnection();
		String sql = "select * from member";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDto mdto = new MemberDto();
				mdto.setName( rs.getString("name") );
				mdto.setUserid( rs.getString("userid") );
				mdto.setPwd( rs.getString("pwd") );
				mdto.setEmail( rs.getString("email") );
				mdto.setPhone( rs.getString("phone") );
				mdto.setAdmin( rs.getInt("admin"));
				
				list.add(mdto);
			}
		} catch (Exception e) { e.printStackTrace();
		}close();	
		
		return list;
	}
	public int updateMember(MemberDto mdto) {
		con = getConnection();
		int result=0;
		String sql = "update member set name=?,pwd=?,email=?,phone=?,admin=? "
				+ "where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(6, mdto.getUserid());
			pstmt.setString(2, mdto.getPwd());
			pstmt.setString(3, mdto.getEmail());
			pstmt.setString(4, mdto.getPhone());
			pstmt.setInt(5, mdto.getAdmin());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} close();
		return result;
	}
	public void editAdmin(String userid) {
		con = getConnection();
		String sql = "select*from member where userid=?";
		int admin=0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs = pstmt.executeQuery();
			if(rs.next()) admin = rs.getInt("admin");
			pstmt.close();
			
			sql = "update member set admin=? where userid=?";
			pstmt = con.prepareStatement(sql);
			if(admin==1) pstmt.setInt(1,0);
			else pstmt.setInt(1,1);
			pstmt.setString(2,userid);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}close();
	}
}

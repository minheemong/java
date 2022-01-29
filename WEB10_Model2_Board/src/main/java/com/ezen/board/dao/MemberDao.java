package com.ezen.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ezen.board.dto.MemberDto;
import com.ezen.board.util.DBman;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao ist = new MemberDao();
	public static MemberDao getInstance() { return ist; }
	
	Connection con=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public MemberDto getMember(String userid) {
		MemberDto mdto = null;
		con = DBman.getConnection();
		String sql = "select * from member where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				mdto = new MemberDto();
				mdto.setName( rs.getString("name") );
				mdto.setUserid( rs.getString("userid") );
				mdto.setPwd( rs.getString("pwd") );
				mdto.setEmail( rs.getString("email") );
				mdto.setPhone( rs.getString("phone") );
				mdto.setAdmin( rs.getInt("admin") );
			}
		} catch (SQLException e) {   e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs);  }
		return mdto;
	}

	public int insertMember(MemberDto mdto) {
		int result=0;
		con = DBman.getConnection();
		String sql="insert into member values(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,mdto.getName());
			pstmt.setString(2,mdto.getUserid());
			pstmt.setString(3,mdto.getPwd());
			pstmt.setString(4,mdto.getEmail());
			pstmt.setString(5,mdto.getPhone());
			pstmt.setInt(6,mdto.getAdmin());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally{DBman.close(con, pstmt, rs);}
		return result;
	}

	public int confirmID(String userid) {
		int result=0;
		con = DBman.getConnection();
		String sql = "select*from member where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) result = 1; // 사용중
			else result = -1;
		} catch (SQLException e) {e.printStackTrace();
		}DBman.close(con, pstmt, rs);
		return result;
	}

	public int editMember(MemberDto mdto) {
		con = DBman.getConnection();
		int result=0;
		String sql = "update member set name=?,pwd=?,email=?,phone=?,admin=? "
				+ "where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPwd());
			pstmt.setString(3, mdto.getEmail());
			pstmt.setString(4, mdto.getPhone());
			pstmt.setInt(5, mdto.getAdmin());
			pstmt.setString(6, mdto.getUserid());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}DBman.close(con, pstmt, rs);
		return result;
	}
}

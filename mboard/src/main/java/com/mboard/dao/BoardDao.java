package com.mboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mboard.dto.BoardDto;
import com.mboard.util.DBman;
import com.mboard.util.Paging;

public class BoardDao {
	private BoardDao() {}
	private static BoardDao ist = new BoardDao();
	public static BoardDao getInstance() { return ist; }
	
	Connection con=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public int getAllCount() {
		int count = 0;
		
		String sql = "select count(*) as cnt from board";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if( rs.next() ) count = rs.getInt("cnt");
			
		} catch (SQLException e) { e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs); }
		return count;
	}
	public ArrayList<BoardDto> selectBoard(Paging paging) {
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		con = DBman.getConnection();
		String sql = "select * from "
			    		+ " ( select * from "
			    		+ " ( select rownum as rn, t.*  from"
			    		+ " ( select * from mboard order by num desc ) t  "
			    		+ " ) where rn >= ? "
			    		+ " ) where rn <= ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  paging.getStartNum() );
			pstmt.setInt(2,  paging.getEndNum() );
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDto bdto = new BoardDto();
				bdto.setNum( rs.getInt("num") );
				bdto.setName( rs.getString("name" ) );
				bdto.setPass( rs.getString("pass") );
				bdto.setEmail( rs.getString("email") );
				bdto.setTitle( rs.getString("title") );
				bdto.setContent( rs.getString("content") );
				bdto.setReadcount( rs.getInt("readcount") );
				bdto.setWritedate( rs.getTimestamp("writedate") );
				list.add(bdto);
			}
		} catch (SQLException e) {  e.printStackTrace();
		} finally {  DBman.close(con, pstmt, rs);		}
		return list;
	}
}

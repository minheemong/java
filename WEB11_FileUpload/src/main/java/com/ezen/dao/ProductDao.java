package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ezen.dto.ProductVO;
import com.ezen.util.Dbman;

public class ProductDao {
	private ProductDao() {}
	private static ProductDao instance = new ProductDao();
	public static ProductDao getInstance() {return instance;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<ProductVO> selectAll() {
ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		
		String sql = "select * from bookproduct order by code desc";
		
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setCode(rs.getInt("code"));
				pvo.setName(rs.getString("name"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setPictureurl(rs.getString("pictureurl"));
				pvo.setDescription(rs.getString("description"));
				list.add(pvo);
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		} return list;
	}

	public void deleteProduct(String code) {
		con = Dbman.getConnection();
		String sql = "delete from bookproduct where code=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(code));
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		}
	}

	public ProductVO getProduct(String code) {
		ProductVO pvo = new ProductVO();
		String sql ="select*from bookproduct where code=?";
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pvo.setCode(rs.getInt("code"));
				pvo.setName(rs.getString("name"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setPictureurl(rs.getString("pictureurl"));
				pvo.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		}return pvo;
	}

	public void updateProduct(ProductVO pvo) {
		String sql = "update bookproduct set name=?, price=?, pictureurl=?, description=? where code=?";
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pvo.getName());
			pstmt.setInt(2, pvo.getPrice());
			pstmt.setString(3, pvo.getPictureurl());
			pstmt.setString(4, pvo.getDescription());
			pstmt.setInt(5, pvo.getCode());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}finally {Dbman.close(con, pstmt, rs);
		}
	}

	public void insertProduct(ProductVO pvo) {
		String sql = "insert into bookproduct values(product_seq.nextval,?,?,?,?)";
		con = Dbman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pvo.getName());
			pstmt.setInt(2, pvo.getPrice());
			pstmt.setString(3, pvo.getPictureurl());
			pstmt.setString(4, pvo.getDescription());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}finally {Dbman.close(con, pstmt, rs);
		}
	}
}

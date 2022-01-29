package prac_rent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Rent_Dao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private Rent_Dao() {}
	private static Rent_Dao itc = new Rent_Dao();
	public static Rent_Dao getInstance() {return itc;}
	public ArrayList<Rent_Dto> select() {
		con = DB.getConnection();
		String sql = "select to_char(rentdate,'yyyy-mm-dd') as rd, numseq, booknum,"
				+ "membernum, discount from rentlist";
		ArrayList<Rent_Dto> list = new ArrayList<Rent_Dto>();
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Rent_Dto rdto = new Rent_Dto();
				rdto.setRentdate(rs.getString("rd"));
				rdto.setNumseq(rs.getInt("numseq"));
				rdto.setBooknum(rs.getInt("booknum"));
				rdto.setMembernum(rs.getInt("membernum"));
				rdto.setDiscount(rs.getInt("discount"));
				list.add(rdto);
			};
		} catch (SQLException e) {e.printStackTrace();
		}DB.close(con, pstmt, rs);
		
		return list;
	}
}

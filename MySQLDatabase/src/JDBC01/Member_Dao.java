package JDBC01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Member_Dao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private Member_Dao() {}
	private static Member_Dao itc = new Member_Dao();
	public static Member_Dao getInstance() { return itc; }
	public ArrayList<Member_Dto> select() {
		con = DBManager.getConnection();
		ArrayList<Member_Dto> list = new ArrayList<Member_Dto>();
		String sql = "select membernum,name,phone,date_format(birth,'%Y%m%d') as bt,"
				+ "bpoint,age,gender,date_format(joindate, '%Y%m%d') as jd from memberlist"
				+ " order by membernum desc";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member_Dto mdto = new Member_Dto();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getString("bt"));
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setAge(rs.getInt("age"));
				mdto.setGender(rs.getString("gender"));
				mdto.setJoindate(rs.getString("jd"));
				
				list.add(mdto);
				}
		} catch (SQLException e) {e.printStackTrace();
		} DBManager.close(con, pstmt, rs);
		return list;
	}
	public int insert(Member_Dto mdto) {
		int result = 0;
		con = DBManager.getConnection();
		String sql = "insert into memberlist( name, phone, birth, "
				+ "age, gender) "
				+ "values( ? , ? ,str_to_date(concat('', ? ,'') ,'%Y%m%d') , ? , ? )";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  mdto.getName() );
			pstmt.setString(2,  mdto.getPhone() );
			pstmt.setString( 3, mdto.getBirth() );
			pstmt.setString( 5, mdto.getGender() );
			pstmt.setInt( 4, mdto.getAge() );
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}DBManager.close(con,pstmt,rs);
		return result;
		}
	public Member_Dto getMember(int membernum) {
		Member_Dto mdto = null;
		con = DBManager.getConnection();
		String sql = "select membernum,name,phone,date_format(birth,'%Y%m%d') as bt"
				+ ",bpoint,date_format(joindate,'%Y%m%d') as jd,gender,age"
				+ " from memberlist where membernum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  membernum );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				mdto = new Member_Dto();
				
				mdto.setMembernum( rs.getInt("membernum") );
				mdto.setName( rs.getString("name") );
				mdto.setPhone( rs.getString("phone") );
				mdto.setBirth( rs.getString("bt") );
				mdto.setBpoint( rs.getInt("bpoint") );
				mdto.setJoindate( rs.getString("jd") );
				mdto.setGender( rs.getString("gender") );
				mdto.setAge( rs.getInt("age") );
			}
		} catch (SQLException e) {e.printStackTrace();
		}
		DBManager.close(con,pstmt,rs);
		return mdto;
	}
	public int update(Member_Dto newDto) {
		int result = 0;
		con = DBManager.getConnection();
		String sql = "update memberlist set name=?, phone=?, "
				+ "birth=str_to_date(concat('',?,''),'%Y%m%d'),bpoint=?, "
				+ "joindate=str_to_date(concat('',?,''),'%Y%m%d') , gender=?, age=?  "
				+ "where membernum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  newDto.getName() );
			pstmt.setString(2,  newDto.getPhone() );
			pstmt.setString( 3, newDto.getBirth() );
			pstmt.setInt( 4, newDto.getBpoint() );
			pstmt.setString( 5, newDto.getJoindate() );
			pstmt.setString( 6, newDto.getGender() );
			pstmt.setInt( 7, newDto.getAge() );
			pstmt.setInt( 8, newDto.getMembernum() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}DBManager.close(con,pstmt,rs);
		return result;
	}
	public int delete(String num) {
		int result = 0; // 레코드 추가 성공 실패를 저장할 변수
		con = DBManager.getConnection();
		String sql = "delete from memberlist where membernum=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			result = pstmt.executeUpdate();
		}catch (SQLException e) {e.printStackTrace();
		} return result;
	}
	
}

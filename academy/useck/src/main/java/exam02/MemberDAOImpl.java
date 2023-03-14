package exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public void add(MemberVO data1) {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("insert into mymembers values(?, ?, ?, ?)");
			
			ps.setString(1, data1.getMemId());		ps.setString(2, data1.getMemPwd());
			
			ps.setString(3, data1.getMemName());		ps.setString(4, data1.getEmail());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.close(null, ps, con);
		}
		
		
		
	}

	@Override
	public void del(String memid) {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("delete from mymembers where memid = ?");
			
			ps.setString(1, memid);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.close(null, ps, con);
		}
	}
		
	@Override
	public void update(MemberVO data2) {
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("update from mymembers set memId = ?, memName = ?, email =? where memPwd= ?");
			
			ps.setString(1, data2.getMemId());			ps.setString(2, data2.getMemPwd());
													
			ps.setString(3, data2.getMemName());			ps.setString(4, data2.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.close(null, ps, con);
			
	


		}
	}


	@Override
	public MemberVO get(String memId) {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select * from mymembers where  memId=?");
			ps.setString(1, memId); 
			rs =ps.executeQuery();
			if( rs.next()) {
				return setResultVO( rs);
			}
		} catch (SQLException e) {		e.printStackTrace();
		}finally {		DBConnection.close(rs, ps, con);	}

		
		return null;
	}
	@Override
	public List<MemberVO> getAll() {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<MemberVO> list = new ArrayList<>();
		try {
			ps = con.prepareStatement("select * from mymembers");
			rs =ps.executeQuery();
			while( rs.next()) {
				list.add( setResultVO( rs));
			}
		} catch (SQLException e) {		e.printStackTrace();
		}finally {		DBConnection.close(rs, ps, con);	}
		return list;
	  }
	  private MemberVO setResultVO(ResultSet rs) throws SQLException {
		  return new MemberVO(
				  rs.getString("memId"), rs.getString("memPwd"),
				  rs.getString("memName"),rs.getString("email")
		  );		
	}
}
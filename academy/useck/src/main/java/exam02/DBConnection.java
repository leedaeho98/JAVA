package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
//		String url = "oracle.jdbc.driver.OracleDriver";
//		String userId = "leedaeho";
//		String pwd =  "leedaeho";
//		String addr = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "leedaeho", "leedaeho");
		} catch (SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
		if( rs != null) {try {rs.close();}catch (SQLException e) {}{
		if( ps != null) {try {ps.close();}catch (SQLException e) {}{
		if( con != null) {try {con.close();}catch (SQLException e) {}{
}
			
}
		}
		}
		}
		}
	}
}
	


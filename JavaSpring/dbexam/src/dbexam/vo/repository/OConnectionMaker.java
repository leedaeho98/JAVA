package dbexam.vo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OConnectionMaker implements ConnectionMaker {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","leedaeho","leedaeho");
	}

}

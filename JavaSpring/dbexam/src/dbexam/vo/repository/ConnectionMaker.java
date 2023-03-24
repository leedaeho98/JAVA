package dbexam.vo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionMaker {
	 Connection getConnection() throws SQLException, ClassNotFoundException;
}

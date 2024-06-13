package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDB {

	public static Connection conn() {
		try {
			String url = "jdbc:ucanaccess://Database-for-student-portal.accdb";
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

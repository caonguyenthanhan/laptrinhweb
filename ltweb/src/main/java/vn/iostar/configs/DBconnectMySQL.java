package vn.iostar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectMySQL {

	private static String USERNAME = "root";
	private static String PASSWORD = "root123456";
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/ltweb";

	public static Connection getConnection() throws SQLException, Exception {
		try {
			Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Test chương trình. Kích phải chuột chọn run as->java application
	public static void main(String[] args) {
		try {
			new DBconnectMySQL();
			System.out.println(DBconnectMySQL.getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

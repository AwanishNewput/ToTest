package com.webservice.WebConnectionApp.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public Connection getConnection() throws Exception {

		try {
			Connection conn = null;
			String connectionURL = "jdbc:mysql://localhost:3306/contactdb";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(connectionURL, "root", "root");
			System.out.println("DBConnection");

			return conn;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

}

package com.egide.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private final String url = "jdbc:mysql://localhost:3306/std_sms";
	private final String username = "egide";
	private final String password = "dbadmin_123";
	private Connection connection = null;
	
	public DbConnection() {}
	
	public void connect() {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    this.connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("EXCEPTION CREATING CONNECTION: "+ e.getMessage());
		} catch (SQLException e) {
			throw new IllegalStateException("EXCEPTION CREATING CONNECTION: "+ e.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() {
		if(this.connection!=null) {
			try {
				this.connection.close();
			} catch (SQLException e) {
				System.out.println("EXCEPTION CREATING CONNECTION: "+ e.getMessage());
			}
		}
	}
}

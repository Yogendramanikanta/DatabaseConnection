package com.DatabaseProject.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public interface DataBaseservice {
	
	default Statement JDBCConnection() {
	Statement stmt = null;
	try {
		Class.forName("com.postgresql.jdbc.driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
		stmt = connection.createStatement();
	} catch (Exception e) {
		e.getStackTrace();
		System.out.println(e.getMessage());
	}
	return stmt;
}
	public List<String> featchTheScemesList();

}

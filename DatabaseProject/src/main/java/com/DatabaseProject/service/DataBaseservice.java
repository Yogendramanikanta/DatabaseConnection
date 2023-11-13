package com.DatabaseProject.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import com.DatabaseProject.Entity.DatabaseConnectionProperties;

public interface DataBaseservice {

	default Statement JDBCConnection(DatabaseConnectionProperties propertices) {
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager
					.getConnection(
							"jdbc:postgresql://" + propertices.getHost() + ":" + propertices.getPort() + "/"
									+ propertices.getDatabaseName(),
							propertices.getUsername(), propertices.getPassword());
			stmt = connection.createStatement();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		return stmt;
	}

	public List<String> featchTheDatabaseNames();
	public List<String> featchTheScemesList();

}

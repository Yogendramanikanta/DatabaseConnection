package com.DatabaseProject.service.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.DatabaseProject.Entity.DatabaseConnectionProperties;
import com.DatabaseProject.service.DataBaseservice;

@Service
public class DataBaseServiceImpl implements DataBaseservice {

	Statement statement;
	public static DatabaseConnectionProperties propertices() {
		DatabaseConnectionProperties propertices = new DatabaseConnectionProperties();
		propertices.setDatabaseName("postgres");
		propertices.setHost("localhost");
		propertices.setPassword("root");
		propertices.setPort("5432");
		propertices.setUsername("postgres");
		return propertices;
	}

	@Override
	public List<String> featchTheDatabaseNames() {
		List<String> listOfSchemas = new ArrayList<String>();
		try {
			Statement statement = JDBCConnection(propertices());
			String query = " SELECT datname FROM pg_database where datname not in ('template1','template0')";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				listOfSchemas.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfSchemas;
	}

	@Override
	public List<String> featchTheScemesList() {
		List<String> listOfSchemas = new ArrayList<String>();
		try {
			Statement statement = JDBCConnection(propertices());
			String query = "SELECT schema_name FROM information_schema.schemata where schema_name not in ('information_schema','pg_toast','pg_catalog')";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				listOfSchemas.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfSchemas;
	}

}

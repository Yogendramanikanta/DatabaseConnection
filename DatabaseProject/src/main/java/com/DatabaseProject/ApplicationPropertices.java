package com.DatabaseProject;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.DatabaseProject.Entity.DatabaseContextHolder;

@Configuration

public class ApplicationPropertices {
	
	@Bean
    public DataSource dataSource(DatabaseConnectionProperties properties) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:postgresql://" + properties.getHost() + ":"+properties.getPort()+"/"+properties.getDatabaseName());
//        dataSource.setUsername(properties.getUsername());
//        dataSource.setPassword(properties.getPassword());
        
        DatabaseContextHolder.setDatabaseType("postgres");
        
        
        if(properties.getDatabaseName() == null) {
        dataSource.setUrl("jdbc:postgresql://" +"localhost"+ ":"+"5432"+"/Manikanta");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");}
        else {
             createDataSource("jdbc:postgresql://localhost:5432/postgrs", "postgres", "root");

        }
       
        return dataSource;
    }
	
	 public static DriverManagerDataSource createDataSource(String url, String username, String password) {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.postgresql.Driver"); // Adjust the driver class based on your database
	        dataSource.setUrl(url);
	        dataSource.setUsername(username);
	        dataSource.setPassword(password);
	        return dataSource;
	    }

}

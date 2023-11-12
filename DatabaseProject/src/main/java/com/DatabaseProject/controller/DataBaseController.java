package com.DatabaseProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseProject.ApplicationPropertices;
import com.DatabaseProject.DatabaseConnectionProperties;
import com.DatabaseProject.Entity.DatabaseContextHolder;
import com.DatabaseProject.service.DataBaseservice;

@RestController
@RequestMapping("/dataBase")
public class DataBaseController {
	
	@Autowired
	private DataBaseservice service;
	
	
	@GetMapping("/featch")
	public String test() {
		return "sample test";
	}
	
	@GetMapping("/featchTheSchemasList")
	public List<String> featchTheSchemasList(){
//		DatabaseConnectionProperties  properties = new DatabaseConnectionProperties();
//        properties.setUrl("jdbc:postgresql://localhost:5432/postgres");
//        properties.setUsername("root");
//        properties.setPassword("root");
//        properties.setPort(5432);
//        properties.setHost("localhost");
//        properties.setDatabaseName("postgres");
		ApplicationPropertices dd = new ApplicationPropertices();
		DatabaseConnectionProperties tt = new DatabaseConnectionProperties();
		tt.setDatabaseName("postgres");
		dd.dataSource(tt);
//        DatabaseContextHolder.setDatabaseType("postgres");
		return service.featchTheScemesList();}
	

}

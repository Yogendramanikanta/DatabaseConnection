package com.DatabaseProject.service.impl;

import java.net.MulticastSocket;
import java.util.List;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.DatabaseProject.repository.SchemaRepo;
//import com.DatabaseProject.repository.SchemaRepo;
import com.DatabaseProject.service.DataBaseservice;
@Service
public class DataBaseServiceImpl implements DataBaseservice {

	
	@Autowired
	SchemaRepo repo;
	
	@Override
	public List<String> featchTheScemesList() {
		List<String> listOfSchems =repo.featchTheSchemas();
		System.out.println(listOfSchems);
		return listOfSchems;
	}
	
	

}

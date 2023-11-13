package com.DatabaseProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

	@GetMapping("/featchTheDaabaseName")
	public List<String> featchTheDaabaseName() {
		return service.featchTheDatabaseNames();
	}

	@GetMapping("/featchTheSchemasList")
	public List<String> featchTheSchemasList() {
		return service.featchTheScemesList();
	}

}

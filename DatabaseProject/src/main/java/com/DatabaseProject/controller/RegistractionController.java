package com.DatabaseProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseProject.Entity.RegistractionDetails;
import com.DatabaseProject.service.RegistractionService;

@RestController
@RequestMapping("/registraction")
public class RegistractionController {

	@Autowired
	private RegistractionService registractionDetailsService;

	@PostMapping("/save")
	public String saveRegistractionFrom(@RequestBody RegistractionDetails registractionDetails) {
		String response;
		try {
			response = registractionDetailsService.registractionForm(registractionDetails);
		} catch (Exception e) {
			return e.getMessage();
		}
		return response;
	}

}

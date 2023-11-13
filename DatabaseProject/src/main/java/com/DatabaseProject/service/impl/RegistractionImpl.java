package com.DatabaseProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.DatabaseProject.Entity.RegistractionDetails;
import com.DatabaseProject.repository.RegistractionRepo;
import com.DatabaseProject.service.RegistractionService;

@Service
public class RegistractionImpl implements RegistractionService {

	private JavaMailSender javaMailSender;
	@Autowired
	private RegistractionRepo registractionRepo;

	public void sendMailForSucces(String userMail) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("yogendramanikanta9951@gmail.com");
		message.setTo(userMail);
		message.setText("Successfully Registred and Your passwor is : M@nikanta143");
		message.setSubject("EpSoft");
		javaMailSender.send(message);
	}

	@Override
	public String registractionForm(RegistractionDetails registractionDetails) {

//		RegistractionDetails registraction = new RegistractionDetails();
		RegistractionDetails registraction = registractionRepo.findByUserName(registractionDetails.getUserName());
		if (registraction == null) {
			registraction = new RegistractionDetails(); 
			registraction.setFullName(registractionDetails.getFullName());
			registraction.setUserName(registractionDetails.getUserName());
			registraction.setPassword("M@nikanta143");
			registraction.setPostgresqlHost(registractionDetails.getPostgresqlHost());
			registraction.setPostgresqlUserName(registractionDetails.getPostgresqlUserName());
			registraction.setPostgresqlPassword(registractionDetails.getPostgresqlPassword());
			registraction.setPostgresqlPort(registractionDetails.getPostgresqlPort());
			registraction.setPostgresqlDatabaseName(registractionDetails.getPostgresqlDatabaseName());
			registractionRepo.save(registraction);
//			sendMailForSucces(registractionDetails.getUserName());
			return "User Successfully Registraction";
		} else {
			return "User Already Exist";
		}
	}

}

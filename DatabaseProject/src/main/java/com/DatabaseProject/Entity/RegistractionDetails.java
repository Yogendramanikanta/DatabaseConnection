package com.DatabaseProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registraction_details")
public class RegistractionDetails {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	@Column(name = "full_name")
	String fullName;
	@Id
	@Column(name = "User_name")
	private String userName;
	@Column(name ="password")
	private String password;
	@Column(name = "postgresql_username")
	private String postgresqlUserName;
	@Column(name = "postgresql_password")
	private String postgresqlPassword;
	@Column(name = "postgresql_port")
	private String postgresqlPort;
	@Column(name = "postgresql_database_name")
	private String postgresqlDatabaseName;
	@Column(name = "postgresql_host")
	private String postgresqlHost;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPostgresqlUserName() {
		return postgresqlUserName;
	}
	public void setPostgresqlUserName(String postgresqlUserName) {
		this.postgresqlUserName = postgresqlUserName;
	}
	public String getPostgresqlPassword() {
		return postgresqlPassword;
	}
	public void setPostgresqlPassword(String postgresqlPassword) {
		this.postgresqlPassword = postgresqlPassword;
	}
	public String getPostgresqlPort() {
		return postgresqlPort;
	}
	public void setPostgresqlPort(String postgresqlPort) {
		this.postgresqlPort = postgresqlPort;
	}
	public String getPostgresqlDatabaseName() {
		return postgresqlDatabaseName;
	}
	public void setPostgresqlDatabaseName(String postgresqlDatabaseName) {
		this.postgresqlDatabaseName = postgresqlDatabaseName;
	}
	public String getPostgresqlHost() {
		return postgresqlHost;
	}
	public void setPostgresqlHost(String postgresqlHost) {
		this.postgresqlHost = postgresqlHost;
	}

}

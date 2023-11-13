package com.DatabaseProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.DatabaseProject.Entity.RegistractionDetails;

@Repository
public interface RegistractionRepo extends JpaRepository<RegistractionDetails, String> {

	@Query(value = "SELECT * FROM registraction_details WHERE User_name IN (?1)", nativeQuery = true)
	RegistractionDetails findByUserName(String userName);

}

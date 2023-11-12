package com.DatabaseProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.DatabaseProject.Entity.ListOfServices;

@Repository
public interface SchemaRepo extends JpaRepository<ListOfServices, Long> {
	
	@Query(value = "SELECT schema_name FROM information_schema.schemata where schema_name not in ('information_schema','pg_toast','pg_catalog')", nativeQuery = true)
	public List<String> featchTheSchemas();

}

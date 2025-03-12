package com.roniantonius.database;


import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner{
	
	private final DataSource dataSource;
	public DatabaseApplication(final DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("Datasource: ", this.dataSource.toString());
		final JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
		jdbcTemplate.execute("SELECT 1");
	}

}

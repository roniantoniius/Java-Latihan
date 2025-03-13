package com.roniantonius.databasepostgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasepostgreApplication{
	public static void main(String[] args) {
		SpringApplication.run(DatabasepostgreApplication.class, args);
	}
}

//@SpringBootApplication
//@Slf4j
//public class DatabasepostgreApplication implements CommandLineRunner{
//	
//	private final DataSource dataSource;
//	
//	public DatabasepostgreApplication(final DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(DatabasepostgreApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		log.info("Datasource: ", this.dataSource.toString());
//		final JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
//		jdbcTemplate.execute("SELECT 1");
//	}
//
//}

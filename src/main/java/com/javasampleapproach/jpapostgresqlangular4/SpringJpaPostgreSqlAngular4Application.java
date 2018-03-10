package com.javasampleapproach.jpapostgresqlangular4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaPostgreSqlAngular4Application {
	/*select * from customer;
	insert into customer values(36,'Jack','Smith');
	insert into customer values(37,'Adam','Johnson');
		

	CREATE USER postgres1 WITH PASSWORD '123';
	 GRANT ALL PRIVILEGES ON DATABASE "testdb" to postgres1;

	GRANT ALL PRIVILEGES ON DATABASE testdb to postgres1;
	GRANT SELECT ON ALL TABLES IN SCHEMA public TO postgres1;
	GRANT INSERT ON ALL TABLES IN SCHEMA public TO postgres1;
	GRANT UPDATE ON ALL TABLES IN SCHEMA public TO postgres1;
	GRANT DELETE ON ALL TABLES IN SCHEMA public TO postgres1;
*/


//create user postgres identified by 123;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgreSqlAngular4Application.class, args);
	}
}

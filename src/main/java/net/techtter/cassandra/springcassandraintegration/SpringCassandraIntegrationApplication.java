package net.techtter.cassandra.springcassandraintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCassandraIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCassandraIntegrationApplication.class, args);
	}

}

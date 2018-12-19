package com.arek00.pastamaccaroni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author arek00 (arek00.com)
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

package com.arek00.pastamaccaroni.config;

import lombok.Getter;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author arek00 (arek00.com)
 */
@Getter
@Configuration
public class DatabaseConfig {

	@Value("${database.url}") private String url;

	@Value("${database.port}") private Integer port;

	@Value("${database.user}") private String user;

	@Value("${database.password}") private String password;

	@Value("${database.name}") private String name;

	@Bean
	@Primary
	public DataSource dataSource() throws SQLException {
		final PGSimpleDataSource dataSource = new PGSimpleDataSource();

		dataSource.setUrl(String.format("jdbc:postgresql://%s:%s/%s", url, port, name));
		dataSource.setUser(user);
		dataSource.setPassword(password);

		final DataBaseInit dbInitializer = new DataBaseInit(dataSource);
		dbInitializer.createSequence("pastas_id_seq");

		return dataSource;
	}
}

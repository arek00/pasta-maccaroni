package com.arek00.pastamaccaroni.config;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author arek00 (arek00.com)
 */
public class DataBaseInit {

	private final DataSource source;

	public DataBaseInit(final DataSource dataSource) {
		this.source = dataSource;
	}

	public void createSequence(final String sequenceName) throws SQLException {
		final String sequenceQuery = "CREATE SEQUENCE IF NOT EXISTS %s INCREMENT BY 1 MINVALUE 1;";
		final Connection connection = source.getConnection();
		final String query = String.format(sequenceQuery, sequenceName);

		final PreparedStatement statement = connection.prepareStatement(query);
		statement.execute();
	}
}

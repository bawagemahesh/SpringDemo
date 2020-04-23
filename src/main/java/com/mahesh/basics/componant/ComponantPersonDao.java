package com.mahesh.basics.componant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponantPersonDao {
	
	@Autowired
	ComponantJdbcConnection JdbcConnection;

	public ComponantJdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(ComponantJdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}

}

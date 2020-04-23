package com.mahesh.besics.springDemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	
	@Autowired
	JdbcConnection JdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection JdbcConnection) {
		this.JdbcConnection = JdbcConnection;
	}

}

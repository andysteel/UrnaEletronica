package com.gmail.andresoninfonet.urna.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {

	public Connection getConnection() throws NamingException, SQLException{
		
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/urna");
		
		Connection con = ds.getConnection();
		
		return con;
	}
}

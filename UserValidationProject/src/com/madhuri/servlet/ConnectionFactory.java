package com.madhuri.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection connection;
	public static Connection getCOnnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
	}
catch(SQLException e){
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return connection;
	}
		public static void closeConnection(){
			try{
				connection.close();
				}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		System.out.println(ConnectionFactory.getCOnnection());
	}	
}

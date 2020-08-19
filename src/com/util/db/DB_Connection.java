//package com.util.db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DB_Connection {
//	private String url = "jdbc:mysql://localhost:3306/bbinstitute";
//        private String user = "root";
//	private String password ="";
//	private String driver = "com.mysql.cj.jdbc.Driver";
//	private Connection connection;
//	
//	public DB_Connection() {
//		
//	}
//	
//	
//	public Connection getConnection() throws ClassNotFoundException, SQLException{
//		Class.forName(driver);
//		connection = DriverManager.getConnection(url,user,password);
//		System.out.println("connected to DB");
//		return connection;
//	}
//        
//	
///*
//        //----------check database main method---------------//
//	public static void main(String[] args) {
//		try {
//			new DB_Connection().getConnection();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//*/
//	
//	
//
//}

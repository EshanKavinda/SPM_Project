/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ESHAN
 */
public class SQLite_Connection {

    public SQLite_Connection() {
    }
    
    
    
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:lib/sqlitedatabase/db/b&b.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
            return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return  null;
        } 
//        finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
        
    }
    
//    public static void main(String[] args) {
//        
//        connect();
//        
//    }
 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.WorkingDaysAndHoursModel;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class TimeLogService {
    
     private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Statement stmt;
    ResultSet resultSet;
    
    public void addTimeLog(String perDay, String date) {
//        String perDay = work.getWork_time_per_day();
//        String date = work.getLog_date();
//        
           
        String sql = "INSERT INTO working_days_and_hours(work_time_per_day, log_date) VALUES('"+perDay+"','"+date+"' )";

      try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(sql);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+ result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
     public void select(){
        String sql = "SELECT working_days FROM working_days_and_hours";
        
         try {
            connection = SQLite_Connection.connect();
            stmt = connection.createStatement();
             resultSet = stmt.executeQuery(sql);
            System.out.println("DB status: "+ resultSet);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                 // Services.colsedConnections();
        }  
    }
    
   
     
     public void update(int id, int num) {
        String sql = "UPDATE working_days_and_hours "
                + "SET working_days = ? , log_date = ?"
                + "WHERE id = ?";

        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(id, num);
            preparedStatement.executeUpdate();
            
            System.out.println("DB status: "+ preparedStatement);
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                 // Services.colsedConnections();
        }  
    }
        
     public void delete(int id) {
        String sql = "DELETE FROM working_days_and_hours WHERE id = ?";

        try {
            
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(sql);

            // set the corresponding param
            preparedStatement.setInt(1, id);
            // execute the delete statement
            preparedStatement.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
            //Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                 // Services.colsedConnections();
        }  
    }

    
        
}

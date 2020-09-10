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
public class TimeSlotService {
     private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Statement stmt;
    ResultSet resultSet;
    
    public void addTimeSlot(String slot_start, String slot_end, String date, String desc) {
//        String slot = work.getTime_slot();
//        String date = work.getSlot_date();
//        String desc = work.getSlot_description();
//        
        String sql = "INSERT INTO working_days_and_hours(time_slot_start,slot_date,slot_description,time_slot_end) VALUES('"+slot_start+"', '"+date+"', '"+desc+"', '"+slot_end+"')";

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
        String sql = "SELECT id, time_slot FROM working_days_and_hours";
        
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
    
   
     
     public void update(int id, String slot, String date, String desc ) {
        String sql = "UPDATE working_days_and_hours "
                + "SET time_slot = ? , slot_date = ?, slot_description = ? "
                + "WHERE id = ?";

        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(id, slot);
            preparedStatement.setString(id, date);
            preparedStatement.setString(id, desc);
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

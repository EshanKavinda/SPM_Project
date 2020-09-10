/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.Lecturer;
import com.models.WorkingDaysAndHoursModel;
import com.util.db.SQLite_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class NumOfDaysService {
    
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Statement stmt;
    ResultSet resultSet;
    
    public void addNumberOfDays(String numberOfDays) {
//        int numberOfDays = work.getNum_of_working_days();
           
        String sql = "INSERT INTO working_days_and_hours(num_of_working_days) VALUES('"+numberOfDays+"')";

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
        String sql = "SELECT num_of_working_days FROM working_days_and_hours";
        
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
    
   
     
     public void update(int id, String num) {
        String sql = "UPDATE working_days_and_hours SET num_of_working_days = '"+num+"' WHERE id = '"+id+"'";

        try {
            connection = SQLite_Connection.connect();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, num);

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
     
//      public static void main(String[] args) {
//        NumOfDaysService lecturerService = new NumOfDaysService();
//        WorkingDaysAndHoursModel lecturer = new WorkingDaysAndHoursModel(300);
//        Lecturer lecturer2 = new Lecturer(2, "abcd", "123456", "eng", "OC", "Malabe", "new", "level", "rank");
//
//        lecturerService.addNumberOfDays(lecturer);
//        lecturerService.select();
//        lecturerService.delete(2);
//        lecturerService.update(3, 2);

//    }

    
        
}

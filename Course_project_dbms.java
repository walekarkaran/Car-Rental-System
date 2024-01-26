/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.course_project_dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Course_project_dbms {

   public static void main(String[] args) {
       
        try
        {
               
              
            String username = "Username";
                    
            String pass = "password";
            String sql  = "jdbc:mysql://localhost:3306/my_db";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sql, username, pass);
                 
           JOptionPane.showMessageDialog(null,"connected");
                
        }
        catch(Exception e)
         {  
             JOptionPane.showMessageDialog(null, e);
         }
         
  
        
       // JOptionPane.showMessageDialog(null,"no connection estabished");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author M Azhar Durrani
 */
public class Connect {
    
    Connection con=null;
   
        public static Connection ConnectDB(){
            
            //JDBC Connection : M Zahid Mehraj
          String dbURL = "jdbc:ucanaccess://D:/Spring 2017-II/JAVA/Projects/Semester Project-SRMS-00/Student.accdb";
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection(dbURL); 
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
    
        }
}
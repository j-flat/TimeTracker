/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
import java.sql.*;
import java.util.Date;

public class TrackerDAO {
    private String user; //this variable values are accessed in the last page after successful login
    private int userID, hours, minutes; //userID is used to store new work-hour information
    
    public boolean UpdateDatabase(Timestamp startDate, Timestamp endDate, int userName) {

        Statement stmt = null; //creating an SQL-query string
        String SQL = "INSERT INTO tracker (ID, startDate, endDate) VALUES ('" + userName + "','" + startDate + "','" + endDate + "');";
        
        try
        {
            boolean rowFound = false; //initializing a boolean to differentiate succesfull and un-succesful login
            String myDriver = "org.gjt.mm.mysql.Driver"; //using hosted MYSQL-JBDC Driver
            String myUrl = "jdbc:mysql://eu-cdbr-azure-north-b.cloudapp.net/cdb_9317ad04d7"; //url-string for CleraDB-database

            Connection conn = DriverManager.getConnection(myUrl, "b6a81817dfe22a", "89a8ee8c"); //setting the connection string
            stmt = conn.createStatement(); //creating a statement

            System.out.println("Connected"); //testing for connection in development
            stmt.executeUpdate(SQL);
            //ResultSet rs = stmt.executeQuery(SQL); //executing the sql-query

            System.out.println(SQL); //testing for the sql-query

            stmt.close();
            return rowFound;
        }
       catch(SQLException e)  
       { 
            System.out.println(e);
            System.exit(0);
            return false;
       }
        finally
        {
            
        }
    }
    //getters for the variables
    public String getUsername() { return user; }
    public int getID() { return userID; }
    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
}

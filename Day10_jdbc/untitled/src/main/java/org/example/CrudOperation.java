package org.example;

import java.sql.*;

public class CrudOperation {
    private Connection conn;

    public void displayCustomers(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "1234");
            System.out.println("Connected");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from worker");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3));

            }
        }catch (SQLException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }


    public void insertCustomer(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","1234");
            System.out.println("Connected");
            PreparedStatement stmt = conn.prepareStatement("Insert into worker(worker_id,first_name,last_Name,salary,joining_date,department) values(?,?,?,?,?,?)");
            stmt.setInt(1,10);
            stmt.setString(2,"sumit");
            stmt.setString(3,"goswami");
            stmt.setInt(4,500000);
            stmt.setDate(5, Date.valueOf("2014-09-23"));
            stmt.setString(6,"OPS");

            int rowsInserted = stmt.executeUpdate();
            if(rowsInserted>0)
                System.out.println("Customer inserted successfully");
        }

        catch(Exception e){
            System.out.println(e);
        }

        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }


    public void updateCustomer(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","1234");
            System.out.println("Connected");
            PreparedStatement stmt = conn.prepareStatement("Update worker set first_name=? where worker_id=?");
            stmt.setInt(2,10);
            stmt.setString(1,"parneet");

            int rowsUpdated = stmt.executeUpdate();
            if(rowsUpdated>0)
                System.out.println("Customer updated successfully");
        }

        catch(Exception e){
            System.out.println(e);
        }

        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

}


package com.mycompany.searchererp;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserOperations {
    private Connection conn = null;
    private Statement statment = null;  
    private PreparedStatement preparedStatement = null;

    public Connection getConn() {
        return conn;
    }

    public Statement getStatment() {
        return statment;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setStatment(Statement statment) {
        this.statment = statment;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }
    public ArrayList<Products> getProducts(){
        ArrayList<Products> productses = new ArrayList<>();
    try {
           
            statment=conn.createStatement();
            String query = "Select * from products;";
            
            ResultSet rs = statment.executeQuery(query);
            
            while(rs.next()){
                int id=  rs.getInt("id");
                String name = rs.getString("name");
                 String category =  rs.getString("category");
                 double price =  rs.getDouble("price");
                 String addUser = rs.getString("addUser");
                 productses.add(new Products(id,name,price,addUser));
            }
            
            return  productses;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<Employees> getEmployees(){
     ArrayList<Employees> inputList = new ArrayList<>();
        try {
           
            statment=conn.createStatement();
            String query = "Select * from employees;";
            
            ResultSet rs = statment.executeQuery(query);
            
            while(rs.next()){
                int id=  rs.getInt("id");
                String name = rs.getString("name");
                 String surName =  rs.getString("surName");
                 String phone= rs.getString("phone");
                String position =  rs.getString("position");
                 double salary =  rs.getDouble("salary");
                 inputList.add(new Employees(id,name,surName,position,phone,salary));

            }
            
            return  inputList;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    
    
    }
    
    public void addEmployee(String name,String surname,String phone,String position,double salary){
        try {
            statment=conn.createStatement();
            String query  = String.format("CALL addEmployee('%s','%s','%s','%s',%s);",name,surname,phone,position,salary);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
       public void addProducts(String name,double price,String category,String addUser){
        try {
            statment=conn.createStatement();
            String query  = String.format("CALL addProduct('%s','%s','%s','%s);",name,price,category,addUser);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void employeeUpdate(int id,String name,String surname,String phone,String position,double salary){
             try {
            statment=conn.createStatement();
            String query  = String.format("CALL updateEmp(%s,'%s','%s','%s','%s',%s);",id,name,surname,phone,position,salary);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        public void productUpdate(int id,String name,double price,String category,String addUser){
             try {
            statment=conn.createStatement();
            String query  = String.format("CALL updateProd(%s,'%s','%s','%s','%s');",id,name,price,category,addUser);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public  void employeeDelete(int id){
     try {
            statment=conn.createStatement();
            String query  = String.format("CALL employeeDelete(%s);",id);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      public  void productDelefe(int id){
     try {
            statment=conn.createStatement();
            String query  = String.format("CALL productDelete(%s);",id);
            statment.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    

    public UserOperations() {
         try {
 
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                    System.out.println("Class tapilmadi!!");
            }
            String url ="jdbc:mysql://localhost:3306/searchererp";
            
            conn=DriverManager.getConnection(url,"root","searcher");
            System.out.println("Connected DB!");
        } catch (SQLException ex) {
                    ex.printStackTrace();
                System.out.println("Can't be Connected!");
        }
        
        
    }
    
    
    public static void main(String[] args) {
        UserOperations u = new UserOperations();
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
/**
 * @author Aakash Tyagi
 * Date : 28 April 2017
 */
import models.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOModel_Products {

    Connector connector = new Connector();
    Connection conn = connector.connect();
    private Statement statement = null;

    public void createProductsTable() {
        try {

            Statement st = conn.createStatement();
            String sql = "CREATE TABLE product (productId int NOT NULL AUTO_INCREMENT, productQuantity int NOT NULL,productName VARCHAR(255), productStatus VARCHAR(255),productDescription VARCHAR(255), PRIMARY KEY(productId))";
           // String sqlManager = "CREATE TABLE manager (managerId int NOT NULL AUTO_INCREMENT, managerFirstName VARCHAR(255), managerLastName VARCHAR(255),managerUserName VARCHAR(255), managerPassword VARCHAR(255),managerEmailId VARCHAR(255),managerCity VARCHAR(255),managerDepartment VARCHAR(255), PRIMARY KEY(managerId))";
           // String sqlEmployee = "CREATE TABLE employee (employeeId int NOT NULL AUTO_INCREMENT, employeeFirstName VARCHAR(255), employeeLastName VARCHAR(255),employeeUserName VARCHAR(255), employeePassword VARCHAR(255),employeeEmailId VARCHAR(255),employeeCity VARCHAR(255),employeeDepartment VARCHAR(255),employeeManager VARCHAR(255), PRIMARY KEY(employeeId))";
            st.executeUpdate(sql);
            //st.executeUpdate(sqlManager);
            //st.executeUpdate(sqlEmployee);
            System.out.println("Created product table in given database...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

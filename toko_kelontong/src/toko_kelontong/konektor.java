/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toko_kelontong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konektor {

 private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/toko_kelontong1";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
          
}   catch (Exception e) {
    System.err.println("koneksi gagal "+e.getMessage());
    
    } return mysqlconfig;

    }   
}

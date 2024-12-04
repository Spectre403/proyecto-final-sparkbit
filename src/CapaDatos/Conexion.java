package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Conexion {
      Connection con;
      public Conexion(){
         
          
          try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistemaventa","root","");
             System.out.println("Conexion exitosa a la base de datos!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: "+e.getMessage());
        }
         
      }
      public Connection GetConnection(){
      return con;
      }
      
      public static void main(String[] args) {
        Conexion cn = new Conexion();
        
        cn.GetConnection();
    }
}

      
          
 




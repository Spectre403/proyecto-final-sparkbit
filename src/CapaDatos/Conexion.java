package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3307/bdsistemaventa";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public Connection getConnection() {
        Connection cons = null;
        
        try {
           cons = DriverManager.getConnection(URL, USUARIO, PASSWORD);
           System.out.println("Conexion Exitosa!");
        } catch (SQLException error) {
           System.out.println("¡Error en la Conexion");
           error.printStackTrace();
        }
        return cons;
    }
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        cn.getConnection();
    }
}

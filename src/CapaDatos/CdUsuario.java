package CapaDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import capaEntidad.*;

public class CdUsuario {
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        try (Connection conexion = new Conexion().GetConnection()) {
            String query = "select IdUsuario,Documento,NombreCompleto,Correo,Clave,Estado from usuario";
            Statement consulta = conexion.createStatement();
            ResultSet usuariosResultSet = consulta.executeQuery(query);
            while (usuariosResultSet.next()) {
                Usuario usr = new Usuario();
                usr.setIdUsuario(usuariosResultSet.getInt("IdUsuario"));
                usr.setDocumento(usuariosResultSet.getString("Documento"));
                usr.setNombreCompleto(usuariosResultSet.getString("NombreCompleto"));
                usr.setCorreo(usuariosResultSet.getString("Correo"));
                usr.setClave(usuariosResultSet.getString("Clave"));
                //usr.setEstado(usuariosResultSet.getString("Estado"));
                lista.add(usr);
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error.getMessage());
        }
        return lista;
    }
}

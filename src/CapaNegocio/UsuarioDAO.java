
package CapaNegocio;
import CapaDatos.Conexion;
import capaEntidad.Usuario;
import capaEntidad.Rol;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement ps;


public boolean RegistrarUsuario(Usuario u1){
 String sql = "INSERT INTO Usuario(Documento,NombreCompleto,Correo,Clave) Values (?,?,?,?)"; 
    try {
        cn = con.GetConnection();
        ps = cn.prepareStatement(sql);
        ps.setString(1, u1.getDocumento());
        ps.setString(2, u1.getNombreCompleto());
         ps.setString(3, u1.getCorreo());
          ps.setString(4, u1.getCorreo());
          ps.execute();
          return true;
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        return false;
    }finally{
        try {
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    }

}


        
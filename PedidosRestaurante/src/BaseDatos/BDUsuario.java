/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import Clases.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author bdcordova
 */
public class BDUsuario {

    ConexionR BLcon = new ConexionR();

    public int InsertarUsuario(Usuario objUsuario) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Usuario(nombres, apellidos, email, clave, rol, activo)"
                + "VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objUsuario.getNombres());
        ps.setString(1, objUsuario.getApellidos());
        ps.setString(3, objUsuario.getEmail());
        ps.setString(4, objUsuario.getClave());
        ps.setString(5, objUsuario.getRol());
        ps.setBoolean(6, objUsuario.isActivo());
        return ps.executeUpdate();
    }

    public ResultSet BuscarUsuarioEmail(Usuario objCliente) throws ClassNotFoundException, SQLException{
    String Sentencia ="SELECT * FROM Usuario WHERE email = ?";
    PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
    ps.setString(1, objCliente.getEmail());
    return ps.executeQuery();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author bdcordova
 */
public class BDClienteR {
    ConexionR BLcon= new ConexionR();
    
    public int InsertarCliente (Cliente objCliente) throws ClassNotFoundException, SQLException{
    String Sentencia ="INSERT INTO Cliente(nombre, correo, telefono, direccion, cedula)"
            +"VALUES(?,?,?,?,?)";
    PreparedStatement ps =BLcon.getConnection().prepareStatement(Sentencia);
    ps.setString(1, objCliente.getNombre());
    ps.setString(2, objCliente.getCorreo());
    ps.setString(3, objCliente.getTelefono());
    ps.setString(4, objCliente.getDireccion());
    ps.setString(5, objCliente.getCedula());
    return ps.executeUpdate();
    }
    
    public ResultSet BuscarClienteCedula(Cliente objCliente) throws ClassNotFoundException, SQLException{
    String Sentencia ="SELECT * FROM Cliente WHERE cedula = ?";
    PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
    ps.setString(1, objCliente.getCedula());
    return ps.executeQuery();
    
    }
    
}

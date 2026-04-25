/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bdcordova
 */
public class BDProducto {

    ConexionR BLcon = new ConexionR();

    public int InsertarProducto(Producto objProducto) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Producto(nombre, descripcion, precio)"
                + "VALUES(?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objProducto.getNombre());
        ps.setString(2, objProducto.getDescripcion());
        ps.setDouble(3, objProducto.getPrecio());
        return ps.executeUpdate();
    }

    public ResultSet BuscarProducto(Producto objProducto) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT * FROM Producto WHERE nombre=?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, objProducto.getIdProd());
        return ps.executeQuery();
    }

    public ResultSet ListarProducto() throws SQLException, ClassNotFoundException {
        String Sentencia = "SELECT idProd,nombre,descripcion,precio FROM Producto";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        return ps.executeQuery();
    }
}

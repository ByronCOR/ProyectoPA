/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDProducto;
import Clases.Producto;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author bdcordova
 */
public class LogicaProducto {

    BDProducto objBDProducto = new BDProducto();

    public void BuscarProducto(Producto objProducto) throws
            ClassNotFoundException, SQLException {
        ResultSet rs = objBDProducto.BuscarProducto(objProducto);
        while (rs.next()) {
            objProducto.setIdProd(rs.getInt(1));
        }
        rs.close();
    }

    public boolean RegistrarProducto(Producto objProducto) throws ClassNotFoundException, SQLException {
        if (objProducto.getNombre() != null) {
            BuscarProducto(objProducto);
            if (objProducto.getIdProd() != 0) {
                return false;
            } else {
                objBDProducto.InsertarProducto(objProducto);
                return true;
            }

        } else {
            return false;
        }
    }
    
    public ResultSet MostrarMenu() throws SQLException, ClassNotFoundException{
    return objBDProducto.ListarProducto();
    }
}

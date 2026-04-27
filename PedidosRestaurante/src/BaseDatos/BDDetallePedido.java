/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.DetallePedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class BDDetallePedido {
        ConexionR BLcon = new ConexionR();
    
        public int InsertarDetallePedido(DetallePedido objDetallePedido) throws ClassNotFoundException,
            SQLException {
        String Sentencia = "INSERT INTO DetallePedido("
                + "cantidad, "
                + "precioUnitario, "
                + "subtotal, "
                + "idPedido, "
                + "idProducto)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setInt(1, objDetallePedido.getCantidad());
        ps.setDouble(1, objDetallePedido.getPrecioUnitario());
        ps.setDouble(3, objDetallePedido.getSubtotal());
        ps.setInt(4, objDetallePedido.getPedido().getIdPed());
        ps.setInt(5, objDetallePedido.getProducto().getIdProd());
        return ps.executeUpdate();
    }
}

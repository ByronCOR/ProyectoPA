/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import Clases.Pedido;
import Clases.Producto;
import Clases.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class BDPedido {

    ConexionR BLcon = new ConexionR();

    public int InsertarPedido(Pedido objPedido) throws ClassNotFoundException,
            SQLException {
        String Sentencia = "INSERT INTO Pedido("
                + "fechaHoraRegistro,"
                + "codigoPedido,"
                + "direccionEntrega,"
                + "total,"
                + "estado,"
                + "idCliente)"
                + "VALUES(NOW(),?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);

        ps.setString(1, objPedido.getCodigo());
        ps.setString(2, objPedido.getDireccion_entrega());
        ps.setDouble(3, objPedido.getTotal());
        ps.setString(4, objPedido.getEstado());
        ps.setInt(5, objPedido.getCliente().getIdClie());

        return ps.executeUpdate();
    }

    public ResultSet BuscarPedidoCodigo(Pedido objPedido) throws ClassNotFoundException,
            SQLException {
        String Sentencia = "SELECT * FROM Pedido WHERE codigoPedido = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPedido.getCodigo());
        return ps.executeQuery();
    }

}

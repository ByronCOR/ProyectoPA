/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.HistorialEstado;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class BDHistorialEstado {
    ConexionR BLcon = new ConexionR();

    public int InsertarHistorialEstado(HistorialEstado objHistorialEstado) throws ClassNotFoundException,
            SQLException {
        String Sentencia = "INSERT INTO HistorialEstado("
                + "estadoAnterior, "
                + "estadoNuevo, "
                + "fechaHoraCambio, "
                + "idPedido, "
                + "idUsuario)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objHistorialEstado.getEstado_anterior());
        ps.setString(1, objHistorialEstado.getEstado_actual());
        ps.setString(3, objHistorialEstado.getFecha());
        ps.setInt(4, objHistorialEstado.getPedido().getIdPed());
        ps.setInt(5, objHistorialEstado.getUsuario().getIdUsuario());
        return ps.executeUpdate();
    }
}

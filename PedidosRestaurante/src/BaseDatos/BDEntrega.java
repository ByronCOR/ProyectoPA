/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import Clases.Entrega;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class BDEntrega {

    ConexionR BLcon = new ConexionR();

    public int InsertarEntrega(Entrega objEntrega) throws ClassNotFoundException,
            SQLException {
        String Sentencia = "INSERT INTO Entrega("
                + "fechaHoraSalida, "
                + "fechaHoraEntrega, "
                + "nombreReceptor, "
                + "idPedido, "
                + "idUsuario)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objEntrega.getFechaHoraSalida());
        ps.setString(1, objEntrega.getFechaHoraEntrega());
        ps.setString(3, objEntrega.getNombreReceptor());
        ps.setInt(4, objEntrega.getPedido().getIdPed());
        ps.setInt(5, objEntrega.getUsuario().getIdUsuario());
        return ps.executeUpdate();
    }
}

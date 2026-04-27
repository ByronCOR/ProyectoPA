/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDDetallePedido;
import BaseDatos.BDEntrega;
import Clases.DetallePedido;
import Clases.Entrega;
import java.sql.SQLException;


/**
 *
 * @author bdcordova
 */
public class LogicaEntrega {

    BDEntrega objBDEntrega = new BDEntrega();

    public boolean RegistrarEntrega(Entrega objEntrega)
            throws ClassNotFoundException, SQLException {


            if (objEntrega.getPedido().getIdPed() != 0) {
              objBDEntrega.InsertarEntrega(objEntrega);
                return true;
            } else {

                return false;
            }
     
    }
}

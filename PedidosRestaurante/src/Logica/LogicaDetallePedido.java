/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDDetallePedido;
import Clases.DetallePedido;
import java.sql.SQLException;


/**
 *
 * @author bdcordova
 */
public class LogicaDetallePedido {

    BDDetallePedido objBDDetallePedido = new BDDetallePedido();

    public boolean RegistrarDetallePedido(DetallePedido objDetallePedido)
            throws ClassNotFoundException, SQLException {


            if (objDetallePedido.getCantidad() != 0) {
              objDetallePedido.setSubtotal(objDetallePedido.getCantidad()*
                      objDetallePedido.getPrecioUnitario());
              objBDDetallePedido.InsertarDetallePedido(objDetallePedido);
                return true;
            } else {

                return false;
            }
     
    }
}

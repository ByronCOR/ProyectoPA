/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDHistorialEstado;
import Clases.HistorialEstado;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class LogicaHistorialEstado {

    BDHistorialEstado objBDHistorialEstado = new BDHistorialEstado();

    public boolean RegistrarHistorialEstado(HistorialEstado objHistorialEstado)
            throws ClassNotFoundException, SQLException {

        if (objHistorialEstado.getPedido().getIdPed() != 0) {
            objBDHistorialEstado.InsertarHistorialEstado(objHistorialEstado);
            return true;
        } else {
            return false;
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDClienteR;
import Clases.Cliente;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author bdcordova
 */
public class LogicaClienteR {

    BDClienteR objBDCliente = new BDClienteR();

    public void BuscarCliente(Cliente objCliente) throws
            ClassNotFoundException, SQLException {
        ResultSet rs = objBDCliente.BuscarClienteCedula(objCliente);
        while (rs.next()) {
            objCliente.setIdClie(rs.getInt(1));
        }
        rs.close();
    }

    public boolean RegistrarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        if (objCliente.getCedula() != null) {
            BuscarCliente(objCliente);
            if (objCliente.getIdClie() != 0) {
                return false;
            } else {
                objBDCliente.InsertarCliente(objCliente);
                return true;
            }

        } else {
            return false;
        }
    }

}

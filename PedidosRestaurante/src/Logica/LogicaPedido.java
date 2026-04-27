/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDPedido;
import Clases.EstadoPedido;
import Clases.Pedido;

import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author bdcordova
 */
public class LogicaPedido {

    BDPedido objBDPedido = new BDPedido();

    public void BuscarPedido(Pedido objPedido) throws
            ClassNotFoundException, SQLException {
        ResultSet rs = objBDPedido.BuscarPedidoCodigo(objPedido);
        while (rs.next()) {
            objPedido.setIdPed(rs.getInt(1));

        }
        rs.close();
    }

    public boolean RegistrarPedido(Pedido objPedido) throws ClassNotFoundException, SQLException {
        if (objPedido.getCodigo() != null) {
            BuscarPedido(objPedido);
            if (objPedido.getIdPed() != 0) {
                return false;
            } else {
                objPedido.setEstado(EstadoPedido.PENDIENTE.getValor());
                objBDPedido.InsertarPedido(objPedido);
                BuscarPedido(objPedido);
                return true;
            }
        } else {
            return false;
        }
    }
}

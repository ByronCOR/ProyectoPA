/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public enum EstadoPedido {

    PENDIENTE("Pendiente"),
    EN_PREPARACION("En preparación"),
    LISTO("Listo para entrega"),
    EN_CAMINO("En camino"),
    ENTREGADO("Entregado");

    private String valor;

    EstadoPedido(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}


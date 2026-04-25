/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class DetallePedido {
    private int idDetalle;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private Producto producto;
    private Pedido pedido;

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, double precioUnitario, double subtotal, Producto producto, Pedido pedido) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.producto = producto;
        this.pedido = pedido;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetalle=" + idDetalle 
                + ", cantidad=" + cantidad 
                + ", precioUnitario=" + precioUnitario 
                + ", subtotal=" + subtotal 
                + ", producto=" + producto 
                + ", pedido=" + pedido + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Pedido {

    private int idPed;
    private String fechaHoraRegistro;
    private String codigo;
    private String estado;
    private String direccion_entrega;
    private double total;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(String fechaHoraRegistro,
            String codigo,
            String estado,
            String direccion_entrega,
            double total,
            Cliente cliente) {

        this.fechaHoraRegistro = fechaHoraRegistro;
        this.codigo = codigo;
        this.estado = estado;
        this.direccion_entrega = direccion_entrega;
        this.total = total;
        this.cliente = cliente;
    }

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public int getIdPed() {
        return idPed;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPed=" + idPed + ", fechaHoraRegistro=" + fechaHoraRegistro + ", codigo=" + codigo + ", estado=" + estado + ", direccion_entrega=" + direccion_entrega + ", total=" + total + ", cliente=" + cliente + '}';
    }

}

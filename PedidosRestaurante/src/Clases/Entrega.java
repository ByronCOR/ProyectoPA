/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Entrega {
    private int idEntrega ;
    private String fechaHoraSalida;
    private String fechaHoraEntrega;
    private String nombreReceptor;
    private Pedido pedido;
    private Usuario usuario;

    public Entrega() {
    }

    public Entrega(String fechaHoraSalida, String fechaHoraEntrega, String nombreReceptor, Pedido pedido, Usuario usuario) {
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.nombreReceptor = nombreReceptor;
        this.pedido = pedido;
        this.usuario = usuario;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public void setFechaHoraEntrega(String fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public String getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Entrega{" + "idEntrega=" + idEntrega 
                + ", fechaHoraSalida=" + fechaHoraSalida 
                + ", fechaHoraEntrega=" + fechaHoraEntrega 
                + ", nombreReceptor=" + nombreReceptor 
                + ", pedido=" + pedido 
                + ", usuario=" + usuario + '}';
    }

    
    
    
}

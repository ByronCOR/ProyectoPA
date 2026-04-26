/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class HistorialEstado {
    private int idHistorial;
    private String estado_actual;
    private String estado_anterior;
    private String fecha;
    private Pedido pedido;

    public HistorialEstado() {
    }

    public HistorialEstado(String estado_actual, String estado_anterior, String fecha, Pedido pedido) {
        this.estado_actual = estado_actual;
        this.estado_anterior = estado_anterior;
        this.fecha = fecha;
        this.pedido = pedido;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public void setEstado_actual(String estado_actual) {
        this.estado_actual = estado_actual;
    }

    public void setEstado_anterior(String estado_anterior) {
        this.estado_anterior = estado_anterior;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public String getEstado_actual() {
        return estado_actual;
    }

    public String getEstado_anterior() {
        return estado_anterior;
    }

    public String getFecha() {
        return fecha;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "HistorialEstado{" + "idHistorial=" + idHistorial 
                + ", estado_actual=" + estado_actual 
                + ", estado_anterior=" + estado_anterior 
                + ", fecha=" + fecha 
                + ", pedido=" + pedido + '}';
    }
    
    
    
    
    
    

    

  
    
            
}

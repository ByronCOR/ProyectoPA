/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Repartidor {
    private int idRepartidor;
    private String nombre;
    private String cedula;
    private String telefono;

    public Repartidor() {
    }

    public Repartidor(String nombre, 
            String cedula, 
            String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "idRepartidor=" + idRepartidor 
                + ", nombre=" + nombre 
                + ", cedula=" + cedula 
                + ", telefono=" + telefono + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Cliente {
    
    private int idClie;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String cedula;

    public Cliente() {
    }

    public Cliente( String nombre, String correo, String telefono, 
            String direccion, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getIdClie() {
        return idClie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idClie=" + idClie 
                + ", nombre=" + nombre 
                + ", correo=" + correo 
                + ", telefono=" + telefono 
                + ", direccion=" + direccion 
                + ", cedula=" + cedula + '}';
    }
    
    
    
}

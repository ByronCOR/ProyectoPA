/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Producto {
    private int idProd;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String descripcion,
            double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProd() {
        return idProd;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd 
                + ", nombre=" + nombre 
                + ", descripcion=" + descripcion 
                + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}

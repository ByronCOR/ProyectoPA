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
    private String categoria;
    private double precio;
    private boolean disponible;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String categoria, double precio, boolean disponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd 
                + ", nombre=" + nombre 
                + ", descripcion=" + descripcion 
                + ", categoria=" + categoria 
                + ", precio=" + precio 
                + ", disponible=" + disponible + '}';
    }

   
    
    
    
    
    
    
}

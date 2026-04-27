/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bdcordova
 */
public class Usuario {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String clave;
    private String rol;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombres,
            String apellidos,
            String email,
            String clave,
            String rol,
            boolean activo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.clave = clave;
        this.rol = rol;
        this.activo = activo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getRol() {
        return rol;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario 
                + ", nombres=" + nombres 
                + ", apellidos=" + apellidos 
                + ", email=" + email 
                + ", clave=" + clave 
                + ", rol=" + rol 
                + ", activo=" + activo + '}';
    }
            
        
    
}

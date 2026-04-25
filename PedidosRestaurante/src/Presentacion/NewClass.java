/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Clases.Producto;
import Logica.LogicaClienteR;
import Logica.LogicaProducto;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class NewClass {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // CLIENTE
        Cliente objCliente = new Cliente();
        
        objCliente.setNombre("Byron C");
        objCliente.setCedula("1105637688");
        objCliente.setTelefono("0991535307");
        objCliente.setDireccion("Emiliano Ortega");
        objCliente.setCorreo("bdcordova@utpl.edu.ec");
        
        LogicaClienteR lc= new LogicaClienteR();
        

        boolean resultado = lc.RegistrarCliente(objCliente);

if(resultado == true){
    System.out.println("Cliente registrado correctamente");
} else {
    System.out.println("Cliente ya existe o error");
}
        //PRODUCTO
        
        Producto objProducto = new Producto();
        
        objProducto.setNombre("Chaulafan");
        objProducto.setDescripcion("un plato muy rico");
        objProducto.setPrecio(6.15);
        
        LogicaProducto lp = new LogicaProducto();
        
        lp.RegistrarProducto(objProducto);
  if(resultado == true){
    System.out.println("Producto registrado correctamente");
} else {
    System.out.println("Producto ya existe o error");
}   
  
  
        
        
        
        
    }
    
}

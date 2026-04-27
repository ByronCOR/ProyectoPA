/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Clases.DetallePedido;
import Clases.Entrega;
import Clases.HistorialEstado;
import Clases.Pedido;
import Clases.Producto;
import Clases.Usuario;
import Logica.LogicaClienteR;
import Logica.LogicaDetallePedido;
import Logica.LogicaEntrega;
import Logica.LogicaHistorialEstado;
import Logica.LogicaPedido;
import Logica.LogicaProducto;
import Logica.LogicaUsuario;
import java.sql.SQLException;

/**
 *
 * @author bdcordova
 */
public class NewClass {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
// CLIENTE
Cliente objCliente = new Cliente();
objCliente.setNombres("Byron");
objCliente.setApellidos("Córdova");
objCliente.setCedula("1105637688");
objCliente.setTelefono("0991535307");
objCliente.setDireccion("Emiliano Ortega");
objCliente.setCorreo("bdcordova@utpl.edu.ec");

LogicaClienteR lc = new LogicaClienteR();
boolean resultado = lc.RegistrarCliente(objCliente);
if(resultado == true){
    System.out.println("Cliente registrado correctamente");
} else {
    System.out.println("Cliente ya existe o error");
}

// USUARIO
Usuario objUsuario = new Usuario();
objUsuario.setNombres("Admin");
objUsuario.setApellidos("Sistema");
objUsuario.setEmail("admin@restaurante.com");
objUsuario.setClave("admin123");
objUsuario.setRol("Administrador");

LogicaUsuario lu = new LogicaUsuario();
resultado = lu.RegistrarUsuario(objUsuario);
if(resultado == true){
    System.out.println("Usuario registrado correctamente");
} else {
    System.out.println("Usuario ya existe o error");
}

// PRODUCTO
Producto objProducto = new Producto();
objProducto.setNombre("Chaulafan");
objProducto.setDescripcion("Un plato muy rico");
objProducto.setPrecio(6.15);
objProducto.setCategoria("Platos fuertes");
objProducto.setDisponible(true);

LogicaProducto lp = new LogicaProducto();
resultado = lp.RegistrarProducto(objProducto);
if(resultado == true){
    System.out.println("Producto registrado correctamente");
} else {
    System.out.println("Producto ya existe o error");
}

// PEDIDO
Pedido objPedido = new Pedido();
objPedido.setCodigo("PED-001");
objPedido.setDireccion_entrega("Emiliano Ortega");
objPedido.setTotal(0.0);
objPedido.setCliente(objCliente);

LogicaPedido lpd = new LogicaPedido();
resultado = lpd.RegistrarPedido(objPedido);
if(resultado == true){
    System.out.println("Pedido registrado correctamente");
} else {
    System.out.println("Pedido ya existe o error");
}

// DETALLE PEDIDO
DetallePedido objDetalle = new DetallePedido();
objDetalle.setCantidad(2);
objDetalle.setPrecioUnitario(objProducto.getPrecio());
objDetalle.setPedido(objPedido);
objDetalle.setProducto(objProducto);

LogicaDetallePedido ldet = new LogicaDetallePedido();
resultado = ldet.RegistrarDetallePedido(objDetalle);
if(resultado == true){
    System.out.println("Detalle registrado correctamente");
} else {
    System.out.println("Error al registrar detalle");
}

// ENTREGA
Entrega objEntrega = new Entrega();
objEntrega.setFechaHoraSalida("2026-04-27 10:00:00");
objEntrega.setFechaHoraEntrega("2026-04-27 10:30:00");
objEntrega.setNombreReceptor("Juan Pérez");
objEntrega.setPedido(objPedido);
objEntrega.setUsuario(objUsuario);

LogicaEntrega le = new LogicaEntrega();
resultado = le.RegistrarEntrega(objEntrega);
if(resultado == true){
    System.out.println("Entrega registrada correctamente");
} else {
    System.out.println("Error al registrar entrega");
}

// HISTORIAL ESTADO
HistorialEstado objHistorial = new HistorialEstado();
objHistorial.setEstado_actual("Pendiente");
objHistorial.setEstado_anterior("En preparación");
objHistorial.setFecha("2026-04-27 10:05:00");
objHistorial.setPedido(objPedido);
objHistorial.setUsuario(objUsuario);

LogicaHistorialEstado lh = new LogicaHistorialEstado();

resultado = lh.RegistrarHistorialEstado(objHistorial);
if(resultado == true){
    System.out.println("Historial registrado correctamente");
} else {
    System.out.println("Error al registrar historial");
}   
  
  
        
        
        
        
    }
    
}

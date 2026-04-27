/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDUsuario;
import Clases.Usuario;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author bdcordova
 */
public class LogicaUsuario {
        BDUsuario objBDUsuario = new BDUsuario();

    public void BuscarUsuario(Usuario objUsuario) throws
            ClassNotFoundException, SQLException {
        ResultSet rs = objBDUsuario.BuscarUsuarioEmail(objUsuario);
        while (rs.next()) {
            objUsuario.setIdUsuario(rs.getInt(1));

        }
        rs.close();
    }

    public boolean RegistrarUsuario(Usuario objUsuario) throws ClassNotFoundException, SQLException {
        if (objUsuario.getEmail() != null) {
            BuscarUsuario(objUsuario);
            if (objUsuario.getIdUsuario() != 0) {
                return false;
            } else {
                objUsuario.setActivo(true);
                objBDUsuario.InsertarUsuario(objUsuario);
                return true;
            }

        } else {
            return false;
        }
    }
}

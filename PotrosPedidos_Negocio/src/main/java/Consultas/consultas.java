/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import Mock.Usuario;

/**
 *
 * @author yohan
 */
public class consultas {

    public Boolean consultarIDYContra(String id, String Contra) {
        Usuario u = new Usuario();

        if (!u.getID().equalsIgnoreCase(id) || !u.getContra().equalsIgnoreCase(Contra)) {
            return false;
        }
        return true;
    }
}

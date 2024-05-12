/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subsistemausuario;

import control.ControlUsuario;
import dominio.Usuario;
import interfaces.IControlUsuario;

/**
 *
 * @author jl4ma
 */
public class SubsistemaUsuario {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        IControlUsuario c = new ControlUsuario();
        Usuario u = new Usuario();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subsistemaproductosmenu;

import control.ControlProductos;
import dominio.ProductoCafeteria;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersistenciaException;
import excepciones.BancoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jl4ma
 */
public class SubsistemaProductosMenu {

    public static void main(String[] args) throws BancoException {
        
        try {
            ControlProductos control = new  ControlProductos();
            
            List<ProductoCafeteriaDTO> pros= control.obtenerTodosLosProductos();
            
            for(ProductoCafeteriaDTO pro : pros){
                System.out.println(pro.getNombre());
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(SubsistemaProductosMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

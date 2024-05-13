/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cafeteria;

import DAOs.ProductoCafeteriaDAO;
import Incerciones.InsercionMasivaProductosCafeteriaBO;
import dominio.ProductoCafeteria;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Cafeteria {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        InsercionMasivaProductosCafeteriaBO i = new InsercionMasivaProductosCafeteriaBO();
        if (!i.datosExisten()) {
            i.insertarRegistros();
        };
        ProductoCafeteriaDAO pro = new ProductoCafeteriaDAO();
//        
        List<ProductoCafeteria> pa = pro.consultarProductos("l");

        for (ProductoCafeteria  prrr : pro.ordenarProductosZA()) {
            System.out.println(prrr.getNombre());
        }
    }
}

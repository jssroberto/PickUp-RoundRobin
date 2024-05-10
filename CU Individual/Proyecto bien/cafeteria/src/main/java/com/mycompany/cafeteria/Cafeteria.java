/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeteria;

import daos.ProductoCafeteriaDAO;
import inserciones.InsercionMasivaProductosCafeteriaBO;
import dominio.ProductoCafeteria;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Cafeteria {

    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World!");
//        InsercionMasivaProductosCafeteriaBO i =  new InsercionMasivaProductosCafeteriaBO();
//        i.insertarRegistros();
        ProductoCafeteriaDAO pro = new ProductoCafeteriaDAO();
        
        List<ProductoCafeteria> pa = pro.obtenerTodosLosProductos();
        
        for(ProductoCafeteria prrr: pa){
            System.out.println(prrr.getNombre());
        }
    }
}

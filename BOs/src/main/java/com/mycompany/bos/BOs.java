/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bos;

import BOs.BusquedaBO;
import Interfaz.IBusquedaBO;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author yohan
 */
public class BOs {

    public static void main(String[] args) throws PersitenciaException {
        System.out.println("Hello World!");
        IBusquedaBO b = new BusquedaBO();

        for (ProductoCafeteriaDTO prrr : b.ordenarProductosAZ()) {
            System.out.println(prrr.getNombre() + "" + prrr.getPrecio());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import DAOs.TarjetaDAO;
import Incerciones.InsercionMasivaBanco;
import excepciones.PersitenciaException;

/**
 *
 * @author jl4ma
 */
public class Banco {

    public static void main(String[] args) throws PersitenciaException {
        InsercionMasivaBanco i = new InsercionMasivaBanco();
        i.insertarRegistros();
//          if (!i.datosExisten()) {
//            i.insertarRegistros();
//        };
//        TarjetaDAO tar = new TarjetaDAO();
//        if (tar.BuscarTarjeta("4696-1641-7464-6464")) {
//            System.out.println("si");
//        }else{
//            System.out.println("no");
//        }
        }
}

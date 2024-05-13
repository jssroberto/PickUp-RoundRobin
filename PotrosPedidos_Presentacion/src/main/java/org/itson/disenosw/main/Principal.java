package org.itson.disenosw.main;

import BOs.BusquedaBO;
import Interfaz.IBusquedaBO;
import control.ControlLogin;
import control.ControlProductos;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import interfaces.IControlLogin;
import interfaces.IControlProductos;
import java.util.List;
import org.itson.disenosw.guis.FramePrincipal;
import java.util.logging.Logger;

/**
 * Clase principal del programa. Inicia la aplicación y establece la conexión
 * con la base de datos. Crea instancias de las clases DAO necesarias para
 * interactuar con la base de datos. Muestra la ventana principal de la
 * aplicación.
 */
public class Principal {


    public static void main(String[] args) throws PersitenciaException, Exception {

        FramePrincipal framePrincipal = new FramePrincipal();
        framePrincipal.cambiarVistaInicio();
        framePrincipal.setVisible(true);
//
//        IBusquedaBO b = new BusquedaBO();
//        List<ProductoCafeteriaDTO> pa = b.consultarProductos("h");
//
//        for (ProductoCafeteriaDTO prrr : b.ordenarProductosAZ()) {
//            System.out.println(prrr.getNombre());
//        }

//        IControlProductos b = new ControlProductos();
////
//        List<ProductoCafeteria> pa = b.obtenerTodosLosProductos();
//
//        for (ProductoCafeteria prrr : pa) {
//            System.out.println(prrr.getNombre());
//        }
// IControlLogin control = new ControlLogin();
//        if (control.validacionDatos("00000244978", "MNO97531")) {
//            System.out.println("si");
//        } else {
//            System.out.println("no");
//        }
//        System.out.println(System.getProperty("user.dir"));
//    }
    }
}

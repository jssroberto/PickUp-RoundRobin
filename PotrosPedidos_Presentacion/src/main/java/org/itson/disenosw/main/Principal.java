package org.itson.disenosw.main;

import control.ControlProductos;
import dominio.ProductoCafeteria;
import excepciones.PersitenciaException;
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

    static final Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) throws PersitenciaException {
        
        FramePrincipal framePrincipal = new FramePrincipal();
        framePrincipal.cambiarVistaInicio();
        framePrincipal.setVisible(true);
//   IControlProductos consultarProductoBO = new ControlProductos();
//        List<ProductoCafeteria> productos = consultarProductoBO.obtenerTodosLosProductos();
//            for (ProductoCafeteria  prrr : productos) {
//            System.out.println(prrr);
//        }
    
        System.out.println(        System.getProperty("user.dir"));
    }
}

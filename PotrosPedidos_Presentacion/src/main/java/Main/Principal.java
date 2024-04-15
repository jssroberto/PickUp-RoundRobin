package Main;

import GUI.FramePrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal del programa.
 * Inicia la aplicación y establece la conexión con la base de datos.
 * Crea instancias de las clases DAO necesarias para interactuar con la base de datos.
 * Muestra la ventana principal de la aplicación.
 */
public class Principal {

    static final Logger logger = Logger.getLogger(Principal.class.getName());
    
    public static void main(String[] args) {   
            FramePrincipal ventana = new FramePrincipal(0);
            ventana.cambiarVistaInicio();
            ventana.setVisible(true);
    }
}

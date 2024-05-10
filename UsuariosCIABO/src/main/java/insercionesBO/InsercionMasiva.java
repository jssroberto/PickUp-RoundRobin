package insercionesBO;

import inserciones.InsercionMasivaUsuariosCIA;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto García
 */
public class InsercionMasiva {

    private static final Logger logger = Logger.getLogger(InsercionMasiva.class.getName());

    public InsercionMasiva() {
    }

    public void insercionMasiva() {
        InsercionMasivaUsuariosCIA insercion = new InsercionMasivaUsuariosCIA();
        try {
            insercion.insertarRegistros();
        } catch (Exception e) {
            logger.log(Level.INFO, "Los usuarios ya han sido registrados");
        }
    }
}

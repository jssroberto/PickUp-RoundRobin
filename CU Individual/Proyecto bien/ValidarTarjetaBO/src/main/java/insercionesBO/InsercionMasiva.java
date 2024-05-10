package insercionesBO;

import inserciones.InsercionMasivaBanco;
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
        InsercionMasivaBanco insercion = new InsercionMasivaBanco();
        try {
            insercion.insertarRegistros();
        } catch (Exception e) {
            logger.log(Level.INFO, "Las tarjetas ya han sido registradas");
        }
    }
}

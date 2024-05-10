
package interfaces;

import excepciones.BOException;

/**
 *
 * @author jl4ma
 */
public interface IUsuarioCiaBO {
    
    public boolean validacionDatos(String idEstudiante, String contra) throws BOException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import daos.UsuarioCiaDAO;
import excepciones.BOException;
import excepciones.CIAException;
import interfaces.IUsuarioCiaBO;
import interfaces.IUsuarioCiaDAO;

/**
 *
 * @author jl4ma
 */
public class UsuariosCiaBO implements IUsuarioCiaBO {

    IUsuarioCiaDAO usuario;

    public UsuariosCiaBO() {
        usuario = new UsuarioCiaDAO();
    }

    @Override
    public boolean validacionDatos(String idEstudiante, String contra) throws BOException {
        try {

            if (usuario.BuscarPersona(idEstudiante, contra)) {
                return true;
            } else {
                throw new BOException("Credenciales no válidas");
            }
        } catch (CIAException e) {
            throw new BOException(e.getMessage(), e);
        }
    }

}

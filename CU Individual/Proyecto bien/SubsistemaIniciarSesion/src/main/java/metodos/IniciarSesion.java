/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import excepciones.BOException;
import excepciones.SubsistemaException;
import objetosNegocio.UsuariosCiaBO;
import interfaces.IUsuarioCiaBO;

/**
 *
 * @author jl4ma
 */
public class IniciarSesion {

    IUsuarioCiaBO usuario;

    public IniciarSesion() {
        usuario = new UsuariosCiaBO();
    }

    public boolean validacionDatos(String idEstudiante, String contra) throws SubsistemaException {
        boolean usuarioValido = false;
        try {
            usuarioValido  = usuario.validacionDatos(idEstudiante, contra);
        } catch (BOException ex) {
            throw new SubsistemaException(ex.getMessage());
        }
        return usuarioValido;
    }
}

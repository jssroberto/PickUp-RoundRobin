/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import mocks.Usuario;
import java.util.List;
import org.itson.disenosw.dtos.UsuarioDTO;

/**
 *
 * @author yohan
 */
public class ValidarPersona implements IValidarPersona {

validarPersonaBO vp = new validarPersonaBO();

  
    @Override
    public Boolean ValidarPersona(UsuarioDTO usuario) {
       return vp.ValidarPersona(usuario.getIdCia(), usuario.getContra());
    }
    
}

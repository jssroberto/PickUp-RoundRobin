/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import java.util.List;
import mocks.Usuario;

/**
 *
 * @author yohan
 */
public class validarPersonaBO {
     private List<Usuario> usuarios;

    public validarPersonaBO() {
    }

    public validarPersonaBO(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    
    public Boolean ValidarPersona(String ID, String contra) {
         if (usuarios == null) {
            return false;
        }
        for (Usuario usuario : usuarios) {
            if (usuario.getID().equals(ID) && usuario.getContra().equals(contra)) {
                return true;
            }
        }
        return false;
    }
}

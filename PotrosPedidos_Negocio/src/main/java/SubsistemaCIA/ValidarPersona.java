/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import mocks.Usuario;
import java.util.List;

/**
 *
 * @author yohan
 */
public class ValidarPersona implements IValidarPersona {

    private List<Usuario> usuarios;

    public ValidarPersona(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;


import org.itson.disenosw.dtos.UsuarioDTO;

/**
 *
 * @author yohan
 */
public class ValidarPersona implements IValidarPersona {

    ControlCIA control = new ControlCIA();

    @Override
    public Boolean ValidarPersona(UsuarioDTO usuario) throws Exception {
        return control.ValidarPersona(usuario.getIdCia(), usuario.getContra());
    }

}

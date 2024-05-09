/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaCIA;

import excepciones.PersistenciaException;
import org.itson.disenosw.dtos.UsuarioDTO;

/**
 *
 * @author yohan
 */
public interface IValidarPersona {

    public Boolean ValidarPersona (UsuarioDTO usuario) throws PersistenciaException;
}

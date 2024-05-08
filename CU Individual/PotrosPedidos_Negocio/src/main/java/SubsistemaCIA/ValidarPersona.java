/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;


import BOs.VerificarPersonaBO;
import excepciones.ExcepcionAT;

import org.itson.disenosw.dtos.UsuarioDTO;

/**
 *
 * @author yohan
 */
public class ValidarPersona  {

   public boolean validacion(String user, String contra) throws ExcepcionAT{
       VerificarPersonaBO persona = new VerificarPersonaBO();
       
        if (persona.comprobar(user, contra)) {
            return true;
        }else{
            return false;
        }
   }

}

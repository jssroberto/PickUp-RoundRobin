/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import BOs.VerificarPersonaBO;
import DAOs.UsuarioCiaDAO;
import IDAOs.IUsuarioDAO;
import excepciones.ExcepcionAT;

/**
 *
 * @author yohan
 */
public class ControlCIA {

    ValidarPersona persona = new ValidarPersona();
    IUsuarioDAO user = new UsuarioCiaDAO();
    
    public boolean validar(String user, String contra) throws ExcepcionAT{
       
       
        if (persona.validacion(user, contra)) {
            return true;
        }else{
            return false;
    }
    }
        public Long idUsuario(String user) throws ExcepcionAT{
            if (this.user.idPersona(user)>=0) {
                return this.user.idPersona(user);
            }else{
                return 0l;
                   
        }
    }

  
  
  
    
}

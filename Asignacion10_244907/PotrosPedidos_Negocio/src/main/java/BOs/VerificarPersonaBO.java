/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.UsuarioCiaDAO;
import IDAOs.IUsuarioDAO;
import excepciones.ExcepcionAT;



/**
 *
 * @author yohan
 */
public class VerificarPersonaBO {

        IUsuarioDAO usuario = new UsuarioCiaDAO(); 
        
        public boolean comprobar(String user, String contra) throws ExcepcionAT{
            if(usuario.BuscarPersona(user, contra) != null){
                return true;
            }else{
                return false;
            }
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import excepciones.ExcepcionAT;
import mocks.Usuario;

/**
 *
 * @author jl4ma
 */
public interface IUsuarioDAO {
       public Usuario BuscarPersona(String id,String contra) throws ExcepcionAT;
       public Long idPersona(String usuario)throws ExcepcionAT;
}

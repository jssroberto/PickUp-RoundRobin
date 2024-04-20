/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import dominio.Usuario;
import excepciones.ExcepcionAT;

/**
 *
 * @author USER
 */
public interface IUsuarioDAO {
    public void registrarUsuario (Usuario usuario) throws ExcepcionAT;
    
    public void actualizarUsuario (Usuario usuario) throws ExcepcionAT;
    
    public Usuario buscarUsuarioPorIdCIA(String idUsuarioCia) throws ExcepcionAT;
}

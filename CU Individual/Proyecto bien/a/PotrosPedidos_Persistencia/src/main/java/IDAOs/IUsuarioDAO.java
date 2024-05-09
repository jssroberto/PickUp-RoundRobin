/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import dominioVIEJO.Usuario;
import excepciones.PersistenciaException;

/**
 *
 * @author USER
 */
public interface IUsuarioDAO {
    public void registrarUsuario (Usuario usuario) throws PersistenciaException;
    
    public void actualizarUsuario (Usuario usuario) throws PersistenciaException;
    
    public Usuario buscarUsuarioPorIdCIA(String idUsuarioCia) throws PersistenciaException;
}

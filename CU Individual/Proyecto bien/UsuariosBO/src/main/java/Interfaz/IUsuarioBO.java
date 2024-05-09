/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dtos.UsuarioDTO;
import excepciones.PersitenciaException;

/**
 *
 * @author yohan
 */
public interface IUsuarioBO {

    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) throws PersitenciaException;

    public void persistir(UsuarioDTO usuario) throws PersitenciaException;
}

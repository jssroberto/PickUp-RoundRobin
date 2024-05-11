/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dominio.Usuario;
import dtos.UsuarioDTO;

/**
 *
 * @author yohan
 */
public interface IUsuarioBO {

    public Usuario consultarUsuario(Usuario usuario);

    public void persistir(UsuarioDTO usuario);
}

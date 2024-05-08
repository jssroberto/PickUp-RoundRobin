/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IUsuarioDAO;
import excepciones.ExcepcionAT;
import mocks.Usuario;

/**
 *
 * @author yohan
 */
public class UsuarioCiaDAO implements IUsuarioDAO {

    Usuario u = new Usuario();

    public UsuarioCiaDAO() {
        u.generarLista();

    }

    @Override
    public Usuario BuscarPersona(String id, String contra) throws ExcepcionAT {
        if (id == null || contra == null) {
            return null;
        }
        u.generarLista();

        for (Usuario us : u.getListaUsuarios()) {
            if (id.equalsIgnoreCase(us.getID()) && contra.equalsIgnoreCase(us.getContra())) {
                return us; 
            }
        }

        return null;
    }
    public Long idPersona(String usuario){
        for (Usuario us : u.getListaUsuarios()) {
            if (usuario.equalsIgnoreCase(us.getID())) {
                return us.getId_usuario(); 
            }
        }
        return null;
    }
}

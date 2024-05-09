package BOs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DAOs.UsuarioCiaDAO;
import DAOs.UsuarioDAO;
import IDAOs.ICiaDAO;
import IDAOs.IUsuarioDAO;
import convertidores.ConvertidorDAOaDTO;
import convertidores.ConvertidorDTOaDAO;
import dominio.Usuario;
import dominioVIEJO.Pedido;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;
import excepciones.PersitenciaException;

/**
 *
 * @author yohan
 */
public class UsuarioBO {

    UsuarioDAO usuarios = new UsuarioDAO();
    ConvertidorDAOaDTO convertir = new ConvertidorDAOaDTO();
    ConvertidorDTOaDAO c= new ConvertidorDTOaDAO();
    
    public void persistir(UsuarioDTO usuario) throws PersitenciaException {
        if (usuario == null) {
            throw new PersitenciaException("Usuario vacio");
        } else {
            usuarios.persistir(c.convertirDTOenDAO(usuario));
        }
    }

    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) throws PersitenciaException {

        if (usuario == null) {
            throw new PersitenciaException("Usuario vacio");
        } else {
            return convertir.convertirDAOenDTO(usuarios.consultarUsuario(c.convertirDTOenDAO(usuario)));
        }
    }

//    public void referenciarPedido(Usuario usuario, Pedido pedido) {
//
//    }
}

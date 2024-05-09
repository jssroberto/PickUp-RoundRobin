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
    ConvertidorDTOaDAO convertir = new ConvertidorDTOaDAO();
    ConvertidorDTOaDAO c= new ConvertidorDTOaDAO();
    
//    public void persistir(UsuarioDTO usuario) throws PersitenciaException {
//        if (usuario == null) {
//            throw new PersitenciaException("Usuario vacio");
//        } else {
//            usuarios.persistir(usuario);
//        }
//    }

//    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) throws PersitenciaException {
//
//        if (usuario == null) {
//            throw new PersitenciaException("Usuario vacio");
//        } else {
//            return usuarios.consultarUsuario(usuario.getId());
//        }
//    }

//    public void referenciarPedido(Usuario usuario, Pedido pedido) {
//
//    }
}

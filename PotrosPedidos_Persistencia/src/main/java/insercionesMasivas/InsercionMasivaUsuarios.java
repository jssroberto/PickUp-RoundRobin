/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionesMasivas;

import DAOs.UsuarioDAO;
import dominio.Carrito;
import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaUsuarios {
    
    List<Usuario> usuarios = new ArrayList<>();
    List<Carrito> carritos = new ArrayList<>();
    
    public void insertarRegistros() throws Exception{
         EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("potrosPU");
        EntityManager emUsuario = emfCafeteria.createEntityManager();
        
        usuarios.add(new Usuario("Juan", "Perez", "Garcia", "00000011211"));
        usuarios.add(new Usuario("Maria", "Lopez", "Martinez", "00000244454"));
        usuarios.add(new Usuario("Pedro", "Gonzalez", "Santos", "00000046574"));
        usuarios.add(new Usuario("Ana", "Rodriguez", "Fernandez","00000240157"));
        usuarios.add(new Usuario("Luis", "Martinez", "Diaz", "00000244978"));

        emUsuario.getTransaction().begin();
        for (Usuario usuarioCIA : usuarios) {
            emUsuario.persist(usuarioCIA);  
        }
        
        emUsuario.getTransaction().commit();
        
        UsuarioDAO usuarioDAO= new UsuarioDAO();
        List<Usuario> listaAuxiliar= usuarioDAO.obtenerListaUsuarios();
                System.out.println(listaAuxiliar.isEmpty());

  
        carritos.add(new Carrito(0.0F, 0, listaAuxiliar.get(0)));
        carritos.add(new Carrito(0.0F, 0, listaAuxiliar.get(1)));
        carritos.add(new Carrito(0.0F, 0, listaAuxiliar.get(2)));
        carritos.add(new Carrito(0.0F, 0, listaAuxiliar.get(3)));
        carritos.add(new Carrito(0.0F, 0, listaAuxiliar.get(4)));  
     
        emUsuario.getTransaction().begin();
        for (Carrito carrito : carritos) {
            emUsuario.persist(carrito);  
        }
        emUsuario.getTransaction().commit();
 
        emUsuario.getTransaction().begin();
        listaAuxiliar.get(0).setCarrito(carritos.get(0));
        listaAuxiliar.get(1).setCarrito(carritos.get(1));
        listaAuxiliar.get(2).setCarrito(carritos.get(2));
        listaAuxiliar.get(3).setCarrito(carritos.get(3));
        listaAuxiliar.get(3).setCarrito(carritos.get(4));
        
        usuarioDAO.actualizarUsuario(listaAuxiliar.get(0));
        usuarioDAO.actualizarUsuario(listaAuxiliar.get(1));
        usuarioDAO.actualizarUsuario(listaAuxiliar.get(2));
        usuarioDAO.actualizarUsuario(listaAuxiliar.get(3));
        usuarioDAO.actualizarUsuario(listaAuxiliar.get(4));
        
        
//        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(0)));
//        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(1)));
//        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(2)));
//        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(3)));
//        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(4)));
        emUsuario.getTransaction().commit();
        emUsuario.close();
    }
        
}

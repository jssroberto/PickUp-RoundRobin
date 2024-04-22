/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import CIA.UsuarioCIA;
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
    
    public void insercion(){
         EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("potrosPU");
        EntityManager emUsuario = emfCafeteria.createEntityManager();
        Carrito carrito= new Carrito();
        Carrito carrito2= new Carrito();
        Carrito carrito3= new Carrito();
        Carrito carrito4= new Carrito();
        Carrito carrito5= new Carrito();
        usuarios.add(new Usuario("Juan", "Perez", "Garcia", "00000011211"));
        usuarios.add(new Usuario("Maria", "Lopez", "Martinez", "00000244454"));
        usuarios.add(new Usuario("Pedro", "Gonzalez", "Santos", "00000046574"));
        usuarios.add(new Usuario("Ana", "Rodriguez", "Fernandez","00000240157"));
        usuarios.add(new Usuario("Luis", "Martinez", "Diaz", "00000244978"));
        emUsuario.getTransaction().begin();
        for (Usuario usuarioCIA : usuarios) {
            emUsuario.persist(usuarioCIA);
            
        }
        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(0)));
        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(1)));
        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(2)));
        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(3)));
        emUsuario.persist(new Carrito(0.0f, 0, usuarios.get(4)));
        emUsuario.getTransaction().commit();
        emUsuario.close();
    }
        
}

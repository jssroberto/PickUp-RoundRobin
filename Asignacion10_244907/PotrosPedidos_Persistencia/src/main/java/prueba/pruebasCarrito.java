/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

//import DAOs.CarritoDAO;
import DAOs.UsuarioCiaDAO;
import DAOs.UsuarioDAO;
import mocks.Usuario;

//import DAOs.UsuarioDAO;
//import dominio.Carrito;
//import dominio.Usuario;
//import excepciones.ExcepcionAT;
//import java.io.IOException;
/**
 *
 * @author yohan
 */
public class pruebasCarrito {

    public static void main(String[] args) throws Exception {

//        CarritoDAO c = new CarritoDAO();
//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//
//        Usuario usuario = usuarioDAO.buscarUsuarioPorIdCIA("00000244454");
//
//        Carrito carrito = new Carrito(0.0f,0,usuario);
//        
//        c.agregarCarrito(carrito);
      UsuarioCiaDAO u = new UsuarioCiaDAO();
        Usuario s = new Usuario();
        s.generarLista();
        // Pasa el ID y la contraseña por separado como argumentos a BuscarPersona
        System.out.println(u.BuscarPersona("000001234599", "c1").getID());

    }
}

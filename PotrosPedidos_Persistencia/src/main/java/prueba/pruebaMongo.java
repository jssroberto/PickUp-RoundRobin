/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import DAOs.ProductoDAO;
import DAOs.UsuarioDAO;
import dominio.Producto;
import dominio.Usuario;
import insercionesMasivas.InsercionMasivaProductos;
import insercionesMasivas.InsercionMasivaUsuarios;
import java.io.IOException;

/**
 *
 * @author yohan
 */
public class pruebaMongo {
    public static void main(String[] args) throws IOException, Exception {

    InsercionMasivaProductos pro = new InsercionMasivaProductos();
//
 pro.insertarRegistros ();
        InsercionMasivaUsuarios u = new InsercionMasivaUsuarios();
        u.insertarRegistros();
    }

//        ProductoDAO pro = new ProductoDAO();
//        Producto pros = new Producto();
//        pros.setCodigoProducto("SCL100");
//        UsuarioDAO user = new UsuarioDAO();
//        Usuario user2 = new Usuario();
//        user2.setIdCia("00000244913");
//        System.out.println(pro.consultar(pros));
        

}

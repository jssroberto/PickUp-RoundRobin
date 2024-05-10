/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import inserciones.InsercionMasivaProductos;
import inserciones.InsercionMasivaUsuarios;
import java.io.IOException;

/**
 *
 * @author yohan
 */
public class pruebaMongo {
    public static void main(String[] args) throws IOException, Exception {

    InsercionMasivaProductos pro = new InsercionMasivaProductos();

 pro.insertarRegistros ();
        InsercionMasivaUsuarios u = new InsercionMasivaUsuarios();
        u.insertarRegistros();
    }
}

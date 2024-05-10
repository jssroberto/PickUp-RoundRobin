/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pruebas;

import daos.UsuarioCiaDAO;
import inserciones.InsercionMasivaUsuariosCIA;

/**
 *
 * @author jl4ma
 */
public class Prueba {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
//        InsercionMasivaUsuariosCIA i = new InsercionMasivaUsuariosCIA();
//        i.insertarRegistros();
        UsuarioCiaDAO user = new UsuarioCiaDAO();
        if(user.BuscarPersona("00000244978", "2")){
            System.out.println("si");
        }else{
            System.out.println("no");}
       
        
    }
}

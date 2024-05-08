/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import conexion.Conexion;
import dominio.Usuario;

/**
 *
 * @author jl4ma
 */
public class UsuarioDAO {
    
    private final MongoCollection<Usuario> coleccionCursos;

    public UsuarioDAO() {
        this.coleccionCursos = Conexion.getDatabase().getCollection("usuarios", Usuario.class);
    }
    public void persistir(Usuario usuario){
        coleccionCursos.insertOne(usuario);
    }
}

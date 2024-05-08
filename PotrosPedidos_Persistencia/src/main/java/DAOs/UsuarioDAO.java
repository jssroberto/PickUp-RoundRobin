/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.Conexion;
import dominio.Carrito;
import dominio.Producto;
import dominio.Usuario;
import dominioVIEJO.Pedido;
import org.bson.types.ObjectId;

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
    
    public Usuario consultarUsuario(String id){
        return coleccionCursos.find(Filters.eq("idCia", id)).first();
    }
    
    public void actualizarCarrito(Usuario usuario, Carrito carrito){
        
    }
    public void eliminarProductoCarrito(Usuario usuario, Carrito carrito, Producto producto){
        
    }
    public void vaciarCarrito(Usuario usuario, Carrito carrito){
        
    }
    public void referenciarPedido(Usuario usuario, Pedido pedido){
        
    }
            
}

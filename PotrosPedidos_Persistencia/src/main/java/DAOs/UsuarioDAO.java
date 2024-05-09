/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Accumulators.push;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.addToSet;
import static com.mongodb.client.model.Updates.pull;
import conexion.Conexion;
import dominio.Carrito;
import dominio.DetalleProducto;
import dominio.Producto;
import dominio.Usuario;
import dominioVIEJO.Pedido;
import org.bson.Document;
import org.bson.conversions.Bson;
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
        
    
    public void agregarDetalleProductoAlCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
 
        coleccionCursos.updateOne(Filters.eq("_id", usuarioId), Updates.push("carrito.productos", nuevoDetalleProducto));
    }
    
    
    public void eliminarProductoCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
       
        coleccionCursos.updateOne(Filters.eq("_id", usuarioId), Updates.pull("carrito.productos", nuevoDetalleProducto));
    }
    
    public void vaciarCarrito(Usuario usuario, Carrito carrito){
        
    }
    public void referenciarPedido(Usuario usuario, Pedido pedido){
        
    }
            
}

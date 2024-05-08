/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Accumulators.push;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
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
        // Convertir el nuevo detalle de producto a un Document
        Document nuevoDetalleDoc = new Document("cantidad", nuevoDetalleProducto.getCantidad())
                .append("subtotal", nuevoDetalleProducto.getSubtotal())
                .append("producto", nuevoDetalleProducto.getProducto());

        // Agregar el nuevo detalle de producto al carrito del usuario
        coleccionCursos.updateOne(eq("_id", usuarioId), addToSet("carrito.productos", nuevoDetalleDoc));
    }
    
    
    public void eliminarProductoCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
        // Convertir el nuevo detalle de producto a un Document
        Document nuevoDetalleDoc = new Document("cantidad", nuevoDetalleProducto.getCantidad())
                .append("subtotal", nuevoDetalleProducto.getSubtotal())
                .append("producto", nuevoDetalleProducto.getProducto());

        // Agregar el nuevo detalle de producto al carrito del usuario
        coleccionCursos.updateOne(eq("_id", usuarioId), pull("carrito.productos", nuevoDetalleDoc));
    }
    public void vaciarCarrito(Usuario usuario, Carrito carrito){
        
    }
    public void referenciarPedido(Usuario usuario, Pedido pedido){
        
    }
            
}

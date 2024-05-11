/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IUsuarioDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import conexion.Conexion;
import dominio.Carrito;
import dominio.DetalleProducto;
import dominio.Usuario;
import dominioVIEJO.Pedido;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class UsuarioDAO implements IUsuarioDAO{
    
    private final MongoCollection<Usuario> coleccionCursos;

    public UsuarioDAO() {
        this.coleccionCursos = Conexion.getDatabase().getCollection("usuarios", Usuario.class);
    }
    @Override
    public void persistir(Usuario usuario){
        coleccionCursos.insertOne(usuario);
    }
    
    @Override
    public Usuario consultarUsuario(Usuario usuario){
        return coleccionCursos.find(Filters.eq("idCia", usuario.getIdCia())).first();
    }
        
    
    @Override
    public void agregarDetalleProductoAlCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
 
        coleccionCursos.updateOne(Filters.eq("_id", usuarioId), Updates.push("carrito.productos", nuevoDetalleProducto));
    }
    
    
    @Override
    public void eliminarProductoCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
       
        coleccionCursos.updateOne(Filters.eq("_id", usuarioId), Updates.pull("carrito.productos", nuevoDetalleProducto));
    }
    
    @Override
    public void vaciarCarrito(Usuario usuario){
        coleccionCursos.updateOne(Filters.eq("_id", usuario.getId()), Updates.pull("carrito.productos", consultarUsuario(usuario).getCarrito().getProductos()));
    }
    @Override
    public void referenciarPedido(Usuario usuario, Pedido pedido){
        
    }
            
}

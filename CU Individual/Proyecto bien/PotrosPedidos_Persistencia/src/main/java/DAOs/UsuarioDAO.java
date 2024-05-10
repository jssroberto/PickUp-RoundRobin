/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.Conexion;
import dominio.Carrito;
import dominio.Usuario;
import dominioVIEJO.Pedido;
import excepciones.PersistenciaException;

/**
 *
 * @author jl4ma
 */
public class UsuarioDAO {

    private final MongoCollection<Usuario> coleccionUsuario;

    public UsuarioDAO() {
        this.coleccionUsuario = Conexion.getDatabase().getCollection("usuarios", Usuario.class);
    }

    public void persistir(Usuario usuario) throws PersistenciaException {
        try {
            coleccionUsuario.insertOne(usuario);
        } catch (MongoException e) {
            throw new PersistenciaException("Error al persistir el usuario", e);
        }
    }

    public Usuario consultarUsuario(Usuario usuario) throws PersistenciaException{
        try {
            Usuario usuario1 = coleccionUsuario.find(Filters.eq("idCia", usuario.getIdCia())).first();
            if (usuario1 == null) {
                throw new PersistenciaException("No se encontró el usuario");
            }
            return usuario1;
        } catch (MongoException e) {
            throw new PersistenciaException("Error al consltar el usuario", e);
        }
    }

//    public void agregarDetalleProductoAlCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
// 
//        coleccionUsuario.updateOne(Filters.eq("_id", usuarioId), Updates.push("carrito.productos", nuevoDetalleProducto));
//    }
//    
//    
//    public void eliminarProductoCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) {
//       
//        coleccionUsuario.updateOne(Filters.eq("_id", usuarioId), Updates.pull("carrito.productos", nuevoDetalleProducto));
//    }
//    public void vaciarCarrito(Usuario usuario, Carrito carrito) {
//
//    }

    public void referenciarPedido(Usuario usuario, Pedido pedido) {

    }

}

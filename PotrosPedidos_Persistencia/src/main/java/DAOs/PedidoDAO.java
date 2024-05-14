/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IPedidoDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.Conexion;
import dominio.Pedido;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class PedidoDAO implements IPedidoDAO {

    private final MongoCollection<Pedido> coleccionPedido;
    private final MongoCollection<Usuario> coleccionUsuarios;

    public PedidoDAO() {
        this.coleccionPedido = Conexion.getDatabase().getCollection("pedidos", Pedido.class);
        this.coleccionUsuarios = Conexion.getDatabase().getCollection("usuarios", Usuario.class);
    }

    @Override
    public void persistir(Pedido pedido) throws PersistenciaException {
        try {
            coleccionPedido.insertOne(pedido);
        } catch (MongoException e) {
            throw new PersistenciaException("Error al persistir pedido", e);
        }
    }

    @Override
    public Pedido consultar(Pedido etiquetaPedido) throws PersistenciaException {
        return coleccionPedido.find(Filters.eq("etiquetaPedido", etiquetaPedido.getEtiquetaPedido())).first();
    }

    @Override
    public List<Pedido> consultarPedidos(String idUsuario) throws PersistenciaException {
        Usuario usuario = coleccionUsuarios.find(Filters.eq("_id", new ObjectId(idUsuario))).first();
        if (usuario != null) {
            return usuario.getPedidos().stream()
                    .map(pedidoId -> coleccionPedido.find(Filters.eq("_id", pedidoId)).first())
                    .collect(Collectors.toList());
        } else {
            throw new PersistenciaException("No se encontró el usuario proporcionado.");
        }
    }

    @Override
    public Pedido consultarPorId(String id) throws PersistenciaException {
        try {
            ObjectId objectId = new ObjectId(id);
            Pedido pedido = coleccionPedido.find(Filters.eq("_id", objectId)).first();
            if (pedido != null) {
                return pedido;
            } else {
                throw new PersistenciaException("No se encontró el pedido con el ID proporcionado.");
            }
        } catch (IllegalArgumentException e) {
            throw new PersistenciaException("El ID proporcionado no es válido.", e);
        } catch (MongoException e) {
            throw new PersistenciaException("Error al consultar el pedido", e);
        }
    }
}

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
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class PedidoDAO implements IPedidoDAO {

    private final MongoCollection<Pedido> coleccionPedido;

    public PedidoDAO() {
        this.coleccionPedido = Conexion.getDatabase().getCollection("pedidos", Pedido.class);
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
    public List<Pedido> consultar() throws PersistenciaException {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IPedidoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.Conexion;
import dominio.Pedido;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class PedidoDAO implements IPedidoDAO{
    private final MongoCollection<Pedido> coleccionPedido;

    public PedidoDAO() {
        this.coleccionPedido = Conexion.getDatabase().getCollection("pedidos", Pedido.class);
    }
    @Override
    public void persistir(Pedido pedido){
        coleccionPedido.insertOne(pedido);
    }
    @Override
    public Pedido consultarPedido(String numeroPedido){
        return coleccionPedido.find(Filters.eq("numeroPedido", numeroPedido)).first();
    }
}

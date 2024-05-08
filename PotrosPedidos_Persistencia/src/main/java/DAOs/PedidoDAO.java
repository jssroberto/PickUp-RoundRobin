/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import conexion.Conexion;
import dominio.Pedido;

/**
 *
 * @author jl4ma
 */
public class PedidoDAO {
    private final MongoCollection<Pedido> coleccionPedido;

    public PedidoDAO() {
        this.coleccionPedido = Conexion.getDatabase().getCollection("pedidos", Pedido.class);
    }
    public void persistir(Pedido pedido){
        coleccionPedido.insertOne(pedido);
    }
}

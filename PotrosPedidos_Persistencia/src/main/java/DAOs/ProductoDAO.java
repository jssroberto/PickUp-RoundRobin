/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import conexion.Conexion;
import dominio.Producto;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class ProductoDAO {
    private final MongoCollection<Producto> coleccionProductos;

    public ProductoDAO() {
        this.coleccionProductos = Conexion.getDatabase().getCollection("prodcutos", Producto.class);
    }
    public void persistir(Producto producto){
        coleccionProductos.insertOne(producto);
    }
    public Producto consultarProducto(String nombre){
        return coleccionProductos.find(Filters.eq("nombre", nombre)).first();
    }
}

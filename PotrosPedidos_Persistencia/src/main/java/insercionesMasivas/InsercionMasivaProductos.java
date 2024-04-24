/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionesMasivas;

import cafeteria.ProductoCafeteria;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaProductos {

    List<Producto> productos = new ArrayList<>();

    public void insertarRegistros() throws Exception{
         EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("potrosPU");
        EntityManager emCafeteria = emfCafeteria.createEntityManager();
//        productos.add(new Producto(50.0F, "Torta cubana", "Deliciosa", 1L));
//        productos.add(new Producto(100.0F, "Pizza de pepperoni", "Italiana", 2L));
//        productos.add(new Producto(25.0F, "Tacos de discada", "Mexicano", 3L));
//        productos.add(new Producto(100.0F, "Hamburguesa cl�sica", "Americano", 4L));
//        
//        productosCafeteria.add(new ProductoCafeteria(50.0F, "Torta cubana", "Deliciosa", 15,"torta-cubana.jpg"));
////        productosCafeteria.add(new ProductoCafeteria(100.0F, "Pizza de pepperoni", "Italiana", 15, "pizza-pepperoni.jpg"));
////        productosCafeteria.add(new ProductoCafeteria(25.0F, "Tacos de discada", "Mexicano", 15, "tacos-discada.jpg"));
//        productosCafeteria.add(new ProductoCafeteria(100.0F, "Hamburguesa clásica", 15 , "hamburguesa-clasica.jpg"));
//        productosCafeteria.add(new ProductoCafeteria(100.0F, "Hamburguesa pollo", 50 , "hamburguesa-pollo.jpg"));
//        productosCafeteria.add(new ProductoCafeteria(100.0F, "Torta de milanesa", 10 , "torta-milanesa.jpg"));
//        productosCafeteria.add(new ProductoCafeteria(100.0F, "Torta cubana", 12 , "torta-cubana.jpg"));
//        productosCafeteria.add(new ProductoCafeteria(100.0F, "Sushi", 30 , "sushi.jpg"));
        
        productos.add(new Producto(50.0F, "Torta cubana", "Deliciosa","torta-cubana.jpg", 1L));
        productos.add(new Producto(100.0F, "Hamburguesa clásica","Americano","hamburguesa-clasica.jpg", 6L));
        productos.add(new Producto(100.0F, "Hamburguesa pollo","KFC", "hamburguesa-pollo.jpg", 2L));
        productos.add(new Producto(100.0F, "Torta de milanesa" ,"Pollo", "torta-milanesa.jpg", 4L));
        productos.add(new Producto(100.0F, "Sushi", "Fresco" , "sushi.jpg", 5L));
        emCafeteria.getTransaction().begin();
        for (Producto productoCafeteria : productos) {
            emCafeteria.persist(productoCafeteria);
        }
        emCafeteria.getTransaction().commit();
        emCafeteria.close();
    }

}

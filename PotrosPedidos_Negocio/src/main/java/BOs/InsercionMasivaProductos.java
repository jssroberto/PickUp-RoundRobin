/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

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

    public void Insercion() {
         EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("potrosPU");
        EntityManager emCafeteria = emfCafeteria.createEntityManager();
        productos.add(new Producto(50.0F, "Torta cubana", "Deliciosa", 1L));
        productos.add(new Producto(100.0F, "Pizza de pepperoni", "Italiana", 2L));
        productos.add(new Producto(25.0F, "Tacos de discada", "Mexicano", 3L));
        productos.add(new Producto(100.0F, "Hamburguesa cl�sica", "Americano", 4L));
        emCafeteria.getTransaction().begin();
        for (Producto productoCafeteria : productos) {
            emCafeteria.persist(productoCafeteria);
        }
        emCafeteria.getTransaction().commit();
        emCafeteria.close();
    }

}

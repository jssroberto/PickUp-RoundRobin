/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import cafeteria.ProductoCafeteria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaProductosCafeteriaBO {
    
    public void insercion(){
         EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("cafeteriaPU");
        EntityManager emCafeteria = emfCafeteria.createEntityManager();
        List<ProductoCafeteria> productosCafeteria = new ArrayList<>();
        productosCafeteria.add(new ProductoCafeteria(50.0F, "Torta cubana", "Deliciosa", 15));
        productosCafeteria.add(new ProductoCafeteria(100.0F, "Pizza de pepperoni", "Italiana", 15));
        productosCafeteria.add(new ProductoCafeteria(25.0F, "Tacos de discada", "Mexicano", 15));
        productosCafeteria.add(new ProductoCafeteria(100.0F, "Hamburguesa cl�sica", 15));
        emCafeteria.getTransaction().begin();
        for (ProductoCafeteria productoCafeteria : productosCafeteria) {
            emCafeteria.persist(productoCafeteria);
        }
        emCafeteria.getTransaction().commit();
        emCafeteria.close();
    }
    
}

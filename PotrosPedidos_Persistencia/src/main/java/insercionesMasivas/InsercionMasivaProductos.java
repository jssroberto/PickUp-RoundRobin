/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionesMasivas;

import com.mycompany.cafeteria.ProductoCafeteria;
import dominioVIEJO.Producto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaProductos {
    
    List<ProductoCafeteria> productoCafeterias = new LinkedList<>();
    
    public void insertarRegistros() throws Exception {
        EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("cafeteriaPU");
        
        EntityManager emCafeteria = emfCafeteria.createEntityManager();
        
        CriteriaBuilder criteriaBuilder = emCafeteria.getCriteriaBuilder();
        
        CriteriaQuery<ProductoCafeteria> criteriaQuery = criteriaBuilder.createQuery(ProductoCafeteria.class);
        
        Root<ProductoCafeteria> root = criteriaQuery.from(ProductoCafeteria.class);
        
        criteriaQuery.select(root);
        
        TypedQuery<ProductoCafeteria> typedQuery = emCafeteria.createQuery(criteriaQuery);
        
        productoCafeterias = typedQuery.getResultList();
        
        emCafeteria.close();
        
        if (productoCafeterias == null) {
            return;
        }
        
        EntityManagerFactory emfCafeteriaPotros = Persistence.createEntityManagerFactory("potrosPU");
        
        EntityManager emCafeteriaPotros = emfCafeteriaPotros.createEntityManager();
        
        emCafeteriaPotros.getTransaction().begin();
        
        for (ProductoCafeteria productoCafeteria : productoCafeterias) {
            Producto producto = new Producto(
                    productoCafeteria.getPrecio(),
                    productoCafeteria.getNombre(),
                    productoCafeteria.getDescripcion(),
                    productoCafeteria.getDireccionImagen(),
                    productoCafeteria.getId());
            emCafeteriaPotros.persist(producto);
        }
        
        emCafeteriaPotros.getTransaction().commit();
        
        emCafeteriaPotros.close();
    }
    
}

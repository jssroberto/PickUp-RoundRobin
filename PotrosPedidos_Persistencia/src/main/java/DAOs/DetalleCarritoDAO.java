/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author galan
 */
public class DetalleCarritoDAO {
    private EntityManager em;
    private EntityManagerFactory emf;
    private Carrito carito;

    public DetalleCarritoDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }
    
    
    public void insertarDetalleCarrito (DetalleCarrito detalleCarrito) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(detalleCarrito);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al insertar detalle carrito");
        }
    }
    
    public List<DetalleCarrito> buscarListaDetalleCarrito(Carrito carrito) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT dc FROM DetalleCarrito dc WHERE dc.carrito = :idCarrito";

            TypedQuery<DetalleCarrito> query = em.createQuery(jpql3, DetalleCarrito.class);
            query.setParameter("idCarrito", carrito);
            List<DetalleCarrito> detallesCarrito = query.getResultList();

            em.getTransaction().commit();
            em.close();
            
            if(!detallesCarrito.isEmpty()){
                return detallesCarrito;
            }else{
                throw new ExcepcionAT("Lista de productos no encontrado por su carrito");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}

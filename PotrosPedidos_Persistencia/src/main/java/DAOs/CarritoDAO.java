/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import cafeteria.ProductoCafeteria;
import dominio.Carrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.ExcepcionAT;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author USER
 */
public class CarritoDAO {
    private EntityManager em;
    private EntityManagerFactory emf;
    private Carrito carito;

    public CarritoDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }
    
    public void insertarProducto(Producto producto, Usuario usuario) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(producto);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al insertar producto al carrito");
        }
    }
    
    public void actualizarCarrito (Carrito producto) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(producto);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al actualizar producto");
        }
    }
    
    public ProductoCafeteria buscarCarritoPorUsuario (String nombreProducto) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM Producto p WHERE p.nombre = :nombre";

            TypedQuery<ProductoCafeteria> query = em.createQuery(jpql3, ProductoCafeteria.class);
            query.setParameter("nombre", nombreProducto);
            List<ProductoCafeteria> usuario = query.getResultList();

            em.getTransaction().commit();
            em.close();
            
            if(!usuario.isEmpty()){
                return usuario.get(0);
            }else{
                throw new ExcepcionAT("Producto no encontrado por su nombre");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}

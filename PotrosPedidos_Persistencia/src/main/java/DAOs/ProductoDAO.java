/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import dominio.Producto;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author USER
 */
public class ProductoDAO {
    private EntityManager em;
    private EntityManagerFactory emf;

    public ProductoDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }
    
    public void actualizarProducto (Producto producto) throws PersistenciaException{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(producto);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new PersistenciaException("Error al actualizar producto");
        }
    }
    
    public Producto buscarProductoPorNombre (String nombreProducto) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM Producto p WHERE p.nombre = :nombre";

            TypedQuery<Producto> query = em.createQuery(jpql3, Producto.class);
            query.setParameter("nombre", nombreProducto);
            List<Producto> producto = query.getResultList();

            em.getTransaction().commit();
            em.close();
            
            if(!producto.isEmpty()){
                return producto.get(0);
            }else{
                throw new PersistenciaException("Producto no encontrado por su nombre");
            }
        } catch (PersistenciaException e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}

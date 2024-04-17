package org.itson.disenosw.prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.disenosw.dominio.Producto;

/**
 *
 * @author Roberto García
 */
public class PruebaConsulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");

        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Producto> cq = cb.createQuery(Producto.class);

        Root<Producto> root = cq.from(Producto.class);

        cq.select(root).where(cb.equal(root.get("id"), 1));

        TypedQuery<Producto> query = em.createQuery(cq);

        Producto producto = query.getSingleResult();

        em.close();

        System.out.println(producto.getDireccionImagen());
        
    }

}

package org.itson.disenosw.prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.disenosw.dominio.Usuario;

/**
 *
 * @author Roberto García
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("sdfads", "Albertano", "Cocs", "Tags");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(usuario);
        
        em.getTransaction().commit();
        
        em.close();
        
    }

}

package org.itson.disenosw.prueba;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.disenosw.dominio.Producto;
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
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario(1234599l, "c1", "Juan", "Pérez", "García"));
        listaUsuarios.add(new Usuario(2345532l, "c2", "María", "López", "Fernández"));
        listaUsuarios.add(new Usuario(1222356l, "c3", "Pedro", "González", "Martínez"));
        listaUsuarios.add(new Usuario(244903l, "madero", "jose", "madero", "lopez"));
        listaUsuarios.add(new Usuario(1254532l, "c5", "Carlos", "Martínez", "Díaz"));
        listaUsuarios.add(new Usuario(2352322l, "c6", "Laura", "Gómez", "Muñoz"));
        listaUsuarios.add(new Usuario(2324244l, "c7", "Francisco", "Hernández", "Jiménez"));
        listaUsuarios.add(new Usuario(2342555l, "c8", "Sofía", "Pérez", "Ruiz"));
        listaUsuarios.add(new Usuario(5566422l, "c9", "Diego", "Sánchez", "López"));
        listaUsuarios.add(new Usuario(1214566l, "c10", "Elena", "Fernández", "García"));
        listaUsuarios.add(new Usuario(9786645l, "c11", "Gabriel", "López", "Martínez"));
        listaUsuarios.add(new Usuario(5685855l, "c12", "Laura", "García", "Hernández"));
        listaUsuarios.add(new Usuario(4744333l, "c13", "Fernando", "Díaz", "Pérez"));
        listaUsuarios.add(new Usuario(4568888l, "c14", "Carolina", "Rodríguez", "Gómez"));
        listaUsuarios.add(new Usuario(4774444l, "c15", "Manuel", "Sánchez", "Fernández"));
        listaUsuarios.add(new Usuario(3636778l, "c16", "Sara", "Martínez", "López"));
        listaUsuarios.add(new Usuario(6344634l, "c17", "Pedro", "González", "Ruiz"));
        listaUsuarios.add(new Usuario(244907l, "yohan", "yohan", "melendrez", "leal"));
        listaUsuarios.add(new Usuario(244913l, "tito", "jesus", "garcia", "armenta"));
        listaUsuarios.add(new Usuario(244752l, "pablo", "Pablo", "galan", "valenzuela"));
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(90.0f, "Hamburguesa Clasica", "Descripción de la Hamburguesa Clasica", 10));
        productos.add(new Producto(75.0f, "Torta cubana", "Descripción de la Torta cubana", 10));
        productos.add(new Producto(100.0f, "Sushi", "Descripción del Sushi", 10));
        productos.add(new Producto(20.0f, "Coca-cola", "Descripción de la Coca-cola", 10));
        productos.add(new Producto(90.0f, "Hamburguesa de pollo", "Descripción de la Hamburguesa de pollo", 10));
        productos.add(new Producto(55.0f, "Sandwich", "Descripción del Sandwich", 10));
        productos.add(new Producto(15.0f, "Jamaica", "Descripción de la Jamaica", 10));
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        for (Usuario usuario : listaUsuarios) {
            em.persist(usuario);
        }
        for (Producto producto : productos) {
            em.persist(producto);
        }
        em.getTransaction().commit();

        em.close();

    }

}

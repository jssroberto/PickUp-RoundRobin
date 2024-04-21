package prueba;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import banco.Tarjeta;
import CIA.UsuarioCIA;
import cafeteria.ProductoCafeteria;
import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.Usuario;

/**
 *
 * @author Roberto García
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "Perez", "Garcia"));
        usuarios.add(new Usuario("Maria", "Lopez", "Martinez"));
        usuarios.add(new Usuario("Pedro", "Gonzalez", "Santos"));
        usuarios.add(new Usuario("Ana", "Rodriguez", "Fernandez"));
        usuarios.add(new Usuario("Luis", "Martinez", "Diaz"));
        

        List<UsuarioCIA> usuariosCIA = new ArrayList<>();
        usuariosCIA.add(new UsuarioCIA("00000011211", "ABC12345", "Juan", "Perez", "Garcia"));
        usuariosCIA.add(new UsuarioCIA("00000244454", "DEF67890", "Maria", "Lopez", "Martinez"));
        usuariosCIA.add(new UsuarioCIA("00000046574", "GHI13579", "Pedro", "Gonzalez", "Santos"));
        usuariosCIA.add(new UsuarioCIA("00000240157", "JKL24680", "Ana", "Rodriguez", "Fernandez"));
        usuariosCIA.add(new UsuarioCIA("00000244978", "MNO97531", "Luis", "Martinez", "Diaz"));
        

        List<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new Tarjeta("4696-1641-7464-6464", YearMonth.of(2050, 3), 754));
        tarjetas.add(new Tarjeta("4696-6542-7464-6464", YearMonth.of(2040, 1), 475));
        tarjetas.add(new Tarjeta("4696-1641-6546-6464", YearMonth.of(2035, 10), 277));
        tarjetas.add(new Tarjeta("4696-1641-7464-6541", YearMonth.of(2030, 12), 341));
        tarjetas.add(new Tarjeta("1545-1641-7464-6464", YearMonth.of(2034, 9), 734));
        
        
        List<ProductoCafeteria> productos = new ArrayList<>();
        productos.add(new ProductoCafeteria(50.0F, "Torta cubana", "Deliciosa", 15));
        productos.add(new ProductoCafeteria(100.0F, "Pizza de pepperoni", "Italiana", 15));
        productos.add(new ProductoCafeteria(25.0F, "Tacos de discada", "Mexicano", 15));
        productos.add(new ProductoCafeteria(100.0F, "Hamburguesa clásica", 15));
        
        Carrito carrito= new Carrito(0.0F, 0, usuarios.get(0));
        DetalleCarrito detalleCarrito= new DetalleCarrito(carrito, productos.get(0), 2, 100.0F);
        carrito.setCantidadProductos(2);
        carrito.setTotal(100.0F);


        EntityManagerFactory emfConexion = Persistence.createEntityManagerFactory("conexionPU");
        EntityManagerFactory emfCIA = Persistence.createEntityManagerFactory("ciaPU");
        EntityManagerFactory emfBanco = Persistence.createEntityManagerFactory("bancoPU");
        EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("cafeteriaPU");

        EntityManager emConexion = emfConexion.createEntityManager();
        EntityManager emCIA = emfCIA.createEntityManager();
        EntityManager emBanco = emfBanco.createEntityManager();
        EntityManager emCafeteria = emfCafeteria.createEntityManager();

        emConexion.getTransaction().begin();
        for (Usuario usuario : usuarios) {
            emConexion.persist(usuario);
        }

        emCIA.getTransaction().begin();
        for (UsuarioCIA usuarioCIA : usuariosCIA) {
            emCIA.persist(usuarioCIA);
        }
        emCIA.getTransaction().commit();
        emCIA.close();

        emBanco.getTransaction().begin();
        for (Tarjeta tarjeta : tarjetas) {
            emBanco.persist(tarjeta);
        }
        emBanco.getTransaction().commit();
        emBanco.close();
        
        emCafeteria.getTransaction().begin();
        for (ProductoCafeteria producto : productos) {
            emCafeteria.persist(producto);
        }
        emCafeteria.getTransaction().commit();
        emCafeteria.close();

        emConexion.persist(carrito);
        emConexion.persist(detalleCarrito);

    }

}

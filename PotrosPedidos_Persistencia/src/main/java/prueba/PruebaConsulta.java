package prueba;

import DAOs.UsuarioDAO;
import dominio.Carrito;
import dominio.DetalleProducto;
import dominio.Producto;
import dominio.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.bson.types.ObjectId;


/**
 *
 * @author Roberto García
 */
public class PruebaConsulta {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexionPU");

        EntityManager em = emf.createEntityManager();

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//
//        CriteriaQuery<ProductoCafeteria> cq = cb.createQuery(ProductoCafeteria.class);
//
//        Root<ProductoCafeteria> root = cq.from(ProductoCafeteria.class);
//
//        cq.select(root).where(cb.equal(root.get("id"), 1));
//
//        TypedQuery<ProductoCafeteria> query = em.createQuery(cq);
//
//        ProductoCafeteria producto = query.getSingleResult();
//
//        em.close();
//        System.out.println(producto.getDireccionImagen());
//
//        
//        File file = new File(producto.getDireccionImagen());
//        
//        System.out.println(file.getAbsolutePath());
//        
//        try {
////            BufferedImage bufferedImage = ImageIO.read(new File(producto.getDireccionImagen()));
//
////            Image image = 
//            
//            ImageInfo imageInfo = Imaging.getImageInfo(new File(producto.getDireccionImagen()));
////            System.out.println("Formato: " + imageInfo.getFormatName());
////            System.out.println("Ancho: " + imageInfo.getWidth());
////            System.out.println("Alto: " + imageInfo.getHeight());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
          
        UsuarioDAO user = new UsuarioDAO();
        
        
        
        List<ObjectId> pedidos = new ArrayList<>();
        pedidos.add(new ObjectId());
        pedidos.add(new ObjectId());
        List<DetalleProducto> productos = new ArrayList<>();
        productos.add(new DetalleProducto(new ObjectId(), 2, 0.0f, new Producto(new ObjectId(), "asdasd", 50.0f, "afasfa", "afasfaf")));
        
        
        
        Usuario usuario = new Usuario("0000000","a", "s", "aa", new Date(1544492400000L), new Carrito(new ObjectId(),0.0f, productos),2, pedidos);
        productos.add(new DetalleProducto(new ObjectId(), 2, 0.0f, new Producto(new ObjectId(), "asdfasasdadfaf", 100.0f, "fafafsafasdasdadasf", "asdasdasd")));
        Usuario usuario2 = new Usuario("0000000","a", "s", "aa", new Date(1544492400000L), new Carrito(new ObjectId(),0.0f, productos),2, pedidos);
//        user.persistir(usuario);
        
        user.agregarDetalleProductoAlCarrito(user.consultarUsuario("0000000").getId(), new DetalleProducto(2, 100.0f, new Producto("aSasaSasA", 1111.0f, "adDA", "asdasddad")));
            
    

}
}

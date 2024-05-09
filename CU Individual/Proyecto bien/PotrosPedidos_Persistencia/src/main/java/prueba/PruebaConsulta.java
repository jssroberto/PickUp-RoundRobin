package prueba;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import cafeteria.ProductoCafeteria;

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
          
        

    }

}

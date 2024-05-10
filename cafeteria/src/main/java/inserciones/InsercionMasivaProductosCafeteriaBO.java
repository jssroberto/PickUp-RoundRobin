package inserciones;

import dominio.ProductoCafeteria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaProductosCafeteriaBO {

    public void insertarRegistros() throws Exception {
        EntityManagerFactory emfCafeteria = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager emCafeteria = emfCafeteria.createEntityManager();
        List<ProductoCafeteria> productosCafeteria = new ArrayList<>();
        productosCafeteria.add(new ProductoCafeteria("HACLAS", 80.0F, "Hamburguesa clásica", "Hamburguesa con carne, queso y verdura, acompañada de papas a la francesa", 15, "hamburguesa-clasica.png"));
        productosCafeteria.add(new ProductoCafeteria("HAPOLL", 85.0F, "Hamburguesa pollo", "Hamburguesa con pollo empanizado, queso y verdura, acompañada de papas a la francesa", 50, "hamburguesa-pollo.png"));
        productosCafeteria.add(new ProductoCafeteria("TOMILA", 65.0F, "Torta de milanesa", "Torta con milanesa de res, queso verdura y aguacate", 15, "torta-milanesa.png"));
        productosCafeteria.add(new ProductoCafeteria("TOCUBA", 70.0F, "Torta cubana", "Torta con jamón, queso, carne de puerco, verdura y aguacate", 15, "torta-cubana.png"));
        productosCafeteria.add(new ProductoCafeteria("SUCAMA", 100.0F, "Sushi de camarón", "Sushi empanizado de camarón con alga, aguacate, pepino y philadelphia", 30, "sushi.png"));
        productosCafeteria.add(new ProductoCafeteria("SANDWI", 60.0F, "Sandwich", "Sandwich con jamón de pavo, queso y verdura", 30, "sandwich.png"));
        productosCafeteria.add(new ProductoCafeteria("JAMAIC", 20.0F, "Jamaica", "Jamaica natural de 500ml", 50, "jamaica.png"));
        productosCafeteria.add(new ProductoCafeteria("COCOLA", 25.0F, "Coca-Cola", "Coca-Cola regular en lata de 355ml", 40, "coca-cola-regular.png"));
        productosCafeteria.add(new ProductoCafeteria("COLIGH", 25.0F, "Coca-Cola light", "Coca-Cola light en lata de 355ml", 40, "coca-cola-light.png"));
        productosCafeteria.add(new ProductoCafeteria("COZERO", 25.0F, "Coca-Cola zero", "Coca-Cola zero en lata de 355ml", 40, "coca-cola-zero.png"));
        emCafeteria.getTransaction().begin();
        for (ProductoCafeteria productoCafeteria : productosCafeteria) {
            emCafeteria.persist(productoCafeteria);
        }
        emCafeteria.getTransaction().commit();
        emCafeteria.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionesMasivas;

import banco.Tarjeta;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaBanco {

    public void insertarRegistros() {
        List<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new Tarjeta("4696-1641-7464-6464", YearMonth.of(2030, 9), 754));
        tarjetas.add(new Tarjeta("4696-6542-7464-6464", YearMonth.of(2035, 2), 475));
        tarjetas.add(new Tarjeta("4696-1641-6546-6464", YearMonth.of(2032, 1), 277));
        tarjetas.add(new Tarjeta("4696-1641-7464-6541", YearMonth.of(2027, 11), 341));
        tarjetas.add(new Tarjeta("1545-1641-7464-6464", YearMonth.of(2025, 9), 734));
        EntityManagerFactory emfBanco = Persistence.createEntityManagerFactory("bancoPU");
        EntityManager emBanco = emfBanco.createEntityManager();
        emBanco.getTransaction().begin();
        for (Tarjeta tarjeta : tarjetas) {
            emBanco.persist(tarjeta);
        }
        emBanco.getTransaction().commit();
        emBanco.close();

    }
}

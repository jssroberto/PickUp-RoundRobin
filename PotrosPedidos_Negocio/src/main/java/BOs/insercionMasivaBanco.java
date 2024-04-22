/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import banco.Tarjeta;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class insercionMasivaBanco {
    
    public void insercion(){
        List<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new Tarjeta("4696-1641-7464-6464", new GregorianCalendar(2050, 3,31), 754));
        tarjetas.add(new Tarjeta("4696-6542-7464-6464", new GregorianCalendar(2040, 3,31), 475));
        tarjetas.add(new Tarjeta("4696-1641-6546-6464", new GregorianCalendar(2030, 3,31), 277));
        tarjetas.add(new Tarjeta("4696-1641-7464-6541", new GregorianCalendar(2025, 3,31), 341));
        tarjetas.add(new Tarjeta("1545-1641-7464-6464", new GregorianCalendar(2028, 3,31), 734));
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

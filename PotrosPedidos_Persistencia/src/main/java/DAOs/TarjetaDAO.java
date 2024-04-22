/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import CIA.UsuarioCIA;
import banco.Tarjeta;
import excepciones.ExcepcionAT;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author USER
 */
public class TarjetaDAO {

    private EntityManager em;
    private EntityManagerFactory emf;

    public TarjetaDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }

    public Boolean BuscarTarjeta(String numeroTarjeta) throws ExcepcionAT {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tarjeta> cq = cb.createQuery(Tarjeta.class);
        Root<Tarjeta> root = cq.from(Tarjeta.class);

        Predicate predicado = cb.equal(root.get("numeroTarjeta"), numeroTarjeta);
        cq.select(root).where(predicado);

        Tarjeta tarjeta = null;
        try {
            tarjeta = em.createQuery(cq).getSingleResult();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

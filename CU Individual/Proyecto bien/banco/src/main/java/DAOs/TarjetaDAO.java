/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dominio.Tarjeta;
import excepciones.BancoException;
import interfaces.ITarejaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author jl4ma
 */
public class TarjetaDAO implements ITarejaDAO{
    private EntityManager em;
    private EntityManagerFactory emf;

    public TarjetaDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean BuscarTarjeta(String numeroTarjeta) throws BancoException {
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

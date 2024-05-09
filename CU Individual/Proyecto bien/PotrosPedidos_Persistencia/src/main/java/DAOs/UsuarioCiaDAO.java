/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ICiaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import CIA.UsuarioCIA;

/**
 *
 * @author yohan
 */
public class UsuarioCiaDAO implements ICiaDAO {

    private EntityManager em;

    public UsuarioCiaDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ciaPU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean BuscarPersona(String idEstudiante, String contra) throws Exception {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UsuarioCIA> cq = cb.createQuery(UsuarioCIA.class);
        Root<UsuarioCIA> root = cq.from(UsuarioCIA.class);

        Predicate predicadoId = cb.equal(root.get("idEstudiante"), idEstudiante);
        Predicate predicadoContra = cb.equal(root.get("contrasena"), contra);
        Predicate predicado = cb.and(predicadoId, predicadoContra);
        cq.select(root).where(predicado);

        UsuarioCIA usuario = null;
        try {
            usuario = em.createQuery(cq).getSingleResult();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}

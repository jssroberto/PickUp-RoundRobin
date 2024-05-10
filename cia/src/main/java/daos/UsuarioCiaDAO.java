/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dominio.UsuarioCIA;
import excepciones.CIAException;
import interfaces.IUsuarioCiaDAO;
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
public class UsuarioCiaDAO implements IUsuarioCiaDAO{
    private EntityManager em;
    private EntityManagerFactory emf;
    
    public UsuarioCiaDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
        em = emf.createEntityManager();
    }

    @Override
    public Boolean BuscarPersona(String idEstudiante, String contra) throws CIAException {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UsuarioCIA> cq = cb.createQuery(UsuarioCIA.class);
        Root<UsuarioCIA> root = cq.from(UsuarioCIA.class);

        Predicate predicadoId = cb.equal(root.get("idEstudiante"), idEstudiante);
        Predicate predicadoContra = cb.equal(root.get("contrasena"), contra);
        Predicate predicado = cb.and(predicadoId, predicadoContra);
        cq.select(root).where(predicado);

        try {
            em.createQuery(cq).getSingleResult();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

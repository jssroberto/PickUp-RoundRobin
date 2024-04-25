/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IUsuarioDAO;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author USER
 */
public class UsuarioDAO implements IUsuarioDAO {

    private EntityManager em;
    private EntityManagerFactory emf;
    private Usuario usuario;

    public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }

    public void registrarUsuario(Usuario usuario) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(usuario);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new PersistenciaException("Error al registrar usuario");
        }
    }

    public void actualizarUsuario(Usuario usuario) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(usuario);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new PersistenciaException("Error al actualizar persona");
        }
    }

    public Usuario buscarUsuarioPorIdCIA(String idUsuarioCia) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT u FROM Usuario u WHERE u.idUsuarioCia= :idUsuarioCia";

            TypedQuery<Usuario> query = em.createQuery(jpql3, Usuario.class);
            query.setParameter("idUsuarioCia", idUsuarioCia);
            List<Usuario> usuario = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!usuario.isEmpty()) {
                return usuario.get(0);
            } else {
                throw new PersistenciaException("Usuario no encontrado por su ID");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    public List<Usuario> obtenerListaUsuarios() throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT u FROM Usuario u";

            TypedQuery<Usuario> query = em.createQuery(jpql3, Usuario.class);
            List<Usuario> usuarios = query.getResultList();

            em.getTransaction().commit();
            em.close();

            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException("Error al obtener la lista de usuarios: " + e.getMessage());
        }
    }
    
    

}

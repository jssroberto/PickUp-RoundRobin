/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pc
 */
public class conexion  {

    public EntityManager conexion()  {
        EntityManagerFactory entity = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entity.createEntityManager();
        return entityManager;
    }
}
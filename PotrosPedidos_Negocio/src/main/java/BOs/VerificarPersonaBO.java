/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import daos.UsuarioCiaDAO;
import interfaces.ICiaDAO;
import excepciones.PersistenciaException;

/**
 *
 * @author yohan
 */
public class VerificarPersonaBO {

    ICiaDAO cia = new UsuarioCiaDAO();
//    

    public Boolean buscarPersona(String id, String contra) throws PersistenciaException {
        try {
            return cia.BuscarPersona(id, contra);
        } catch (Exception e) {
            throw new PersistenciaException(e.getMessage());
        }
    }
}

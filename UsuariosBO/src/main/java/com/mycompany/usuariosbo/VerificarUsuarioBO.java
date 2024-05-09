package com.mycompany.usuariosbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAOs.UsuarioCiaDAO;
import IDAOs.ICiaDAO;
import excepciones.PersistenciaException;

/**
 *
 * @author yohan
 */
public class VerificarUsuarioBO {

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

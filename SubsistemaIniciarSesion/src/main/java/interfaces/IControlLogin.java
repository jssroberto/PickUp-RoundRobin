/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import excepciones.SubsistemaException;

/**
 *
 * @author jl4ma
 */
public interface IControlLogin {
    
    public boolean validacionDatos(String idEstudiante, String contra) throws SubsistemaException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import excepciones.PersitenciaException;
import interfaces.IControlTarjeta;
import metodos.ValidarCompraTarjeta;
import metodos.ValidarDatosTarjetas;

/**
 *
 * @author jl4ma
 */
public class ControlTarjeta implements IControlTarjeta{
    
    ValidarCompraTarjeta compra = new ValidarCompraTarjeta();
    ValidarDatosTarjetas datos = new ValidarDatosTarjetas();
    
    public boolean validarDatos(String numeroTarjeta) throws PersitenciaException{
        
        if (datos.validarDatos(numeroTarjeta)) {
            return true;
        }else{
            return false;
        }
    }
}

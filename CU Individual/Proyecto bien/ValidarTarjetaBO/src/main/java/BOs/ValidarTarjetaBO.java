/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.TarjetaDAO;
import excepciones.PersitenciaException;
import interfaces.ITarejaDAO;
import interfaces.IValidarTarjetaBO;

/**
 *
 * @author jl4ma
 */
public class ValidarTarjetaBO implements IValidarTarjetaBO{
    
   ITarejaDAO tarjeta = new TarjetaDAO(); 
   
   @Override
   public boolean validarDatos(String numeroTarjeta) throws PersitenciaException{
       
       if (tarjeta.BuscarTarjeta(numeroTarjeta)) {
           return true;
       }else{
           throw new PersitenciaException("Tarjeta no encontrada");
       }
   }
}

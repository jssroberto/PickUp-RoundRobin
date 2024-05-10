/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import BOs.ValidarTarjetaBO;
import excepciones.BancoException;
import interfaces.IValidarTarjetaBO;
import javax.swing.JOptionPane;

/**
 *
 * @author jl4ma
 */
public class ValidarDatosTarjetas {
    
    IValidarTarjetaBO tarjeta = new ValidarTarjetaBO();
    
    public boolean validarDatos(String numeroTarjeta) throws BancoException{
        if(tarjeta.validarDatos(numeroTarjeta)){
            JOptionPane.showMessageDialog(null, "Datos Validos");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Tarjeta no encontrada");
            return false;
        }
    }
}

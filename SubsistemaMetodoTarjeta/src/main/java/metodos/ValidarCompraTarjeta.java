/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import BOs.ValidarTarjetaBO;
import dominio.Tarjeta;
import interfaces.IValidarTarjetaBO;
import javax.swing.JOptionPane;



/**
 *
 * @author jl4ma
 */
public class ValidarCompraTarjeta {
    
    IValidarTarjetaBO tarjeta;
    public ValidarCompraTarjeta(){
        tarjeta = new ValidarTarjetaBO();
    }
    
    public boolean validacionCompra(String num, float total){
        Tarjeta tar = tarjeta.consultar(num);
        float saldo = tar.getSaldo()-total;
        
        if (saldo >=0) {
             JOptionPane.showMessageDialog(null, "Pago Aceptado");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Pago Rechazado");
            return false;
        }
        
    }
}

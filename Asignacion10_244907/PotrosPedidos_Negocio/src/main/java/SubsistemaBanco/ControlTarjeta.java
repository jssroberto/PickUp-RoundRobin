/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import BOs.validarTarjetaBO;
import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class ControlTarjeta {

    validarTarjetaBO b = new validarTarjetaBO();

    public boolean validarTarjeta(String nombre, String cvv) throws ExcepcionAT {
        try {
            return  b.validarTarjeta(nombre, cvv);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }

}

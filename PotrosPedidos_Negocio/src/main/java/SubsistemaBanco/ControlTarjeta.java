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
     validarTarjetaBO vb = new validarTarjetaBO();

    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws ExcepcionAT {

        try {
            return vb.ValidarBanco(tarjeta);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}

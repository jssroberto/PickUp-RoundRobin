/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import BOs.validarTarjetaBO;
import excepciones.PersistenciaException;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class ControlTarjeta {
     validarTarjetaBO vb = new validarTarjetaBO();

    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws PersistenciaException {

        try {
            return vb.ValidarBanco(tarjeta);
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }
}

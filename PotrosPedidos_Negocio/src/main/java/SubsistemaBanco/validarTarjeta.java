/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import excepciones.PersistenciaException;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class validarTarjeta implements IValidarTarjeta {

    ControlTarjeta control = new ControlTarjeta();

    @Override
    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws PersistenciaException {
        try {
            return control.ValidarTarjeta(tarjeta);
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }
}

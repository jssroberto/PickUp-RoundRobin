/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class validarTarjeta implements IValidarTarjeta {

    ControlTarjeta control = new ControlTarjeta();

    @Override
    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws ExcepcionAT {

        try {
            return control.ValidarTarjeta(tarjeta);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}

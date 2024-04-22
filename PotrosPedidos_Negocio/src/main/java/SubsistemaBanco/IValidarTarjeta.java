/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaBanco;

import SubsistemaCIA.*;
import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public interface IValidarTarjeta {

    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws ExcepcionAT;
}

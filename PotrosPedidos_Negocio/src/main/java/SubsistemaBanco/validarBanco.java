/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import SubsistemaCIA.*;
import mocks.Usuario;
import mocks.Banco;
import java.util.List;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class validarBanco implements IValidarBanco {

validarBancoBO vb = new validarBancoBO();

    @Override
    public Boolean ValidarBanco(TarjetaDTO tarjeta) {
   
        return vb.ValidarBanco(tarjeta.getNombre(), tarjeta.getNumeroTarjeta(), tarjeta.getFechaVencimiento().toString(), Integer.toString(tarjeta.getCvv()));
    }
}

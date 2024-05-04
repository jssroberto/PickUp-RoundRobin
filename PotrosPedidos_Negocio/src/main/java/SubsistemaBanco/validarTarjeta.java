/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import excepciones.PersistenciaException;
import java.util.List;
import mocks.Banco;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class validarTarjeta implements IValidarTarjeta {

//    ControlTarjeta control = new ControlTarjeta();
//
//    @Override
//    public Boolean ValidarTarjeta(TarjetaDTO tarjeta) throws PersistenciaException {
//        try {
//            return control.ValidarTarjeta(tarjeta);
//        } catch (PersistenciaException e) {
//            throw new PersistenciaException(e.getMessage());
//        }
//    }
    
    public boolean validarDatos(TarjetaDTO tarjeta){
        Banco subsistemaBanco = new Banco();
        subsistemaBanco.generarLista();
        List<Banco> listaTarjetas = subsistemaBanco.getListaBanco();
        
        for(Banco b: listaTarjetas){
        if((b.getNombre().equalsIgnoreCase(tarjeta.getNombre())) && (b.getNumero().equalsIgnoreCase(tarjeta.getNumeroTarjeta())) && (b.getCvv().equalsIgnoreCase(String.valueOf(tarjeta.getCvv())))){
            return true;
        }
        }
        
        return false;
        
    }
}

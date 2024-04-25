/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.TarjetaDAO;
import excepciones.PersistenciaException;
import java.util.List;
import mocks.Banco;
import org.itson.disenosw.dtos.TarjetaDTO;

/**
 *
 * @author yohan
 */
public class validarTarjetaBO {

    private TarjetaDAO tarjeta = new TarjetaDAO();

    public validarTarjetaBO() {
    }

    public Boolean ValidarBanco(TarjetaDTO t) throws PersistenciaException {
        try {
            return tarjeta.BuscarTarjeta(t.getNumeroTarjeta());

        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());

        }
    }
}

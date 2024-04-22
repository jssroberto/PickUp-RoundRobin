/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.TarjetaDAO;
import excepciones.ExcepcionAT;
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

    public Boolean ValidarBanco(TarjetaDTO t) throws ExcepcionAT {
        try {
            return tarjeta.BuscarTarjeta(t.getNumeroTarjeta());

        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());

        }
    }
}

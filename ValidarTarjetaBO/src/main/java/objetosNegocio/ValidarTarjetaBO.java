/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import daos.TarjetaDAO;
import excepciones.BOException;
import excepciones.BancoException;
import interfaces.ITarejaDAO;
import interfaces.IValidarTarjetaBO;

/**
 *
 * @author jl4ma
 */
public class ValidarTarjetaBO implements IValidarTarjetaBO {

    ITarejaDAO tarjeta = new TarjetaDAO();

    @Override
    public boolean validarDatos(String numeroTarjeta) throws BOException {

        try {
            if (tarjeta.BuscarTarjeta(numeroTarjeta)) {
                return true;
            } else {
                throw new BancoException("Tarjeta no encontrada");

            }
        } catch (BancoException e) {
            throw new BOException(e.getMessage(), e);
        }
    }
}

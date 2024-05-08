/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.TarjetaDAO;
import IDAOs.ITarjetaDAO;
import excepciones.ExcepcionAT;

/**
 *
 * @author yohan
 */
public class validarTarjetaBO {

    ITarjetaDAO t = new TarjetaDAO();

    public validarTarjetaBO() {
    }

    public Boolean validarTarjeta(String numero, String cvv) throws ExcepcionAT {
        if (t.BuscarTarjeta(numero, cvv) == null) {
            throw new ExcepcionAT("El numero y el cvv  de la tarjeta estan mal");
        } else {
            return true;
        }
    }

}

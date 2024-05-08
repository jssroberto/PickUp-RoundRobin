/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import excepciones.ExcepcionAT;
import mocks.Banco;

/**
 *
 * @author jl4ma
 */
public interface ITarjetaDAO {
        public Banco BuscarTarjeta(String numero,String cvv) throws ExcepcionAT ;

}

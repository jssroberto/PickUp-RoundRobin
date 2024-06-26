/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Tarjeta;
import excepciones.PersitenciaException;

/**
 *
 * @author jl4ma
 */
public interface ITarejaDAO {
    
    public Boolean BuscarTarjeta(String numeroTarjeta) throws PersitenciaException;
    public Tarjeta consultarTarjeta(String num);
}

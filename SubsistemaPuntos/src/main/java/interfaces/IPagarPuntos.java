/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Usuario;

/**
 *
 * @author galan
 */
public interface IPagarPuntos {
    public boolean PagarPuntos(Usuario usuario, Integer puntosPagar, Integer puntosGenera) throws Exception;
}

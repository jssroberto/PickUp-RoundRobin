/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import control.ControlPagarPuntos;
import dominio.Usuario;
import interfaces.IPagarPuntos;

/**
 *
 * @author galan
 */
public class PagarPuntos implements IPagarPuntos{
    ControlPagarPuntos control= new ControlPagarPuntos();
    
    @Override
    public boolean PagarPuntos(Usuario usuario, Integer puntosPagar, Integer puntosGenera) throws Exception {
        return control.PagarPuntos(usuario, puntosPagar, puntosGenera);
    }  
}

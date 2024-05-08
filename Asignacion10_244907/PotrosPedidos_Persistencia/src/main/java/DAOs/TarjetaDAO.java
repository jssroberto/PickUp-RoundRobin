/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ITarjetaDAO;
import excepciones.ExcepcionAT;
import mocks.Banco;
import mocks.Usuario;


/**
 *
 * @author USER
 */
public class TarjetaDAO implements ITarjetaDAO {

   
    Banco b = new Banco();

    public TarjetaDAO() {
        b.generarLista();

    }

    @Override
    public Banco BuscarTarjeta(String numero,String cvv) throws ExcepcionAT {
    if (numero==null || cvv==null) {
        
        return null;
    }
        for (Banco t : b.getListaBanco()) {
            if (numero.equalsIgnoreCase(t.getNumero())&&cvv.equalsIgnoreCase(t.getCvv())) {
                return t;
            }
        }

        return null;
    }
}



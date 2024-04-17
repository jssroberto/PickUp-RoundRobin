/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaBanco;

import java.util.List;
import mocks.Banco;

/**
 *
 * @author yohan
 */
public class validarBancoBO {
     private List<Banco> banco;

    public validarBancoBO(List<Banco> banco) {
        this.banco = banco;
    }

    
    public Boolean ValidarBanco(String nombre, String numero, String fecha, String cvv) {
        if (banco == null) {
            return false;
        }
        for (Banco b : banco) {
            if (b.getNombre().equals(nombre) && b.getNumero().equals(numero)&& b.getFecha().equals(fecha) && b.getCvv().equals(cvv)) {
                return true;
            }
        }
        return false;
    }
}

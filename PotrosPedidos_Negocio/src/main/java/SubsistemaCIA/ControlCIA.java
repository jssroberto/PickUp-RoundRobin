/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import BOs.VerificarPersonaBO;


/**
 *
 * @author yohan
 */
public class ControlCIA {

    
    public ControlCIA() {
    }
    
    public Boolean ValidarPersona(String ID, String contra) throws Exception{
        if (ID == null) {
            return false;
        }
        if (contra == null) {
            return false;
        }
        VerificarPersonaBO vp = new VerificarPersonaBO();
        
        return vp.buscarPersona(ID, contra);
    }
}

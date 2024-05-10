/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author jl4ma
 */
public class CIAException extends Exception{

    public CIAException() {
    }

    public CIAException(String message) {
        super(message);
    }

    public CIAException(String message, Throwable cause) {
        super(message, cause);
    }
}

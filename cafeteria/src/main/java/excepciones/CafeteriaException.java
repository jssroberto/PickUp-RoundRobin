/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author jl4ma
 */
public class CafeteriaException extends Exception{

    public CafeteriaException() {
    }

    public CafeteriaException(String message) {
        super(message);
    }

    public CafeteriaException(String message, Throwable cause) {
        super(message, cause);
    }
}

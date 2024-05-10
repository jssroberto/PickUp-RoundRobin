package excepciones;

/**
 *
 * @author jl4ma
 */
public class BancoException extends Exception{

    public BancoException() {
    }

    public BancoException(String message) {
        super(message);
    }

    public BancoException(String message, Throwable cause) {
        super(message, cause);
    }
}

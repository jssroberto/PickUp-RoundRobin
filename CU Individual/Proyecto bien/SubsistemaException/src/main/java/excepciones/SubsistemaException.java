package excepciones;

/**
 *
 * @author Roberto García
 */
public class SubsistemaException extends Exception {

    public SubsistemaException() {
    }

    public SubsistemaException(String message) {
        super(message);
    }

    public SubsistemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SubsistemaException(Throwable cause) {
        super(cause);
    }

}

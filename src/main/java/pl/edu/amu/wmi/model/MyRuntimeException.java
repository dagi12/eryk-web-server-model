package pl.edu.amu.wmi.model;

/**
 * Stworzone przez Eryk Mariankowski dnia 22.06.18.
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }

    public MyRuntimeException(Exception e) {
        super(e);
    }

    public MyRuntimeException(String message, Exception e) {
        super(message, e);
    }
}

package pl.edu.amu.wmi.model;

/**
 * Stworzone przez Eryk Mariankowski dnia 16.12.17.
 */
public class GeneralResponse<T> {

    protected boolean isDone = true;
    private String errorMessage;
    private T item;

    public GeneralResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.isDone = false;
    }

    public GeneralResponse(T item) {
        this.item = item;
    }

    public GeneralResponse(T item, boolean isDone) {
        this.item = item;
        this.isDone = isDone;
    }

    public GeneralResponse() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

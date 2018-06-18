package pl.edu.amu.wmi.model;

/**
 * Stworzone przez Eryk Mariankowski dnia 16.12.17.
 */
public class GeneralResponse {

    protected boolean isDone = true;
    private String errorMessage;
    private Object item;

    public GeneralResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.isDone = false;
    }

    public GeneralResponse(Object item) {
        this.item = item;
    }

    public GeneralResponse(Object item, boolean isDone) {
        this.item = item;
        this.isDone = isDone;
    }

    public GeneralResponse() {
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
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

package pl.edu.amu.wmi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Stworzone przez Eryk Mariankowski dnia 16.12.17.
 */
@ApiModel("Response wrapper for target response item")
public class GeneralResponse<T> {

    protected boolean isDone = true;

    @ApiModelProperty("Provided only if done is false")
    private String errorMessage;

    @ApiModelProperty("Provided only if done is true")
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

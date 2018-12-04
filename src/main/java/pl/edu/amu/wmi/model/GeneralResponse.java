package pl.edu.amu.wmi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Stworzone przez Eryk Mariankowski dnia 16.12.17.
 */
@ApiModel(description = "Response wrapper for target response item")
public class GeneralResponse<T> {

    protected boolean success = true;

    @ApiModelProperty("Provided only if done is false")
    private String errorMessage;

    @ApiModelProperty("Provided only if done is true")
    private T data;

    public GeneralResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.success = false;
    }

    public GeneralResponse(T data) {
        this.data = data;
    }

    public GeneralResponse(T data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public GeneralResponse() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

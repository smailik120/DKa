package com.company;

public class DkaException extends Exception {
    private DkaErrorCode errorCode;
    public DkaException(DkaErrorCode errorCode){
        this.errorCode=errorCode;
    }

    public DkaErrorCode getErrorCode() {
        return errorCode;
    }
}

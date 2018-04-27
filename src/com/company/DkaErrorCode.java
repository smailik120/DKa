package com.company;

public enum DkaErrorCode {
    WRONG_Q("wrong q"),
    WRONG_SYMBOL("wrong symbol"),
    WRONG_IN_FUNCTION_STEP("wrong step");
    private String errorString;
    private DkaErrorCode(String errorString) {
        this.errorString = errorString;
    }
    public String getErrorString() {
        return errorString;
    }
}

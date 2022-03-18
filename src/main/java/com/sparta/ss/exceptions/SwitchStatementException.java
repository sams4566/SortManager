package com.sparta.ss.exceptions;

public class SwitchStatementException extends Exception {
    private final String message;

    public SwitchStatementException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

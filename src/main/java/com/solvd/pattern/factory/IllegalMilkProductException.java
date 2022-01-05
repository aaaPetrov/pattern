package com.solvd.pattern.factory;

public class IllegalMilkProductException extends RuntimeException {

    public IllegalMilkProductException(String message) {
        super(message);
    }

    public IllegalMilkProductException(String message, Throwable cause) {
        super(message, cause);
    }

}

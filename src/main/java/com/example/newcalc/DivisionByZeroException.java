package com.example.newcalc;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }

}
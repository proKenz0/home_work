package com.company.exceptions.task3;


/**
 * Throw when a > 0 and b > 0
 */
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

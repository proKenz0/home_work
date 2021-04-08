package com.company.test.service;

public class OutputService implements IOutputService{
    @Override
    public void display(String message) {
        System.out.print(message);
    }

    @Override
    public void displayln(String message) {
        System.out.println(message);
    }
}

package com.company.exceptions.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number 1: ");
            int a = scanner.nextInt();
            System.out.println("Enter number 2: ");
            int b = scanner.nextInt();
            System.out.println("sum = " + (a+b));
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("You enter wrong number.");
        }
    }
}

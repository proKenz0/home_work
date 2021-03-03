package com.company.exceptions.task1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        try {
            int i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("Number %d is pair.".formatted(i));
            } else {
                System.out.println("Number %d is unpair.".formatted(i));
            }
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("You enter double number");
        }
    }
}

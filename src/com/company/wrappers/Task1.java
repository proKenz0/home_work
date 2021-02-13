package com.company.wrappers;

import java.util.Scanner;

public class Task1 {
    Task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum: ");
        double sum = scanner.nextDouble();
        System.out.print("Enter percent: ");
        int percent = scanner.nextInt();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        for(int i = 0; i < years; ++i){
            sum += sum * percent/100;
        }
        System.out.println("sum = " + sum);

    }
}

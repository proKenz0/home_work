package com.company.wrappers;

import java.util.Scanner;

public class Task2 {
    Task2(){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[100];
        int size = 0;
        System.out.println("Enter array(size <= 100) then write ok:");
        while (scanner.hasNextInt()){
            array[size] = scanner.nextInt();
            ++size;
        }

        for(int i = 0; i < size; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = size-1; i >= 0; --i){
            System.out.print(array[i] + " ");
        }

    }
}

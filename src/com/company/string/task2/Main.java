package com.company.string.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scanner = new Scanner(System.in);
        var list = scanner.nextLine().split(" ");

        int max = list[0].length();
        int maxIndex = 0;
        int min = list[0].length();
        int minIndex = 0;
        for (int i = 0; i < list.length; ++i) {
            if (max < list[i].length()) {
                max = list[i].length();
                maxIndex = i;
            }
            if (min > list[i].length()) {
                min = list[i].length();
                minIndex = i;
            }
        }
        System.out.println("Max word = %s. Id = %d".formatted(list[maxIndex], maxIndex+1));
        System.out.println("Min word = %s. Id = %d".formatted(list[minIndex], minIndex+1));
    }
}

package com.company.string.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scanner = new Scanner(System.in);
        var list = scanner.nextLine().split(" ");
        ArrayList<String> specialWords = new ArrayList<>();
        for (var item : list){
            if(item.startsWith("a") && item.length() % 2 == 0)
                specialWords.add(item);
        }
        for(var word : specialWords)
            System.out.println(word);
    }
}

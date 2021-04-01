package com.company.annotations.task1;

public class Task1 {
    public static void main(String[] args) {
        String path = "uselessAnnotation.txt";
        IUselessFinder uselessFinder = new UselessFinder();

        uselessFinder.findUselessFields(path);
    }
}

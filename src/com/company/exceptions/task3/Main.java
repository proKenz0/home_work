package com.company.exceptions.task3;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            if(a < 0 && b < 0)
                throw new IllegalArgumentException("Illegal");
            if((a == 0 && b != 0) || (a != 0 && b == 0))
                throw new ArithmeticException("Arithmetic");
            if(a == 0 && b == 0)
                throw new IllegalAccessException("Access");
            if(a > 0 && b > 0)
                throw new MyException("My exception");
            System.out.println(Methods.add(a, b));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}

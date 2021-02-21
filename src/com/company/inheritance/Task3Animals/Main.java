package com.company.inheritance.Task3Animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Phoenix", 285, 7);
        System.out.printf("Назва тварини = %s, Швидкість тварини = %d км/год," +
                " Вік тварини = %d років",animal.getName(), animal.getSpeed(),
                        animal.getAge());
        System.out.println();
        animal.setName("Bull");
        animal.setSpeed(20);
        animal.setAge(10);
        System.out.printf("Назва тварини = %s, Швидкість тварини = %d км/год," +
                " Вік тварини = %d років", animal.getName(), animal.getSpeed(),
                        animal.getAge());
    }
}

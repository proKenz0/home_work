package com.company.io.task2;

import com.company.io.ISerializer;
import com.company.io.Serializer;
import com.company.io.task1.Employee;

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        Employee2 employee = new Employee2(1, "Mykola", 100000);
        String path = "employee2.txt";

        ISerializer<Employee2> serializer = new Serializer<>();

        try {
            serializer.serialize(employee, path);
            Employee2 mykola = serializer.deserialize(path);
            System.out.println(mykola);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

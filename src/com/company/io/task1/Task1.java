package com.company.io.task1;

import com.company.io.ISerializer;
import com.company.io.Serializer;

import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Mykola", 100000);
        String path = "employee1.txt";

        ISerializer<Employee> serializer = new Serializer<>();

        try {
            serializer.serialize(employee, path);
            Employee mykola = serializer.deserialize(path);
            System.out.println(mykola);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

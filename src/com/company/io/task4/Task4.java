package com.company.io.task4;

import com.company.io.ISerializer;
import com.company.io.Serializer;
import com.company.io.task2.Employee2;

import java.io.IOException;

public class Task4 {

    public static void main(String[] args) {

        Employee4 employee = new Employee4(1, "Mykola", new Salary(100000));
        String path = "employee4.txt";

        ISerializer<Employee4> serializer = new Serializer<>();

        try {
            serializer.serialize(employee, path);
            Employee4 mykola = serializer.deserialize(path);
            System.out.println(mykola);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

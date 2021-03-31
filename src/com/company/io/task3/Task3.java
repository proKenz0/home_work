package com.company.io.task3;

import com.company.io.ISerializer;
import com.company.io.Serializer;
import com.company.io.task1.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        String path = "employee3List.txt";

        Employee3 employee1 = new Employee3(1, "Mykola", 100000);
        Employee3 employee2 = new Employee3(2, "Tom", 1000);
        Employee3 employee3 = new Employee3(3, "Bred", 5000);

        List<Employee3> employees = new ArrayList<>(Arrays.asList(employee1, employee2, employee3));

        ISerializer<List<Employee3>> serializer = new Serializer<>();

        try {
            serializer.serialize(employees, path);
            var emplList = serializer.deserialize(path);
            System.out.println(emplList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

package com.company.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Person mykola = new Person("Mykola", 21);
        Class personClass = Person.class;

        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method);
        }


        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields){
            System.out.println(field);
        }

        System.out.println();

        Constructor[] constructors = personClass.getDeclaredConstructors();

        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

        Person person1 = (Person) constructors[0].newInstance("name", 15);
        constructors[1].setAccessible(true);
        Person person2 = (Person) constructors[1].newInstance("name");

        System.out.println(person1);
        System.out.println(person2);

        personClass.getMethod("setName", String.class).invoke(mykola, "Igor");
        System.out.println(personClass.getMethod("getName").invoke(mykola, null));

        System.out.println();

        System.out.println(mykola);

        System.out.println();


    }
}

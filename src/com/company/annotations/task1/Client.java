package com.company.annotations.task1;

public class Client {

    @Useless(age = 15)
    private int id;
    @Useless(age = 15, name = "Mykola")
    private int age;

    private String name;
    private String email;

    public Client(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

package com.company.map;

import java.util.Objects;

public class Animal {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(type, animal.type) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

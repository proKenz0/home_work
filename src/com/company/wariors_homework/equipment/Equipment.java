package com.company.wariors_homework.equipment;

import com.company.wariors_homework.units.Characteristics;

public abstract class Equipment {
    private String name;
    public Equipment(String name) {
        this.name = name;
    }

    public abstract void addCharacteristics(Characteristics characteristics);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                '}';
    }
}

package com.company.wariors_homework.equipment;

import com.company.wariors_homework.units.Characteristics;

public class Helm extends Equipment{
    private int armor;

    public Helm(String name, int armor) {
        super(name);
        this.armor = armor;
    }

    @Override
    public void addCharacteristics(Characteristics characteristics) {
        characteristics.setArmor(characteristics.getArmor() + armor);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return super.toString() + " Helm{" +
                "armor=" + armor +
                '}';
    }
}

package com.company.wariors_homework.equipment;

import com.company.wariors_homework.units.Characteristics;

public class Weapon extends Equipment{
    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }
    @Override
    public void addCharacteristics(Characteristics characteristics) {
        characteristics.setDamage(characteristics.getDamage() + damage);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return super.toString() + " Weapon{" +
                "damage=" + damage +
                '}';
    }
}

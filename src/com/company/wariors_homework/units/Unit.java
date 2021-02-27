package com.company.wariors_homework.units;

import com.company.wariors_homework.equipment.Equipment;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit {
    private String name;
    private ArrayList<Equipment> equipment;
    private Characteristics characteristics;

    public Unit(String name, ArrayList<Equipment> equipment, Characteristics characteristics) {
        this.name = name;
        this.equipment = equipment;
        this.characteristics = characteristics;
        addEquipmentFeatures();
    }

    public Unit() {
    }

    public static void fight(Unit unit1, Unit unit2){
        while (unit1.characteristics.getHp() > 0 && unit2.characteristics.getHp() > 0){
            unit1.attack(unit2);
            unit2.attack(unit1);
        }
        if(unit1.characteristics.getHp() > 0)
            System.out.println(unit1.name + " win the fight.");
        else if(unit2.characteristics.getHp() > 0)
            System.out.println(unit2.name + " win the fight.");
        else
            System.out.println("Both died");
    }

    private void attack(Unit unit){
        boolean isCrit = false;
        System.out.println(this.name + " attacks " + unit.name);
        if(calcChance(unit.getCharacteristics().getEvading())){
            System.out.println(unit.name + " evaded attack and received no damage.");
        }
        else {
            if(calcChance(this.characteristics.getCritChance())){
                System.out.println(this.name + " making critical attack.");
                isCrit = true;
                characteristics.addCritDamage();
            }
            int finalDamage = characteristics.getReducedDamage(unit.getCharacteristics().getArmor());
            System.out.println("%s attacks %s with %d damage. %s have %d armor. Final damage - %d."
            .formatted(this.name, unit.name, this.characteristics.getDamage(), unit.name,
                    unit.characteristics.getArmor(),finalDamage));
            unit.characteristics.reduceHp(finalDamage);
            if(isCrit)
                characteristics.restoreDamage();
        }
        System.out.println(unit.name + " have " + unit.characteristics.getHp() + " hp.");
        System.out.println();
    }

    private boolean calcChance(int chance){
        int rand = (int)(Math.random()*100);
        if(rand <= chance)
            return true;
        return false;
    }

    private void addEquipmentFeatures(){
        for(var eq : equipment){
            eq.addCharacteristics(characteristics);
        }
    }


    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ",\nequipment=" + equipment.toString() +
                ",\ncharacteristics=" + characteristics.toString() +
                '}';
    }

    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

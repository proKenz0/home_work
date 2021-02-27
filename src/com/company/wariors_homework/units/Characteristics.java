package com.company.wariors_homework.units;

import com.company.wariors_homework.equipment.Equipment;

public class Characteristics {


    private int strength;
    private int agility;
    private int intelligence;

    private int hp;
    private int critDamage;
    private int critChance;
    private int evading;
    private int armor;
    private int damage;


    public Characteristics(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        calcCharacteristics();
    }
    public Characteristics(Warrior warrior) {
        this.strength = 100;
        this.agility = 70;
        this.intelligence = 50;
        calcCharacteristics();
    }
    public Characteristics(Archer archer) {
        this.strength = 70;
        this.agility = 100;
        this.intelligence = 50;
        calcCharacteristics();
    }
    public Characteristics(Assasin assasin) {
        this.strength = 50;
        this.agility = 100;
        intelligence = 80;
        calcCharacteristics();
    }
    private void calcCharacteristics(){
        hp = strength*10;
        critDamage = 100 + strength;
        critChance = intelligence/2;
        evading = agility/5;
        damage = strength;
        armor = agility/10;
    }
    public void addCritDamage(){
        double dmg = critDamage/100.0*damage;
        damage = (int)dmg;
    }
    public void restoreDamage(){
        double dmg = damage/(critDamage/100.0);
        damage = (int)dmg;
    }
    public int getReducedDamage(int armor){
        return damage-armor;
    }
    public void reduceHp(int finalDamage){
        hp -= finalDamage;
    }

    @Override
    public String toString() {
        return "Characteristics{" +
                "strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", hp=" + hp +
                ", critDamage=" + critDamage +
                ", critChance=" + critChance +
                ", evading=" + evading +
                ", armor=" + armor +
                ", damage=" + damage +
                '}';
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getEvading() {
        return evading;
    }

    public void setEvading(int evading) {
        this.evading = evading;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

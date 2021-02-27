package com.company.wariors_homework;

import com.company.wariors_homework.equipment.*;
import com.company.wariors_homework.units.Assasin;
import com.company.wariors_homework.units.Characteristics;
import com.company.wariors_homework.units.Unit;
import com.company.wariors_homework.units.Warrior;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Equipment> equipmentWar = new ArrayList<>();
        equipmentWar.add(new Armor("Devil armor", 20));
        equipmentWar.add(new Boots("Devil boots", 5));
        equipmentWar.add(new Helm("Devil helm", 10));
        equipmentWar.add(new Weapon("Frost Morn", 100));

        Unit artheas = new Warrior("Artheas", equipmentWar, new Characteristics(new Warrior()));
        System.out.println(artheas.toString());
        System.out.println();

        ArrayList<Equipment> equipmentAss = new ArrayList<>();
        equipmentAss.add(new Armor("Shadow armor", 15));
        equipmentAss.add(new Boots("Shadow boots", 3));
        equipmentAss.add(new Helm("Shadow helm", 7));
        equipmentAss.add(new Weapon("Incursio", 120));

        Unit illidan = new Assasin("Illidan", equipmentAss, new Characteristics(new Assasin()));
        System.out.println(illidan.toString());
        System.out.println();

        Unit.fight(artheas, illidan);

    }
}

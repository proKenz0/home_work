package com.company.map;

import java.util.*;

public class ZooClub {

    private Map<Person, List<Animal>> personAnimals;

    public ZooClub() {
        personAnimals = new HashMap<>();
    }

    public void addPerson(Person person){
        if(personAnimals.containsKey(person)) {
            System.out.println("This person is in the club.");
        }
        else {
            personAnimals.put(person, new ArrayList<>());
            System.out.println("Person " + person + " added.");
        }
    }

    public void addAnimal(Person person, Animal animal){
        if(personAnimals.containsKey(person)){
            personAnimals.get(person).add(animal);
        }
        else {
            personAnimals.put(person, new ArrayList<>(Arrays.asList(animal)));
        }
        System.out.println("Animal " + animal + " added.");
    }

    public void removeAnimal(Person person, Animal animal){
        if(personAnimals.containsKey(person)){
            if(personAnimals.get(person).contains(animal)) {
                personAnimals.get(person).remove(animal);
                System.out.println("Animal " + animal + " removed.");
            }
            else {
                System.out.println("Animal " + animal + " is not in the list.");
            }
        }
        else {
            System.out.println("Person " + person + " in not in the list.");
        }
    }

    public void removePerson(Person person){
        if(personAnimals.containsKey(person)){
            personAnimals.remove(person);
            System.out.println("Person " + person + " removed.");
        }
        else {
            System.out.println("Person " + person + " in not in the list.");
        }
    }

    public void printClub(){
        System.out.println();
        for(var entry : personAnimals.entrySet()){
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
        System.out.println();
    }

    public Map<Person, List<Animal>> getPersonAnimals() {
        return personAnimals;
    }

}

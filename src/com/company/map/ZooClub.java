package com.company.map;

import java.util.*;

public class ZooClub {

    private Map<Person, List<Animal>> personAnimals;
    private Print output;

    public ZooClub() {
        personAnimals = new HashMap<>();
        output = new Print() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
    }
    public ZooClub(Print print) {
        personAnimals = new HashMap<>();
        this.output = print;
    }


    public void addPerson(Person person){
        if(personAnimals.containsKey(person)) {
            output.print("This person is in the club.");
        }
        else {
            personAnimals.put(person, new ArrayList<>());
            output.print("Person " + person + " added.");
        }

    }

    public void addAnimal(Person person, Animal animal){
        if(personAnimals.containsKey(person)){
            personAnimals.get(person).add(animal);
        }
        else {
            personAnimals.put(person, new ArrayList<>(Arrays.asList(animal)));
        }
        output.print("Animal " + animal + " added.");
    }

    public void removeAnimal(Person person, Animal animal){
        if(personAnimals.containsKey(person)){
            if(personAnimals.get(person).contains(animal)) {
                personAnimals.get(person).remove(animal);
                output.print("Animal " + animal + " removed.");
            }
            else {
                output.print("Animal " + animal + " is not in the list.");
            }
        }
        else {
            output.print("Person " + person + " in not in the list.");
        }
    }

    public void removePerson(Person person){
        if(personAnimals.containsKey(person)){
            personAnimals.remove(person);
            output.print("Person " + person + " removed.");
        }
        else {
            output.print("Person " + person + " in not in the list.");
        }
    }

    public void printClub(){
        String message = "\n";
        for(var entry : personAnimals.entrySet()){
            message += entry.getKey() + " :: " + entry.getValue() + "\n";
        }
        output.print(message);
    }

    public Map<Person, List<Animal>> getPersonAnimals() {
        return personAnimals;
    }

}

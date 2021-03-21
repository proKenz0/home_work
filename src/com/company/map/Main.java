package com.company.map;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person jack = new Person("Jack", 20);
        Person ben = new Person("Ben", 30);
        Animal miu = new Animal("cat", "Miu");
        Animal vas = new Animal("dog", "Vas");

        zooClub.addPerson(jack);

        zooClub.removePerson(ben);

        zooClub.addAnimal(ben, miu);

        zooClub.printClub();

        zooClub.removePerson(jack);
//
        zooClub.printClub();
//
        zooClub.removeAnimal(ben, vas);
//
        zooClub.printClub();

    }
}

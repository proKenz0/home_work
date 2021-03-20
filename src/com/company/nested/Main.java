package com.company.nested;

import com.company.nested.products.Product;
import com.company.nested.products.Tv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tv lg = new Tv("Lg", 50, 100, 3);
        Tv samsung = new Tv("Samsung", 40, 110, 5);
        Tv bravis = new Tv("Bravis", 60, 90, 4);
        Tv hisense = new Tv("Hisense", 55, 100, 4);

        Commodity commodity = new Commodity(Arrays.asList(lg, samsung, bravis, hisense));

        commodity.printProducts();

        int action;

        while (true) {
            printMenu();
            action = getIntInput("Enter action: ");

            switch (action) {
                case 1: {
                    System.out.println();
                    commodity.addProduct(new Tv(getStringInput("Enter name: "), getIntInput("Enter lenght: "),
                            getIntInput("Enter width: "), getIntInput("Enter weight: ")));
                    System.out.println();
                    System.out.println("Product was added.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 2: {
                    System.out.println();
                    commodity.removeProduct(getIntInput("Enter index(0-%d): ".formatted(
                            commodity.getProducts().size() - 1
                    )));
                    System.out.println();
                    System.out.println("Product was removed.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 3: {
                    System.out.println();
                    commodity.changeProduct(getIntInput("Enter index(0-%d): ".formatted(
                            commodity.getProducts().size() - 1)), new Tv(getStringInput("Enter name: "),
                            getIntInput("Enter lenght: "), getIntInput("Enter width: "),
                            getIntInput("Enter weight: ")));
                    System.out.println();
                    System.out.println("Product was changed.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 4: {
                    System.out.println();
                    commodity.sortByName();
                    System.out.println("Products was sorted by name.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 5: {
                    System.out.println();
                    commodity.sortByLength();
                    System.out.println("Products was sorted by length.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 6: {
                    System.out.println();
                    commodity.sortByWidth();
                    System.out.println("Products was sorted by width.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 7: {
                    System.out.println();
                    commodity.sortByWeight();
                    System.out.println("Products was sorted by weight.");
                    System.out.println();
                    commodity.printProducts();
                }
                break;
                case 8: {
                    System.out.println();
                    commodity.printProduct(getIntInput("Enter index(0-%d): ".formatted(
                            commodity.getProducts().size() - 1
                    )));
                    System.out.println();
                }
                break;
                case 0: {
                    System.out.println("Thanks for using program.");
                    System.exit(1);
                }
                break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Actions: ");
        System.out.println();
        System.out.println("1 - add product");
        System.out.println("2 - remove product");
        System.out.println("3 - change product");
        System.out.println("4 - sort by name");
        System.out.println("5 - sort by length");
        System.out.println("6 - sort by width");
        System.out.println("7 - sort by weight");
        System.out.println("8 - print product");
        System.out.println("0 - exit");
        System.out.println();
    }

    private static int getIntInput(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(str);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next();
                continue;
            }
        }
    }

    private static String getStringInput(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.next();
    }
}

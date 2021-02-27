package com.company.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Month current_month;
        MonthOperations mo = new MonthOperations();
        Scanner scanner = new Scanner(System.in);
        int action;
        do {
            printMenu();
            System.out.println("Оберіть дію: ");
            if(scanner.hasNextInt()){
                action = scanner.nextInt();
                switch (action){
                    case 1:{
                        String month = getMonth();
                        if(Month.isMonth(month))
                            System.out.println(month + " is a month.");
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 2:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            mo.printMonths(mo.getMonthsWithSameSeason(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 3:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            mo.printMonths(mo.getMonthsWithSameDays(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 4:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            mo.printMonths(mo.getMonthsWithLessDays(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 5:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            mo.printMonths(mo.getMonthsWithMoreDays(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 6:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            System.out.println(mo.getNextSeason(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 7:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            System.out.println(mo.getPrevSeason(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                    case 8:{
                            mo.printMonths(mo.getMonthsWithPairDays());
                    }
                    break;
                    case 9:{
                            mo.printMonths(mo.getMonthsWithUnPairDays());
                    }
                    break;

                    case 10:{
                        String month = getMonth();
                        if(Month.isMonth(month)){
                            current_month = Month.valueOf(month);
                            System.out.println(mo.getMonthsWithPairDays().contains(current_month));
                        }
                        else
                            System.out.println(month + " is not a month.");
                    }
                    break;
                }
            }
            else {
                System.out.println("Виберіть дію по цифрах!");
                printMenu();
                scanner.next();
                action = -1;
            }
        }while (true && action != 0);
    }
    private static void printMenu(){
        System.out.println();
        System.out.println("1 - перевірити чи є такий місяць.");
        System.out.println("2 - вивести всі місяці з такою ж порою року.");
        System.out.println("3 - вивести всі місяці які мають таку саму кількість днів.");
        System.out.println("4 - вивести на екран всі місяці які мають меншу кількість днів.");
        System.out.println("5 - вивести на екран всі місяці які мають більшу кількість днів.");
        System.out.println("6 - вивести на екран наступну пору року.");
        System.out.println("7 - вивести на екран попередню пору року.");
        System.out.println("8 - вивести на екран всі місяці які мають парну кількість днів.");
        System.out.println("9 - вивести на екран всі місяці які мають непарну кількість днів.");
        System.out.println("10 - вивести на екран чи введений з консолі місяць має парну кількість днів.");
        System.out.println("0 - вихід.");
        System.out.println();
    }
    private static String getMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місяць: ");
        String month = scanner.next().toUpperCase();
        return month;
    }
}

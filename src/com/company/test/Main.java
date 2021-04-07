package com.company.test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            IDeviceService deviceService  = new DeviceService(new DeviceRepository("src/com/company/test/devices.txt"));
            List<Device> devices = deviceService.getDevices();
            devices.forEach(System.out::println);
            int input = 1;
            Scanner scanner = new Scanner(System.in);
            while (input != 0){
                printMenu();
                if (!scanner.hasNextInt()){
                    System.out.println("\nYou enter illegal input\n");
                    continue;
                }
                input = scanner.nextInt();

                switch (input){
                    case 1:{

                    }
                }
            }



        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void printMenu(){
        System.out.println("Menu: ");
        System.out.println("1 - Вивести весь список на екран");
        System.out.println("2 - Шукати Device за серійним номером");
        System.out.println("3 - Вивести посортований список за назвою бренду");
        System.out.println("4 - Вивести лише ті Device у яких ціна більша ніж 400");
        System.out.println("5 - Вивести лише ті Device у яких в серійному номері є нуль(0) і ціна менша за 800.");
        System.out.println("6 - Вивести найдорожчий товар");
        System.out.println("0 - Вихід");
    }

}

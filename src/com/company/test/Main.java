package com.company.test;

import com.company.test.exception.NotFoundDeviceException;
import com.company.test.model.Device;
import com.company.test.repository.DeviceRepository;
import com.company.test.service.DeviceService;
import com.company.test.service.IDeviceService;
import com.company.test.service.OutputService;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            IDeviceService deviceService  = new DeviceService(new DeviceRepository(), new OutputService());
            int input = 1;
            Scanner scanner = new Scanner(System.in);
            while (input != 0){
                printMenu();
                if (!scanner.hasNextInt()){
                    System.out.println("\nYou enter illegal input\n");
                    scanner.next();
                    continue;
                }
                input = scanner.nextInt();

                switch (input) {
                    case 1 -> {
                        deviceService.printAll();
                    }
                    case 2 -> {
                        System.out.println(deviceService.getBySerNumber(759603));
                    }
                    case 3 -> {
                        deviceService.printSortByBrand();
                    }
                    case 4 -> {
                        deviceService.printByPriceGeeaterThan(400);
                    }
                    case 5 -> {
                        deviceService.printBySerNumAndPriceLessThan(0, 800);
                    }
                    case 6 -> {
                        deviceService.printMaxPriceProduct();
                    }
                    case 0 -> {
                        System.exit(1);
                    }
                }
            }

        } catch (FileNotFoundException | NotFoundDeviceException e){
            System.out.println(e.getMessage());
        }
    }

    private static void printMenu(){
        System.out.println("\nMenu: ");
        System.out.println("1 - Вивести весь список на екран");
        System.out.println("2 - Шукати Device за серійним номером");
        System.out.println("3 - Вивести посортований список за назвою бренду");
        System.out.println("4 - Вивести лише ті Device у яких ціна більша ніж 400");
        System.out.println("5 - Вивести лише ті Device у яких в серійному номері є нуль(0) і ціна менша за 800.");
        System.out.println("6 - Вивести найдорожчий товар");
        System.out.println("0 - Вихід");
    }

}

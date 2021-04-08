package com.company.test.repository;

import com.company.test.model.Device;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeviceRepository  implements IDeviceRepository{

    private final String path = "src/com/company/test/resources/devices.txt";

    public List<Device> getDevices() throws FileNotFoundException {
        List<Device> devices = new ArrayList<>();

        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage() + " FileNotFoundException in scanner");
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(",");

            devices.add(new Device(Long.parseLong(split[0].trim()), split[1].trim(),
                    split[2].trim(), Integer.parseInt(split[3].trim())));
        }
        scanner.close();
        return devices;
    }
}

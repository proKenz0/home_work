package com.company.test.service;

import com.company.test.exception.NotFoundDeviceException;
import com.company.test.model.Device;
import com.company.test.repository.IDeviceRepository;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceService implements IDeviceService{
    private final IDeviceRepository deviceRepository;
    private final IOutputService outputService;

    private List<Device> devices;

    public DeviceService(IDeviceRepository deviceRepository, IOutputService outputService) throws FileNotFoundException {
        this.deviceRepository = deviceRepository;
        this.outputService = outputService;

        try {
            devices = deviceRepository.getDevices();
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    @Override
    public List<Device> getDevices() throws FileNotFoundException {
        return devices;
    }

    @Override
    public void printAll() {
        outputService.displayln(devices.toString());
    }

    @Override
    public Device getBySerNumber(long serNumber) throws NotFoundDeviceException {
         return devices.stream().filter(device -> device.getSerialNumbar() == serNumber)
                .findFirst().orElseThrow(() -> new NotFoundDeviceException("Device not found"));

    }

    @Override
    public void printSortByBrand() {
        outputService.displayln(devices.stream()
                .sorted(Comparator.comparing(Device::getBrand))
                .collect(Collectors.toList()).toString());
    }

    @Override
    public void printByPriceGeeaterThan(int price) {
        outputService.displayln(devices.stream().filter(device -> device.getPrice() > 400)
        .collect(Collectors.toList()).toString());
    }

    @Override
    public void printBySerNumAndPriceLessThan(int digit, int price) {
        outputService.displayln(devices.stream()
                .filter(device -> String.valueOf(device.getSerialNumbar())
                        .contains(String.valueOf(digit)) && device.getPrice() < price)
                .collect(Collectors.toList()).toString());
    }

    @Override
    public void printMaxPriceProduct() {
        outputService.displayln(devices.stream().max(Comparator.comparing(Device::getPrice)).get().toString());
    }


}

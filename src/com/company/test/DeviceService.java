package com.company.test;

import java.io.FileNotFoundException;
import java.util.List;

public class DeviceService implements IDeviceService{
    private IDeviceRepository deviceRepository;
    private List<Device> devices;

    public DeviceService(IDeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
        devices = deviceRepository.getDevices();
    }


    @Override
    public List<Device> getDevices() throws FileNotFoundException {
        return deviceRepository.getDevices();
    }
}

package com.company.test;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDeviceService {
    public List<Device> getDevices() throws FileNotFoundException;
    public void printAll(List<Device>)
}

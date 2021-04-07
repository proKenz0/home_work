package com.company.test;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDeviceRepository {
    public List<Device> getDevices() throws FileNotFoundException;
}

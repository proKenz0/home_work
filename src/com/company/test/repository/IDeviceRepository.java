package com.company.test.repository;

import com.company.test.model.Device;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDeviceRepository {
    public List<Device> getDevices() throws FileNotFoundException;
}

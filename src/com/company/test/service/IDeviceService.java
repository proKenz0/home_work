package com.company.test.service;

import com.company.test.exception.NotFoundDeviceException;
import com.company.test.func_interface.Filter;
import com.company.test.model.Device;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDeviceService {
    public List<Device> getDevices() throws FileNotFoundException;
    public void printAll();
    public Device getBySerNumber(long serNumber) throws NotFoundDeviceException;
    public void printSortByBrand();
    public void printByPriceGeeaterThan(int price);
    public void printBySerNumAndPriceLessThan(int digit, int price);
    public void printMaxPriceProduct();
}

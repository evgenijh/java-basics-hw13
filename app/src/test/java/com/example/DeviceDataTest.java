package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeviceDataTest {
    @Parameters({"kind", "product"})
    @Test
    public void testDeviceDataXML(String kind, String product) {
        System.out.println("testDeviceDataXML");
        System.out.println("Product name is: " + product + "\nKind name is: " + kind);
    }

    @Test(dataProvider = "DeviceDataProvider")
    public void testDeviceDataProvider(String kind, String product) {
        System.out.println("testDeviceDataProvider");
        System.out.println("Product name is: " + product + "\nKind name is: " + kind);
    }

    @DataProvider(name = "DeviceDataProvider")
    public Object[][] getDeviceData() {
        return new Object[][]{
                {"GDO", "myQ"},
                {"GDO", "Genie"},
                {"GDO", "OHD"},
                {"Water Valve", "Flo"},
                {"Lock", "Level Lock"},
                {"Thermostat", "Honeywell T10"},
                {"Thermostat", "Honeywell T6"},
        };
    }
}
package com.example;

import org.testng.annotations.*;

public class DeviceTest {

    @BeforeGroups(groups = "Smoke")
    public void setupMyq() {
        System.out.println("Setup myQ device");
    }

    @AfterGroups(groups = "Smoke")
    public void teardownMyq() {
        System.out.println("Teardown myQ device");
    }

    @Test(groups = "Regression", dependsOnGroups = {"Test"})
    public void OpenGDO() {
        System.out.println("GDO is open");
    }

    @Test(groups = "Regression", dependsOnGroups = {"Test"}, dependsOnMethods = {"OpenGDO"})
    public void CloseGDO() {
        System.out.println("GDO is closed");
    }

    @Test(groups = "Regression")
    public void CloseValve() {
        System.out.println("Water Valve is closed");
    }
    @Test(groups = "Regression", dependsOnMethods = {"CloseValve"})
    public void OpenValve() {
        System.out.println("Water Valve is opened");
    }

    @Test(groups = "Test")
    public void testThermostatModeToCool() {
        System.out.println("Thermostat mode switched to COOL");
    }

    @Test(groups = "Regression", dependsOnMethods = {"testThermostatModeToCool"})
    public void testThermostatModeToEmHeat() {
        System.out.println("Thermostat mode switched to EmHeat");
    }
}

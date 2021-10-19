package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ThermostatTest {

    @BeforeGroups(groups = "Smoke")
    public void setupMyq() {
        System.out.println("Setup myQ device");
    }

    @AfterGroups(groups = "Smoke")
    public void teardownMyq() {
        System.out.println("Teardown myQ device");
    }

    @Test(groups = "Smoke")
    public void testThermostatModeToCool() {
        System.out.println("Thermostat mode switched to COOL");
    }

    @Test(groups = "Smoke", dependsOnMethods = {"testThermostatModeToCool"})
    public void testThermostatModeToEmHeat() {
        System.out.println("Thermostat mode switched to EmHeat");
    }
}


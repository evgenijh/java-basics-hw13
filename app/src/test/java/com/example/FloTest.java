package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class FloTest {

    @BeforeGroups(groups = "Smoke")
    public void setupFlo() {
        System.out.println("Setup Flo device");
    }

    @AfterGroups(groups = "Smoke")
    public void teardownMyq() {
        System.out.println("Teardown Flo device");
    }

    @Test(groups = "Smoke")
    public void OpenFlo() {
        System.out.println("Flo is open");
    }

    @Test(groups = "Smoke", dependsOnMethods = {"OpenFlo"})
    public void CloseFlo() {
        System.out.println("Flo is closed");
    }

}


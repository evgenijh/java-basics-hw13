package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MyqTest {

    @BeforeGroups(groups = "Smoke")
    public void setupMyq() {
        System.out.println("Setup myQ device");
    }

    @AfterGroups(groups = "Smoke")
    public void teardownMyq() {
        System.out.println("Teardown myQ device");
    }

    @Test(groups = "Smoke")
    public void OpenGDO() {
        System.out.println("myQ is open");
    }

    @Test(groups = "Regression", dependsOnMethods = {"OpenGDO"}, dependsOnGroups = {"Turn On myQ"})
    public void CloseGDO() {
        System.out.println("myQ is closed");
    }

    @Test(groups = "Turn On myQ")
    public void MyqIsOn() {
        System.out.println("myQ is ON");
    }

}



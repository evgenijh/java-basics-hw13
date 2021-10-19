package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Parameters({"kind", "product"})
    @Test
public void parameterTest(String kind, String product) {
        System.out.println("kind = " + kind + ", name = " + product);
    }
}

package TestNG;

import WebDriver.Day3;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Day3Test {

//    @BeforeMethod
//    public void setUp() {
//    }
//
//    @AfterMethod
//    public void tearDown() {
//    }

    @Test(groups = "D")
    public void testLaunch() {
//        Integer a = 1;
//        Integer b = 1;
//        Assert.assertEquals(a, b);
        Day3 d3 = new Day3();
        d3.launch();
    }
}
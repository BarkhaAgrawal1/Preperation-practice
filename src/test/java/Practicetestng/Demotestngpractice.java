package Practicetestng;

import org.testng.annotations.*;

public class Demotestngpractice {
    @BeforeSuite
    public void beforesuite(){
        System.out.println(" beforesuite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println(" beforetest");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println(" beforeclass");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println(" beforemethod");
    }
    @Test
    public void maintest(){
        System.out.println(" maintest");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println(" aftermethod");
    }
    @AfterClass
    public void afterclass(){
        System.out.println(" afterclass");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println(" aftertest");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println(" aftersuite");
    }














}

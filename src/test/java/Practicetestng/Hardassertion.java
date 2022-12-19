package Practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
    @Test
    public void add() {
        int a = 10;
        int b = 20;
        Assert.assertEquals(a + b, 300);
        System.out.println("passed");
    }
}


//we dont have to create a object for hard assertion but we create a object for soft assertions





package Practicetestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertions {
    @Test
    public void add(){
        int a  =10;
        int b = 20;
        SoftAssert obj = new SoftAssert();
            obj.assertEquals(a+b,40);
        System.out.println("all good");
        }


    }
//in soft assertions test case passes even if the actual doesnt match the expected result.
//we have to create a object for the soft assertion


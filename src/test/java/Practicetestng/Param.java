package Practicetestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
    @Parameters({"val1","val2"})
    @Test
    public void addition(int a,int b) {
        int add = a + b;
        System.out.println("the addition os a + b is " + " " + add);

    }

    }

//so parameters are created to run at the run time and a new tag of
// parameter is passes before test annotation in the class
    //there is no valve given over here , we give the values in testng.xml file
    //in testng.xml parameters are created after test tag and before the classes tag.
    //new class param is also added in the classes tag
//same parameters can work for different classes





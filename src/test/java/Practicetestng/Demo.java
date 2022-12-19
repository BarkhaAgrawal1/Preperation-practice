package Practicetestng;

import org.testng.annotations.Test;

public class Demo {
@Test(priority = 3)
    public void Add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
@Test(priority=1)
    public void sub(){
        int a=10;
        int b=20;
        System.out.println(a-b);
    }
    @Test(priority=2)
    public void Mul(){
        int a=10;
        int b=20;
        System.out.println(a*b);
    }
}

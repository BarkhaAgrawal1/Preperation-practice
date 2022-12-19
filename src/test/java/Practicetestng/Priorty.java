package Practicetestng;

import org.testng.annotations.Test;


public class Priorty {

@Test(dependsOnMethods = {"a"})
    public void d(){

        System.out.println("Hello");
    }
@Test
    public void a(){

        System.out.println("Good Morning");
    }
@Test
    public void b(){
        System.out.println("b");
    }
    @Test(priority = 1)
    public void c(){
        System.out.println("c");
    }
}

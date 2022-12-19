package Practicetestng;

import org.testng.annotations.Test;

public class Paralleltesting {

    @Test
    public void add(){
        int a  = 10;
        int b = 20;
        System.out.println(a+b);
    }

    @Test
    public void minus(){
        int a  = 10;
        int b = 20;
        System.out.println(a-b);
    }



}

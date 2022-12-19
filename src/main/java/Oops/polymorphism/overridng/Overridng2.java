package Oops.polymorphism.overridng;

public class Overridng2 extends ovrriding{

    void m1() {
        super.m1();
        System.out.println("walking");
    }

    public static void main(String[] args) {
        Overridng2 obj= new Overridng2();
        obj.m1();

    }
}

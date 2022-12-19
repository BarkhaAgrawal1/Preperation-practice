package Oops.Abstraction;

public class Honda extends Bike{
    void run(){
        System.out.println(" all good bike");

    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}

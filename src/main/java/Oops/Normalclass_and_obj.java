package Oops;
//creating a class and obj instance for it and calling the methods
public class Normalclass_and_obj {
    public void color(){
        System.out.println("red");
    }
    public void color2(){
        System.out.println("blue");
    }
int i = 10;
    public static void main(String[] args) {
         Normalclass_and_obj  obj1 = new Normalclass_and_obj();
         obj1.color();
         obj1.color2();
        System.out.println(obj1.i);

    }
}

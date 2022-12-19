package Oops.polymorphism;
// in method over loading we need to have same class , same method name but different arguments.
public class Ovrloading {
    void m1(int a ,int b){
        System.out.println(a+b);
    }
    void m1(int c, int d,int e){
        System.out.println(c+d);
    }
    void m1(int f,int g,int r,int e){
        System.out.println(f*g);

    }

    public static void main(String[] args) {
        Ovrloading m2 = new Ovrloading();
        m2.m1(12,12);
        m2.m1(2,3,4);
        m2.m1(3,4,5,6);
    }
}

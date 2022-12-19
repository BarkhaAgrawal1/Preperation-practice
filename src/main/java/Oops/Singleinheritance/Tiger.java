// in single inheritance we basically inheriate the property of one parent class in to the child class
// and the call all the methods by creating the obj instance variable.



package Oops.Singleinheritance;

public class Tiger extends Animal {
    void people(){
        System.out.println("seeing white tiger");

    }
    void air(){
        System.out.println("fresh air");
    }

    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.air();
        obj.people();
        obj.eat();
        obj.jungle();
    }
}

package Oops.Multipleinheritance;

//this is the last child class which is inheriting the property of the parent class .
// we will call the main methos in this class and call all the methods of the parent clas and grandfather class overhere.


public class Lion extends Animal{
    void Dangerous(){
        System.out.println("it is dangerous");
    }

    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.Dangerous();
        obj.Air();
        obj.safari();
    }
}

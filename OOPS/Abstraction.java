package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
       
        
    }
}
abstract class Animals1{
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animals1{
    void walk(){
        System.out.println("Walk on four feets");
    }
}
class Chicken extends Animals1{
    void walk(){
        System.out.println("Walk on two feets");
    }
}

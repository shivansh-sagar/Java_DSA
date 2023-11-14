package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        h1.ChangeColor();
        System.out.println(h1.color);

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        Mustang m1 = new Mustang();
       
        
    }
}
abstract class Animals1{
    String color;
    Animals1(){
        System.out.println("Animals constructor is called");;
    }
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animals1{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk(){
        System.out.println("Walk on four feets");
    }
    void ChangeColor(){
        color = "Dark Brown";
    }
}
class Chicken extends Animals1{
    void walk(){
        System.out.println("Walk on two feets");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang is called");
    }
}

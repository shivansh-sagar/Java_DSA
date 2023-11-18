package OOPS;

public class PracticeQue4 {
    public static void main(String[] args) {
        Vehicle1 c = new Car1();
        c.color= "red";
        // c.model= " v"; we cant access
        System.out.println(c.color);
        Car1 c1 = new Car1();
        c1.model = "v2";
    }
}
class Vehicle1{
    String color;
}
class Car1 extends Vehicle1{
    String model;
}

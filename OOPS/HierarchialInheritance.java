package OOPS;

public class HierarchialInheritance {
    public static void main(String[] args) {
       Airplane stuntplan = new Airplane();
       stuntplan.bodyMaterial= "aluminum"; 
       stuntplan.fly();

       Car audi = new Car();
       audi.bodyMaterial= "carbonfiber";
       audi.run();
       
    }
}
class Transport{
    String color;
    String bodyMaterial;
}
class Airplane extends Transport{
    void fly(){
        System.out.println("Fly");
    }
}
class Car extends Transport{
    void run(){
        System.out.println("Run");
    }
}
class boat extends Transport{
    void swim(){
        System.out.println("Swim");
    }
}

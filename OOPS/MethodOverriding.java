package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d =new Deer();
        d.eat();
    }
}
class LargeAnimal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer extends LargeAnimal{
    void eat(){
        System.out.println("Eats grass");
    }
}
package OOPS;

public class MultipleInheritance_Interface {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.grass();
        b.meat();
    }
}
interface Harbivore{
    void grass();
}
interface Carnivore{
    void meat();
}
class Bear implements Harbivore, Carnivore{
    public void grass(){
        System.out.println("Eats Grass");
    }
    public void meat(){
        System.out.println("Eats Meats");
    }
}

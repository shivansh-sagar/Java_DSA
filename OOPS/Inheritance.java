package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat("Pav Bhaji");
        shark.fins= 3;
        System.out.println(shark.fins);
    }
}

class Animal{
    String color;
    void breath(){
        System.out.println("Breath");
    }
    void eat(String eat){
        System.out.println(eat);
    }
}
// Inherit the properties (like: Breath, eat) of Animal class using keywork extends
class Fish extends Animal{
    int fins;

}
package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dogs Maxx = new Dogs();
        Maxx.color = "brown";
        Maxx.legs= 4;
        Maxx.eat();
        Maxx.breaths();
        Maxx.bread = "Rottweiler";
        System.out.println(Maxx.bread);
        System.out.println("Color "+Maxx.color);
        System.out.println("legs "+Maxx.legs);
    }
}

class Animals {
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breaths(){
        System.out.println("breaths");
    }
}

class Mammals extends Animals {
    int legs;
}

class Dogs extends Mammals {
    String bread;
}
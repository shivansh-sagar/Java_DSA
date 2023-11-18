package OOPS;

public class Super {
    public static void main(String[] args) {
        Horse1 h1 = new Horse1();
        System.out.println(h1.color);

    }
}

class BigAnimal {
    String color;
    BigAnimal() {
        System.out.println("BigAnaimal constructor is called");
    }
}

class Horse1 extends BigAnimal {

    Horse1() {
        System.out.println("horse constructo is called");
        super.color = "brown";
        
    }

}

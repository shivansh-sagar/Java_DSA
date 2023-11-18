package OOPS;

public class PracticeQue5 {
    public static void main(String[] args) {
        Toy obj1 = new Train();
        obj1.print(); // function Overriding (Derived class)

        Toy obj2 = new Toy();
        obj2.print();
    }
}

class Toy {
    void print() {
        System.out.println("Base class(Toy)");
    }
}

class Train extends Toy {
    void print() {
        System.out.println("Derived class(Train)");
    }
}
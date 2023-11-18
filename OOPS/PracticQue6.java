package OOPS;

public class PracticQue6 {
    public static void main(String[] args) {
        Toy1 obj1 = new Train1();
        // obj1.print1(); // we can't access the print1

        Toy1 obj2 = new Toy1();
        obj2.print();
    }
}
class Toy1 {
    void print() {
        System.out.println("Base class(Toy)");
    }
}

class Train1 extends Toy1 {
    void print1() {
        System.out.println("Derived class(Train)");
    }
}
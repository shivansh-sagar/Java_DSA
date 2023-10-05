package Fun_Method;

public class Callbyvalue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Call by Value - whenever we send a variable to any function it never send an original variable it always send a copy of the original variable to the function.

    //Call by Reference - when the original value is send and used  
}

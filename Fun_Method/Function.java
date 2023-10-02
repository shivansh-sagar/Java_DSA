package Fun_Method;

import java.util.*;

public class Function {
    public static void printhello() {
        System.out.println("Hello World");
        System.out.println("Hello Maxx");

    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is  : "+ sum);
    }

    public static void main(String args[]) {
        calculateSum();
    }
}

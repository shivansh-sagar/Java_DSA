package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10,32));
        System.out.println(calc.sum((float)1.5, (float)13.7));
        System.out.println(calc.sum(1, 18, 23));

    }        

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

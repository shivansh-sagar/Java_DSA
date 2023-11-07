package Bit_Manipulation;

public class Swap2Var {
    public static void main(String[] args) {
        int X = 2;
        int Y = 5;
        System.out.println("The value of X "+ X+ "and the value of Y "+ Y);
        X = X ^ Y;
        Y = X ^ Y;
        X = X ^ Y;
        System.out.println("The updated value of X is "+ X+ "and the value of Y is "+ Y);
    }
}

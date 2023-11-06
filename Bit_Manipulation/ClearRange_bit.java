package Bit_Manipulation;

public class ClearRange_bit {

    public static int ClearRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return n & BitMask;

    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int j = 4;
        System.out.println(ClearRange(n, i, j));
    }
}

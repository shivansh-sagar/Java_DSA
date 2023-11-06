package Bit_Manipulation;

public class Count_Set_Bit {
    public static int CountSet_Bits(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(CountSet_Bits(n));
    }
}

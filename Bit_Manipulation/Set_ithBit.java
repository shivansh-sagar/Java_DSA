package Bit_Manipulation;

public class Set_ithBit {
    public static int Set_IthBit(int n, int i){
        int BitMask =1;
        n = n|(BitMask<<i);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(Set_IthBit(5, 3));
    }
}

package Bit_Manipulation;

public class Clear_ithBit {
    
    public static void main(String[] args) {
        int n= 13;
        int i = 3;
        int BitMask =1<<i;
        int result= n &~BitMask;
        System.out.println(result);
        System.out.println(n^BitMask);
        
    }
}

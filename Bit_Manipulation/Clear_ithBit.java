package Bit_Manipulation;

public class Clear_ithBit {
    
    public static void main(String[] args) {
        int n= 10;
        int i = 1;
        int BitMask =~(1<<i);
        int result= n &BitMask;
        System.out.println(result);
       
        
    }
}

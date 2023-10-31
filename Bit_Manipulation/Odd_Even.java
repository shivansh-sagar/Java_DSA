package Bit_Manipulation;

public class Odd_Even {
    public static void OddOrEven(int n){
        int BitMask =1;
        if((n & BitMask)==0){
            //Even
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
         int n= 12;
         OddOrEven(n);
    }
}

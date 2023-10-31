package Bit_Manipulation;

public class Get_ithBit {
    public static void getIthBit(int n , int i){
        int BitMask = 1;
        if((n&(BitMask<<i))!=0){
            System.out.println("The "+i+"th Bit is  1");
        }else{
            System.out.println("The "+i+"th Bit is  0");
        }
    }
    public static void main(String[] args) {
        getIthBit(7, 3);
    }
}

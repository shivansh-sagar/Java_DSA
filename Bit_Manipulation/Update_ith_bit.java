package Bit_Manipulation;

public class Update_ith_bit {
    public static int Set_IthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int Clear_IthBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int UpdateIthBit1(int n, int i, int userBit){
        if(userBit==0){
            return Clear_IthBit(n,i);
        }else{
            return Set_IthBit(n, i);
        }
    }
    public static int UpdateIthBit2(int n, int i, int userBit){
        n=Clear_IthBit(n, i);
        int BitMask=userBit<<i;
        return n|BitMask;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int userBit = 0;
        System.out.println(UpdateIthBit1(n, i, userBit));
        System.out.println(UpdateIthBit2(n, i, userBit));
    }
}

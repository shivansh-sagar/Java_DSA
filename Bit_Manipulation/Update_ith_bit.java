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

    public static int UpdateIthBit(int n, int i, int userBit){
        if(userBit==0){
            return Clear_IthBit(n,i);
        }else{
            return Set_IthBit(n, i);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int userBit = 1;
        System.out.println(UpdateIthBit(n, i, userBit));
    }
}

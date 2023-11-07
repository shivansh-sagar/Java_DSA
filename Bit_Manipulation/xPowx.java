package Bit_Manipulation;

public class xPowx {
    public static int XPowX(int x){
        int ans=1;
        int pow = x;
        while(pow>0){
            if((pow&1)!=0){
                ans *= x;
            }
            x= x*x;
            pow=pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x =5;
        System.out.println(XPowX(x));
    }
}

package Recursion;

public class PrintXpowerNOptimized {
    public static int powerOpt(int x, int n) {
        if(n==0){
            return 1;
        }
        int halfPower = powerOpt(x, n/2);
        int halfPowersq = halfPower* halfPower;
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    } 

    public static void main(String[] args) {
        System.out.println(powerOpt(2, 5));
    }
}

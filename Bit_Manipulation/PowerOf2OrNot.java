package Bit_Manipulation;

public class PowerOf2OrNot {
    public static boolean IsPowerOf2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(IsPowerOf2(128));
    }
}

package Recursion;

public class SumOfFirstN {  
    public static int SumOfN(int n){
        if(n==1){
            return 1;
        }
        SumOfN(n-1);
        int Sum = n + SumOfN(n-1);

        return Sum;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(SumOfN(n));
    }
}

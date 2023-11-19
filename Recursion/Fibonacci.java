package Recursion;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        
        int fnm1=fibo(n-1);
        int fnm2= fibo(n-2);

        int fibN = fnm1+ fnm2;
        

        return fibN;
         
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibo(n));
    }
}

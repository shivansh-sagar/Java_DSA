package Fun_Method;
import java.util.*;
public class Binomial_Cofficient {
    public static int FactorialN(int n){
        int factorialn = 1;
        if(n==0){
            return n;
        }else{
            for(int i =0; i<=n-1; i++){
                factorialn *= (n-i);
            }
            return factorialn;
        }
    }
    public static int FactorialR(int r){
        int factorialr=1;
        if(r==0){
            return factorialr;
        }else{
            for(int i=0; i<=r-1; i++){
                factorialr *= (r-i);
            }
            return factorialr;
        }
    }
    public static int FactorialD(int diff){
        int factoriald=1;
        if(diff==0){
            return factoriald;
        }else{
            for(int i=0; i<=diff-1; i++){
                factoriald *= (diff-i);
            }
            return factoriald;
        }
    }
    public static int Binomial(int N , int R, int D){
        int nCr = N/(R*D);
        return nCr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n= sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of r : ");
        int r= sc.nextInt();
        int diff = n-r;
        int N=FactorialN(n);   
        int R = FactorialR(r);
        int D = FactorialD(diff);

        int NCR = Binomial(N, R, D);
        System.out.println("The ncr of the given number is : "+NCR);
        
        
    }
}

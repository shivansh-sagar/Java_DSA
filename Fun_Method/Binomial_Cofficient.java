package Fun_Method;


public class Binomial_Cofficient {
    public static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            return fact;
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String[] args) {
       System.out.println(binCoeff(5, 2));
    }
}

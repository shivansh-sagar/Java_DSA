package Fun_Method;

public class DecimalToBinary {
    public static void decimaltobinary(int n){
        int binary = 0;
        int pow = 0;
        while (n > 0) {

            int rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The binary number is ; "+binary);
    }
    public static void main(String[] args) {
        int n = 83;
        decimaltobinary(n);
        

    }
}

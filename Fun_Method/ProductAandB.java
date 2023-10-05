package Fun_Method;

public class ProductAandB {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a= 4;
        int b= 7;
        int prod = multiply(a,b);
        System.out.println(prod); 
    }
}

package Bit_Manipulation;

public class UpperToLower {
    public static void main(String[] args) {
        for(char ch ='A';ch<='Z';ch++){
            System.out.println((char)(ch|' '));
        }

        int a= 'z';
        System.out.println(a);
    }
}

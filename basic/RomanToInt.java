package basic;

public class RomanToInt {
    public static void main(String[] args) {
        int I = 1, V=5 , X=10, L=50, C=100 ;
        int sum = 0;
        String s= "III";
        for(int i=0; i<s.length();i++){
             sum =(int)s.charAt(i); 
        }
        System.out.println(sum);
    }
}

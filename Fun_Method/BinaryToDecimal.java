package Fun_Method;

public class BinaryToDecimal {
    public static int binarytodecimal(int binNum) {
        int pow = 0;
        int decimal = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
            
        }
        return decimal;
        
    }

    public static void main(String[] args) {
        int MyNum = 1010011;
        int binNum = MyNum;
        System.out.println(binarytodecimal(binNum));
        
    }
}

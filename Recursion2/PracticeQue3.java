package Recursion2;

public class PracticeQue3 {
    public static int LenOfStr(String str){
        if(str.length()==0){
            return 0;
        }
        return LenOfStr(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(LenOfStr(str));
    }
}

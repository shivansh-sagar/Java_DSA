package Backtacking;
public class FindPermutation {
    public static void permutation(String str, String ans){
        // Base Condition
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" => "ab"+"de"= "abde";
            String Newstr= str.substring(0, i)+str.substring(i+1,str.length());
            permutation(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        permutation(str, "");
    }   
}

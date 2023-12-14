package Backtacking;

public class FindSubSet {
    public static void findSubsets(String str , String ans, int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        //recusion
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}

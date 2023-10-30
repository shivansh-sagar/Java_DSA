package String;

public class LowerCaseVowelOptimixd {
    public static void main(String[] args) {
        String str = "Hello world";
        int count= 0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                count++;
            }
        }
        System.out.println("Count of vowel is " + count);
    }
}

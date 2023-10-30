package String;

public class LowerCaseVowels {
    public static int checkLowerCaseVowels( String str, String vowels){
        int count= 0;
         
        for(int i=0; i<vowels.length();i++){
            for(int j =0; j<str.length();j++){
                if(vowels.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String str = "Hi i am Shivanshu";
        String vowels = "aeiou";
        System.out.println(checkLowerCaseVowels(str, vowels));
    }
}

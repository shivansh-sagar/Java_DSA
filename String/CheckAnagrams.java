package String;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1= "race";
        String str2 = "care";
        int count=0;
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        if(count==str1.length()){
            System.out.println("Its Anagrams");
        }else{
            System.out.println("Its not Anagrams");
        }
    }
}

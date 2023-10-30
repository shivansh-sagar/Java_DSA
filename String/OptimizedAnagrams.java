package String;

import java.util.Arrays;

public class OptimizedAnagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            //convert the String into char Array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            //sorting the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray,str2charArray);

            if(result){
                System.out.println(str1 + " and " + str2 + " are Anagrams");
            }else{
                System.out.println(str1 + " and " + str2 + " are not Anagrams");
            }

        }
        else{
            System.out.println(str1 + " and " + str2 + " are not Anagrams");
        }
        
    }   
}

package LeetCode;

public class CheckTwoString {
    public static void main(String[] args) {
        String word1[] = {"abc", "d", "defg"};
        String word2[] = { "abcddefg"};
        StringBuilder w1= new StringBuilder("");
        StringBuilder w2= new StringBuilder("");

        // word1 = word1.toLowerCase();
        // word2 = word2.toLowerCase();

        
            for(int i = 0 ;i<word1.length;i++){
                w1.append(word1[i]);
                
            }      
            for(int i = 0 ;i<word2.length;i++){
                
                w2.append(word2[i]);
            }
            if(w1.compareTo(w2)==0){
                System.out.println("true");
            } 
            else {
                System.out.println("false");
            }
        


    }
}

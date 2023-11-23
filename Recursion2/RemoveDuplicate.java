package Recursion2;

public class RemoveDuplicate {
    public static void duplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        
        //Base case
        if(idx== str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            duplicate(str, idx+1, newStr, map);
        }else{
            map[currchar-'a']=true;
            duplicate(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str= "shivanshusagar";
        duplicate(str, 0, new StringBuilder("") , new boolean[26]);
    }
}

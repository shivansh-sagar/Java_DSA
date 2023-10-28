package String;

import java.util.Scanner;

public class CheckPalindrom {
    public static boolean checkpalindrom(String Name) {
       for(int i = 0; i<Name.length(); i++){
        if(Name.charAt(i)!= Name.charAt(Name.length()-1-i)){
            return false;
        }
       }
       
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        System.out.println(checkpalindrom(Name));

    }
}

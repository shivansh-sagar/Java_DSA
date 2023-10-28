package String;
import java.util.Scanner;
public class Strings {
    public static void printletter(String MyName){
        for(int i=0; i<MyName.length();i++){
            System.out.print(MyName.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // String name;
        // String name2;
        // name2= sc.nextLine();
        // name = sc.next();
        // System.out.println(name2);
        String MyName = "Shivanshu Sagar";
        String Property= " Good";
        System.out.println(MyName.length());
        String sentence= MyName + " " + Property;
        System.out.println(sentence.charAt(0));
        printletter(MyName);

    }
}

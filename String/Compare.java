package String;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1.equals(s3)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }
        if (s1 == s3) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}

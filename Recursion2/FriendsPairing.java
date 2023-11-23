package Recursion2;

public class FriendsPairing {
     public static int friendpair(int n){
        //Base
        if(n==1||n==2){
            return n ;
        }
        //choice
        //Single
        int fnm1= friendpair(n-1);

        //pair
        int fnm2 = friendpair(n-2);
        int pairWays = (n-1)*fnm2;

        //TotalWays
        int TotalWays= fnm1+ pairWays;
        return TotalWays;
     }
    public static void main(String[] args) {
        System.out.println(friendpair(4));
    }
}

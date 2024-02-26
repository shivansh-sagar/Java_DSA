package Arraylist;

import java.util.ArrayList;

public class PairSumTwo {
    public static boolean PairSumFun(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=0;
        int i=0;
        int n= list.size();
        while (list.get(i) < list.get(i+1)) {
            lp= i+2;
            rp= i+1;
            i++;
        }
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)== target){
                return true ;
            }
            //case2
            if(list.get(lp)+list.get(rp)>target){
                    rp = (n+rp-1)%n;
                }
            //case3
            if(list.get(lp)+list.get(rp)<target){
                    lp = (lp+1)%n;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 21;
        list.add(0, 11);
        list.add(1, 15);
        list.add(2, 6);
        list.add(3, 8);
        list.add(4, 9);
        list.add(5, 10);
        System.out.println(list);
        int lp = 0;
        int rp = 0;
        int i = 0;
        while (list.get(i) < list.get(i + 1)) {
            lp = i + 2;
            rp = i + 1;
            i++;
        }
        if (PairSumFun(list, target)) {
            System.out.println("solution exist");
        } else {
            System.out.println("Solution doesn't exist");

        }
    }
}

package Arraylist;

import java.util.ArrayList;

public class PairSumPointerApproach {
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case2
            if (list.get(lp) + list.get(rp) > target) {
                rp--;
            } // case3
            if (list.get(lp) + list.get(rp) < target) {
                lp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        if(PairSum(list, target)){
            System.out.println("Solution Exist");
        }else{
            System.out.println("Solution Doesn't Exist");
        }
    }
}

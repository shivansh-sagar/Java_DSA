package Arraylist;

import java.util.ArrayList;

public class PairSumOne {
    public static Boolean PairSum(ArrayList<Integer>list, int target){
        for(int i=0 ; i<list.size(); i++){
            for (int j = i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int target =5;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=1; i<=6; i++){
        list.add(i);
       }
       if(PairSum(list, target)){
        System.out.println("solution exist");
       }else{
        System.out.println("Solution Doesn't exist");
       }

    }
}

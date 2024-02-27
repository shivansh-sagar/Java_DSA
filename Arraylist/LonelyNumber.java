package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {
    public static ArrayList<Integer> LonelyNumberfun(ArrayList<Integer> nums, ArrayList<Integer> list){
        Collections.sort(nums);
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        
        
        if(nums.size()>1){
            if(nums.get(0)+1 < nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1< nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            };
        }
        
        for(int i=1; i<nums.size()-1; i++){
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1< nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        nums.add(0, 10);
        nums.add(1, 6);
        nums.add(2, 5);
        nums.add(3, 8);
       
        System.out.println(LonelyNumberfun(nums,list));
        
        
       
        
    }
}

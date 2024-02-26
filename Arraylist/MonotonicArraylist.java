package Arraylist;

import java.util.ArrayList;

public class MonotonicArraylist {
    public static boolean Monotonicfun(ArrayList<Integer> list){
        boolean increase = true;
        boolean decrease = true; 
        for(int i=0; i<list.size()-1; i++){
              if(list.get(i)<list.get(i+1)){
                increase = false;
              } 
              if(list.get(i)>list.get(i+1)){
                decrease = false;
              }
        }
        return increase || decrease;
        
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 1);
        list.add(2, 4);
        list.add(3, 4);
        System.out.println(list);
        if(Monotonicfun(list)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

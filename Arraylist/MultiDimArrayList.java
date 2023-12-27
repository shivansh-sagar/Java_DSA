package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimArrayList {
   public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add(4);
    list2.add(5);
    mainList.add(list1);
    mainList.add(list2);
    for(int i=0; i<mainList.size(); i++){
        ArrayList<Integer> currentList = mainList.get(i);
        for(int j=0; j<currentList.size(); j++){
            System.out.print(currentList.get(j)+" ");
        }
        System.out.println();
    }


    

   }
}

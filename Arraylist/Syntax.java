package Arraylist;
import java.util.ArrayList;
public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(1, 12);
        System.out.println(list);
        //get operation

        int element = list.get(2);
        System.out.println(element);

        //Delete opertion

        list.remove(2);
        System.out.println(list);

        //set
        list.set(1,5);
        System.out.println(list);

        //contain 
        System.out.println(list.contains(2));

        //Size of arraylist

        System.out.println(list.size());
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
    }
}

package Arraylist;
import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int Max = Integer.MIN_VALUE;
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        list.add(123);
        list.add(99);
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>Max){
                Max = list.get(i);
            }
        }
        System.out.println("Max element is "+Max);
        
    }
}

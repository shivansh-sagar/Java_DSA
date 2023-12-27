package Arraylist;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> heights =new ArrayList<>();
        heights.add(1);heights.add(8);heights.add(6);heights.add(2);heights.add(5);heights.add(4);heights.add(8);heights.add(3);heights.add(7);
        System.out.println(heights);


        int maxStorage =Integer.MIN_VALUE;
        
        for(int i=0; i<heights.size()-1;i++){
            for(int j=i+1; j<heights.size(); j++){
                int h = Integer.min(heights.get(i), heights.get(j));
                int w= j-i;
                int water = h*w;
                // System.out.println("i = "+i+" h = "+h+ " w = "+ w + " water = "+ water);
                if(maxStorage< water){
                    maxStorage = water;
                }
            }
        }
        System.out.println(maxStorage);
    }
}

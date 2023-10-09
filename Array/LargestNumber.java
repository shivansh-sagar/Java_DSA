package Array;

import java.util.*;

public class LargestNumber {
    public static int largestnumber(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]> largest){
                largest = number[i];
            }
            if(number[i]< smallest){
                smallest= number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    
    public static void main(String[] args) {
        int number[] = {10,02,600,5,85,3,144};
        int largest = largestnumber(number);
        System.out.println(largest);
    }
}

package Sorting;

import java.util.Arrays;

import java.util.Collections;

public class InbuiltSorting {
    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {3,5,7,2,1,4,9,10,15,13,19};
        Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);
        
    }
}

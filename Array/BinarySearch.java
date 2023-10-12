package Array;

public class BinarySearch {
    public static int binarysearch(int number[], int key) {
        int start = 0;
        int end = number.length-1;

        for (int i = start; i <= end;) {//while(start<=end)
            int mid = (start + end) / 2;
            //comparisons
            if (number[mid] == key) {
                return mid;
            }
            //Right
            if(number[mid]<key) {
                start = mid + 1;
            }
            //Left
             else {
                end = mid - 1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14 };
        System.out.println(number.length);
        int key = 8;
        int index = binarysearch(number, key);
        System.out.println("index is : "+index);
    }

}

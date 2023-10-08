package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 9, 11, 14, 16, 19 };
        int n = arr.length;

        int start = 0;
        int end = n - 1;
        
        int tar = 16;
        int ans = -1;

        while(start<=end) { 
            int i=0;
            int mid = (start + end) / 2;
           
            if (arr[mid] == tar) {
                ans = mid;
                System.out.println(i);
               
                break;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            i++;
           
        }
        System.out.println(ans);
        System.out.println("hello");

    }

}

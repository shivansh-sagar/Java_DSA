package DivideAndConquer;

public class RotatedSorted {
    public static int Search(int arr[], int target, int si, int ei){    //base
        if(si>ei){
            return -1;
        }
        //kaam
        int mid = si+ (ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        //mid on l1
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<=target && target<= arr[mid]){
                return Search(arr, target, si, mid-1);
            }//case b
            else{
                return Search(arr, target, mid+1, ei);
            }
        }
        //mid on l2
        else{ // arr[mid]<= arr[ei]
            //case c
            if(arr[mid]<= target && target<= arr[ei]){
                return Search(arr, target, mid+1, ei);
            }
            //case d
            else{
                return Search(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int target = 0; 
        int tarIdx = Search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);

    }
}

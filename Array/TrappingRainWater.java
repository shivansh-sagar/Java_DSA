package Array;

public class TrappingRainWater {
    public static void LeftMax(int height[], int LeftArray[]) {

        int leftmax = Integer.MIN_VALUE;
        LeftArray[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (leftmax < height[j]) {
                    leftmax = height[j];
                }
            }
            LeftArray[i] = leftmax;
            leftmax = 0;
        }
       

    }

    public static void RightMax(int height[], int RightArray[]) {

        int rightmax = Integer.MIN_VALUE;
        RightArray[RightArray.length - 1] = height[height.length - 1];
        for (int i = (height.length) - 1; i >= 0; i--) {

            for (int j = i; j < (height.length); j++) {

                if (rightmax < height[j]) {
                    rightmax = height[j];
                }
            }
            RightArray[i] = rightmax;
            rightmax = 0;
        }
        
    }


    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int LeftArray[] = new int[height.length];
        int RightArray[] = new int[height.length];
        int width = 1;
        int TotalTrappedWater= 0;
        LeftMax(height, LeftArray);
        RightMax(height, RightArray);


        for(int i =1; i<height.length; i++){
          int waterlevel = Math.min(LeftArray[i], RightArray[i]);
          int Trappedwater = ((waterlevel) - height[i])*width;
          
          TotalTrappedWater += Trappedwater;
        }
       System.out.println(TotalTrappedWater);
        

    }
}

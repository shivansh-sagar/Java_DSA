package Array;

public class TrappingRainWater {
    public static void LeftMax(int height[]) {
        int LeftArray[] = new int[height.length];
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
        System.out.println(LeftArray[0]);
        for (int i = 0; i < LeftArray.length; i++) {
            System.out.print(LeftArray[i]+ "  ");
        }

    }
    public static void RightMax(int height[]) {
        int RightArray[] = new int[height.length];
        int rightmax = Integer.MIN_VALUE;
        RightArray[RightArray.length-1]= height[height.length-1];
        for(int i = (height.length)-1;i>=0 ;i--){
            for(int j =i ; j<(height.length);j++){
                if(rightmax<height[j]){
                    rightmax= height[j];
                }
            }
            RightArray[i] = rightmax;
            rightmax = 0; 
        }
        for(int i=0;i<RightArray.length;i++){
            System.out.print(RightArray[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        LeftMax(height);
        System.out.println();
        RightMax(height);
        

    }
}

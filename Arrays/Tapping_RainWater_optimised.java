public class Tapping_RainWater_optimised {
    private static void tapping_water2(int[] height) {
        int total_trapped_water = 0;
        int left = 0;
        int right  = height.length-1;

        int left_max = height[left];
        int right_max = height[right];

        while (left<right){
            if (left_max<right_max){
                left++;
                left_max = Math.max(left_max, height[left]);
                total_trapped_water += left_max-height[left];
            }else {
                right--;
                right_max = Math.max(right_max, height[right]);
                total_trapped_water += right_max-height[right];
            }
        }
        System.out.println("Total water tapped : " + total_trapped_water);
    }


    public static void main(String[] args) {
        int[] Height_Block = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        tapping_water2(Height_Block);
    }
}

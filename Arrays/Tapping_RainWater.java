public class Tapping_RainWater {

    public static void tapping_water(int[] Height) {
        int n = Height.length;
        int Tapped_Water = 0;

        int[] left_Max = new int[n];
        left_Max[0] = Height[0];
        for (int i = 1; i < n; i++) {
            left_Max[i] = Math.max(Height[i], left_Max[i - 1]);
        }

        int[] right_Max = new int[n];
        right_Max[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_Max[i] = Math.max(Height[i], right_Max[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_Max[i], right_Max[i]);
            Tapped_Water += water_level - Height[i];
        }

        System.out.println("Total water tapped : " + Tapped_Water);
    }

    public static void main(String[] args) {
        int[] Height_Block = {4, 2, 0, 6, 3, 2, 5};

        tapping_water(Height_Block);
    }
}

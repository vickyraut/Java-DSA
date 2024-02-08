import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int ans = 0;
        int[] arr1 = {4, 1, 8, 7};
        int[] arr2 = {2, 3, 6, 5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            ans += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(ans);
    }
}

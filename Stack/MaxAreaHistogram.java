import java.net.Inet4Address;
import java.util.Stack;

public class MaxAreaHistogram {
    public static int maxAreaHistogram(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> stack = new Stack<>();
        for (int j = arr.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[j]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsr[j] = arr.length;
            } else {
                nsr[j] = stack.peek();
            }

            stack.push(j);
        }

        // Making Stack Empty
        stack = new Stack<>();

        // Next smaller Left
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }

            stack.push(i);
        }

        // Current Area
        for (int i = 0; i < arr.length; i++) {
            int currArea = arr[i] * (nsr[i] - nsl[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(maxAreaHistogram(arr));
    }
}

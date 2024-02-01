import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreater(int[] arr, int[] nextGreater){
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i>=0; i--){
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = new int[arr.length];

        nextGreater(arr, nextGreater);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}

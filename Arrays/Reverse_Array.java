public class Reverse_Array {

    public static void reverse_array(int[] number) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }

        for (int i : number) {
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 45, 60, 75, 99, 100};
        reverse_array(arr);
    }
}

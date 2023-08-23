public class Large_Small_in_array {

    public static int largest_in_arr(int[] array) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > large) {
                large = array[i];
            }
        }

        return large;
    }

    public static int smallest_in_arr(int[] array) {
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }

        return small;
    }

    public static void main(String[] args) {
        int[] numbers = {89,1,90,20,43,18,9,70,5};
        System.out.println("Largest No in array is: " + largest_in_arr(numbers));
        System.out.println("Smallest No in array is: " + smallest_in_arr(numbers));
    }
}

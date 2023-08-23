public class Linear_Search_num {
    private static int Linear_search_num(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 12, 25, 46, 76, 89, 98, 100};
        int key = 12;

        int index = Linear_search_num(numbers, key);

        if (index == -1) {
            System.out.println("Key NOT Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}

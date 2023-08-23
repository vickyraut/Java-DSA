public class Array_Update {
    public static void array_update(int[] array) {

        // In java Array work pn call by reference so this changes will reflect in main function
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {98, 99, 97};

        array_update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

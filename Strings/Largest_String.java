public class Largest_String {

    public static void largest(String[] array) {
        String largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largest.compareTo(array[i]) < 0) {
                largest = array[i];
            }

        }

        System.out.println(largest);
    }

    public static void main(String[] args) {
        String[] array = {"Apple", "Mango", "Banana"};

        largest(array);
    }
}

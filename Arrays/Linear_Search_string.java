public class Linear_Search_string {

    public static int linear_search_string(String[] array, String key) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] menu = {"Samosa", "Coke", "Fruity", "Dosa", "Chole_Bature"};
        String key = "Coke";

        int index = linear_search_string(menu, key);

        if (index == -1) {
            System.out.println("Key NOT Found");
        } else {
            System.out.println("Key is at index: " + index);
        }

    }
}

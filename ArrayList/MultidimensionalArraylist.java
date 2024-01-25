<<<<<<< HEAD
import javax.swing.*;
import java.util.ArrayList;

public class MultidimensionalArraylist {
    public static void addToList(ArrayList<Integer> list, int n) {
        for(int i = 1; i<=5; i++){
            list.add(i*n);
        }
    }

    public static void main(String[] args) {
        // Creating Main-List
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // Creating Sublist & putting data into it
        ArrayList<Integer> list1 = new ArrayList<>();
        addToList(list1, 1);
        System.out.println("List1");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        addToList(list2, 2);
        System.out.println("List2");
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        addToList(list3, 3);
        System.out.println("List3");
        System.out.println(list3);

        // Adding all lists to mainList
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // Traversing Main-list
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
=======
import javax.swing.*;
import java.util.ArrayList;

public class MultidimensionalArraylist {
    public static void addToList(ArrayList<Integer> list, int n) {
        for(int i = 1; i<=5; i++){
            list.add(i*n);
        }
    }

    public static void main(String[] args) {
        // Creating Main-List
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // Creating Sublist & putting data into it
        ArrayList<Integer> list1 = new ArrayList<>();
        addToList(list1, 1);
        System.out.println("List1");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        addToList(list2, 2);
        System.out.println("List2");
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        addToList(list3, 3);
        System.out.println("List3");
        System.out.println(list3);

        // Adding all lists to mainList
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // Traversing Main-list
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
}
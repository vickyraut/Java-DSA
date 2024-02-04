import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    // IF Activities are sorted by endtime
//    public static void activitySelection(int[] start, int[] end){
//
//        // End time basis sorted
//        int maxAct = 0;
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        // 1st activity
//        maxAct = 1;
//        ans.add(0);
//        int lastEnd = end[0];
//
//        // Checking all activities
//        for (int i = 1; i < end.length; i++) {
//            if (start[i] >= lastEnd) {
//                maxAct++;
//                ans.add(i);
//                lastEnd = end[i];
//            }
//        }
//
//        System.out.println("MaxActivities: " + maxAct);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print("A" + ans.get(i) + " ");
//        }
//    }

    // If activities are not sorted by end time then we can sort in using 2D array
    public static void activitySelection(int[] start, int[] end) {
        // 3 columns for (Index, Start-time, End-time)
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sorting according to Endtime using Comaparator
        // Lambda Function -> sorted
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("MaxActivities " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        activitySelection(start, end);
    }
}
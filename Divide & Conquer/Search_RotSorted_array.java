<<<<<<< HEAD
public class Search_RotSorted_array {
    public static int Search(int[] arr, int tar, int si, int ei){
        // base
        if (si>ei){
            return -1;
        }

        int mid = si + (ei - si)/2;

        // Element FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // L1
        if (arr[si] <= arr[mid]){
            // case a: left
            if (arr[si] <= tar && tar <= arr[mid]){
                return Search(arr, tar, si, mid-1);
            }else {
                // case b: right
                return Search(arr, tar, mid+1, ei);
            }
        }
        else { // L2
            // case a: right
            if (arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }else {
                // case a: left
                return Search(arr, tar, si, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 0;
        System.out.println(Search(arr, target, 0, arr.length-1));
    }
}
=======
public class Search_RotSorted_array {
    public static int Search(int[] arr, int tar, int si, int ei){
        // base
        if (si>ei){
            return -1;
        }

        int mid = si + (ei - si)/2;

        // Element FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // L1
        if (arr[si] <= arr[mid]){
            // case a: left
            if (arr[si] <= tar && tar <= arr[mid]){
                return Search(arr, tar, si, mid-1);
            }else {
                // case b: right
                return Search(arr, tar, mid+1, ei);
            }
        }
        else { // L2
            // case a: right
            if (arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }else {
                // case a: left
                return Search(arr, tar, si, mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 0;
        System.out.println(Search(arr, target, 0, arr.length-1));
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5

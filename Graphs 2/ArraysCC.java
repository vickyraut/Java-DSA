import java.util.*;

public class ArraysCC {

    public int search(int[] nums, int target) {
        int min = minSearch(nums);

        // Find in sorted left
        if (min >= 0 && nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        }
        // Find in sorted right
        else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    // Binary search to find target in nums from left to right
    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if target is not found
    }

    // Binary search to find the index of the minimum element in nums
    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the minimum element's index
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        ArraysCC solution = new ArraysCC();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = solution.search(nums, target);
        System.out.println("Index of " + target + " in nums: " + result);
    }
}

public class Array_sameORdistinct {
    public static boolean same_distinct(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized but only if all numbers are less the total length of array
    // This will print repeated numbers
    public static void same_distinct1(int[] numbers) {
        for (int i = 0; i <numbers.length; i++) {
            int index = numbers[i]% numbers.length;
            numbers[index] += numbers.length;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]/ numbers.length >= 2){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,1,0};

        System.out.println(same_distinct(arr));
        same_distinct1(arr);

    }
}

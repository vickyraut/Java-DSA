public class temp {
    public static void printarr(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printarr(arr);

        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" + arr[i]+ "," +arr[j]+ ")");
            }
            System.out.println();
        }
    }
}
public class Last_Ocuurence {
    public static int last_occ(int[] array, int key, int i){
        if(array.length == i){
            return -1;
        }

        int isFound = last_occ(array, key, i+1);

        if (isFound == -1 && array[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] array = {2,3,8,4,5,20,1,4,5,7,0};
        System.out.println(last_occ(array, 2, 0));
    }
}

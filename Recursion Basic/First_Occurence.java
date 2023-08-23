public class First_Occurence {
    public static int first_occ(int[] array, int key, int i){
        if(i == array.length){
            return -1;
        }

        if(array[i] == key ){
            return i;
        }

        return first_occ(array, key, i+1);
    }

    public static void main(String[] args) {
        int[] array = {2,3,8,4,5,2,1,4,5,7,0};
        System.out.println(first_occ(array, 5, 0));
    }
}

public class Binary_Strings_Problem {
    public static void binaryString(int n, int prev, String str){
        //base
        if(n == 0){
            System.out.println(str);
            return;
        }

        //work
        binaryString(n-1, 0, str+="0");
        if (prev == 0){
            binaryString(n-1, 1, str+="1");
        }
    }

    public static void main(String[] args) {
        binaryString(3, 0, "");
    }
}

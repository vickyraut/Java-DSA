<<<<<<< HEAD
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
=======
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
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5

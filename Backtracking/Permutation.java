<<<<<<< HEAD
public class Permutation {
    public static void permutation(String str, String ans){
        // base
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
=======
public class Permutation {
    public static void permutation(String str, String ans){
        // base
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5

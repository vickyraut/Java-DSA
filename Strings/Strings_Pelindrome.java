public class Strings_Pelindrome {
    public static boolean pelindrome(String string) {
//        int start = 0;
//        int end = string.length() - 1;
//
//        while (start<=end){
//            if ((string.charAt(start)) != string.charAt(end)){
//                return false;
//            }else {
//                start++;
//                end--;
//            }
//        }
//
//        return true;

        for (int i = 0; i <= string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String str = "noon";

        System.out.println(pelindrome(str));
    }
}

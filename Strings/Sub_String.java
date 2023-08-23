public class Sub_String {

    // Using User-defined function
    public static String substring(String string, int si, int ei) {
        String substring = "";

        for (int i = si; i <= ei - 1; i++) {
            substring += string.charAt(i);
        }

        return substring;
    }


    public static void main(String[] args) {
        String str = "Ironman";
        System.out.println(substring(str, 0, 5));

        // Using Inbuilt Function
        System.out.println(str.substring(0, 5));
    }
}

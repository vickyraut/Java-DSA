import java.util.Scanner;

public class Vowel_String {
    public static int isvowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'a', 'o', 'e', 'i', 'u' -> count++; // Multiple case in one statement
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String string;
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        string = sc.next();
        System.out.println("Your Entered string is: " + string);
        System.out.println("Total number of lowercase vowels in the given string is: " + isvowel(string));
    }
}

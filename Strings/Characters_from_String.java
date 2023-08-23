public class Characters_from_String {
    public static void char_from_word(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Tony Stark";

        char_from_word(str);
    }
}

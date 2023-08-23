public class Character_Uppercase {

    public static String uppercase(String string) {
        StringBuilder sb = new StringBuilder("");
        Character ch = Character.toUpperCase(string.charAt(0));
        sb.append(ch);

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == ' ' && i < string.length() - 1) {
                sb.append(string.charAt(i)); // add this space to final string
                i++;
                sb.append(Character.toUpperCase(string.charAt(i)));

            } else {
                sb.append(string.charAt(i));
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "i am ironman";

        System.out.println(uppercase(str));
    }
}
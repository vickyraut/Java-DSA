public class String_Compression {

    public static String string_compression(String string) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            Integer count = 1;
            while (i < string.length() - 1 && string.charAt(i) == string.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(string.charAt(i));

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(string_compression(str));
    }
}

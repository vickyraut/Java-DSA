public class Duplicate_String {
    public static void removeDuplicates_String(String str, boolean[] map, int idx, StringBuilder newStr){
        //base
        if (str.length() == idx){
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']){
            removeDuplicates_String(str, map, idx+1, newStr);
        }else {
            map[currChar - 'a'] = true;
            removeDuplicates_String(str, map, idx+1, newStr.append(currChar));
        }
    }


    public static void main(String[] args) {
        removeDuplicates_String("appnnacollege", new boolean[26], 0, new StringBuilder());
    }
}

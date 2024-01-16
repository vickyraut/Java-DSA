public class Subset_String {
    public static void subset_string(String str, int i, StringBuilder ans){
        //base
        if(i == str.length()){
            if (ans.isEmpty()){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }

        //recursion
        // choice = yes
        StringBuilder ansWithChar = new StringBuilder(ans);
        ansWithChar.append(str.charAt(i));
        subset_string(str, i+1, ansWithChar);

        //choice = no
        subset_string(str, i+1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        subset_string(str, 0, new StringBuilder());
    }
}

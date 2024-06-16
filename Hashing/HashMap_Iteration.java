import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("India", 100);
        hashMap.put("China", 150);
        hashMap.put("US", 50);
        hashMap.put("Indonesia", 6);
        hashMap.put("Nepal", 5);

        //Iteration over keys
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key= " + k + " value= " + hashMap.get(k));
        }

    }
}

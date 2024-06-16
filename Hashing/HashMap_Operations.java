import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMap_Operations {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("India", 100);
        hashMap.put("China", 150);
        hashMap.put("US", 50);
        hashMap.put("Nepal", 5);

        System.out.println(hashMap.containsKey("India"));

        System.out.println(hashMap);

        hashMap.get("India");

        System.out.println(hashMap.remove("Nepal"));

        System.out.println(hashMap);

        System.out.println(hashMap.size());

        System.out.println(hashMap.isEmpty());
        hashMap.clear();
        System.out.println(hashMap.isEmpty());
    }
}

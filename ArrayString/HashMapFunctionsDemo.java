package ArrayString;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunctionsDemo {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Initial Map: " + map);

        // 2. put(key, value) -> Add or update element
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println("After put: " + map);


        // 3. get(key) -> Get value of a key
        System.out.println("Value of Apple: " + map.get("Apple"));
        System.out.println("Value of Mango (not present): " + map.get("Mango")); // returns null

        // 4. containsKey(key) -> Check if key exists
        System.out.println("Contains Banana? " + map.containsKey("Banana"));
        System.out.println("Contains Mango? " + map.containsKey("Mango"));

        // 5. containsValue(value) -> Check if value exists
        System.out.println("Contains value 20? " + map.containsValue(20));
        System.out.println("Contains value 50? " + map.containsValue(50));

        // 6. remove(key) -> Remove key-value pair
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        // 7. size() -> Number of key-value pairs
        System.out.println("Size of map: " + map.size());

        // 8. isEmpty() -> Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 9. keySet() -> Get all keys
        System.out.println("Keys: " + map.keySet());

        // 10. values() -> Get all values
        System.out.println("Values: " + map.values());

        // 11. entrySet() -> Get all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // 12. putIfAbsent(key, value) -> Add if key not present
        map.putIfAbsent("Apple", 50); // won't update, already exists
        map.putIfAbsent("Mango", 40); // will add
        System.out.println("After putIfAbsent: " + map);

        // 13. replace(key, value) -> Replace value for key
        map.replace("Banana", 25);
        System.out.println("After replace: " + map);

        // 14. replace(key, oldValue, newValue) -> Replace only if oldValue matches
        boolean replaced = map.replace("Apple", 10, 15); // old value 10 matches -> replaced
        System.out.println("Replaced Apple? " + replaced);
        System.out.println("After conditional replace: " + map);

        // 15. clear() -> Remove all elements
        map.clear();
        System.out.println("After clear: " + map);
    }
}


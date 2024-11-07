import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> v = new ArrayList<>();
        v.add("apple");
        v.add("banana");
        v.add("apple");
        v.add("orange");
        v.add("apple");

        // Create a map to store the frequency of each string
        Map<String, Integer> m = new HashMap<>();

        // Count the frequency of each item in the list
        for (String x : v) {
            m.put(x, m.getOrDefault(x, 0) + 1); // Increment the count for each string
        }

        // Traverse the map and print the items that appear exactly 3 times
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 3) {
                System.out.println(entry.getKey() + " comes " + entry.getValue() + " times.");
            }
        }
    }
}

package lesson8;

import java.util.HashMap;
import java.util.Map;

public class List {
    public static void main(String[] args) {
        String[] fruits = {
            "Apple",
            "Orange",
            "Cocos",
            "Orange",
            "Watermelon",
            "Papaya",
            "Lime",
            "Kiwi",
            "Lime",
            "Pineapple",
            "Fig",
            "Pear",
            "Lime",
            "Watermelon"
        };

        Map<String, Integer> fruitsMap = new HashMap<>();

        // Iterating over the array of fruits and updating their counts in the map
        for (String fruit : fruits) {
            if (fruitsMap.containsKey(fruit)) {
                fruitsMap.put(fruit, fruitsMap.get(fruit) + 1);
            } else {
                fruitsMap.put(fruit, 1);
            }
        }

        System.out.println("Unique words and their counts:");
        for (Map.Entry<String, Integer> entry : fruitsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

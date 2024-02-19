package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    // Constructor initializing the phone directory as an empty HashMap
    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    // Method to add a phone number to the directory for a given last name
    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, v -> new ArrayList<>()).add(phoneNumber);
    }

    // Method to get a list of phone numbers associated with a given last name
    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, Collections.emptyList());
    }
}

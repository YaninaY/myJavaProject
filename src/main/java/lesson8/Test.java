package lesson8;

public class Test {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Add phones
        phoneDirectory.add("Yastremskaya", "+48-123-456-789");
        phoneDirectory.add("Shishova", "+48-987-654-321");
        phoneDirectory.add("Fedorov", "+48-111-222-333");
        phoneDirectory.add("Fedorov", "+48-111-222-444");
        phoneDirectory.add("Ivanov", "+48-111-222-333");
        phoneDirectory.add("Fedorov", "+48-111-222-555");
        phoneDirectory.add("Fedorov", "+48-111-222-666");

        System.out.println("Output phone number: " + phoneDirectory.get("Yastremskaya"));
        System.out.println("Output phone number: " + phoneDirectory.get("Fedorov"));
    }
}

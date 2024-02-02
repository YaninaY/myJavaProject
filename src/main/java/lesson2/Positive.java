package lesson2;

// Task 2
// To write a method that is passed an integer as a parameter,
// the method should print to the console whether the number passed is positive or negative.
// Note: zero is considered a positive number
public class Positive {
    public static void main(String[] args) {
        check(1);
        check(-2);
    }

    public static void check(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}

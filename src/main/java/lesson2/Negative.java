package lesson2;

// Task 3
// Write a method that takes an integer as a parameter.
// The method should return true if the number is negative, and return false if positive.
// Note: zero is considered a positive number
public class Negative {
    public static void main(String[] args) {
        System.out.println(check(1));
        System.out.println(check(-2));
        System.out.println(check(0));
    }

    public static boolean check(int number) {
        return number < 0;
    }
}

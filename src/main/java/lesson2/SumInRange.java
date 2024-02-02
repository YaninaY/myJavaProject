package lesson2;

// Task 1
// Write a method that takes two integers as input
// and checks that their sum is between 10 and 20 (inclusive),
// if so, return true, otherwise, false
public class SumInRange {
    public static void main(String[] args) {
        System.out.println(check(1, 5));
        System.out.println(check(5, 5));
    }

    public static boolean check(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}

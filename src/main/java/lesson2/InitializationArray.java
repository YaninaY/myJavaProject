package lesson2;

import java.util.Arrays;

// Task 9*
// Write a method that takes two arguments as input: len and initialValue,
// and returns a one-dimensional array of type int with length len, each cell of which is equal to initialValue
public class InitializationArray {
    public static void main(String[] args) {
        int[] arr = createArray(5, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}

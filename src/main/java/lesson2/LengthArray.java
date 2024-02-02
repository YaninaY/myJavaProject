package lesson2;

// Task 6
// Set an empty integer array of length 100.
// Use a loop to fill it with the values 1 2 3 4 5 6 7 8 … 100
public class LengthArray {
    public static void main(String[] args) {
        int[] nums = new int[100];
        fillArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
}

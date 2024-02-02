package lesson2;

// Task 5
// Set an integer array consisting of elements 0 and 1.
// Using a loop and a condition, replace 0 on 1, 1 on 0
public class InvertArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 1, 0, 1 };
        invert(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }
}

package lesson2;

// Task 7
// Set the array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], loop through it,
// and multiply numbers less than 6 by 2
public class MultiplicationArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void multiplication(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }
}
